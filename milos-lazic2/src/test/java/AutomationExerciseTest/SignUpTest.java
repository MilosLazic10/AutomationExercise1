package AutomationExerciseTest;

import AutomationExerciseBase.Base;
import AutomationExercisePage.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class SignUpTest extends Base {
    HomePage homePage;
    LoginPage loginPage;
    SignUpPage signUpPage;



    Random random= new Random();
    String name= "test"+ random.nextInt(99999);
    String email= name + "@testnimail.com";
    String password= name;
    String firstName= "someName";
    String lastName= "lastName";
    String company= "yahoo";
    String address1= "roadtoNY1";
    String address2="roadtoNY2";
    String state="MiddleEarth";
    String city="Shire";
    String zipcode= "99542";
    String mobile= "9949564299";

    String loggedInMessage="Logged in as " + name;

    @Before
    public void setUpTest(){
        homePage=new HomePage();
        loginPage=new LoginPage();
        signUpPage=new SignUpPage();


    }
    @Test
    public void signUpTest(){
        homePage.homeButtonIsSelected();
        homePage.logInButtonClick();
        assertTrue(loginPage.signUpMessageIsDisplayed());
        assertEquals("New User Signup!",
                loginPage.signUpMessageGetText());
      loginPage.nameInputFieldSendKeys(name)
              .signupEmailInputFieldSendKeys(email)
              .signUpButtonClick();
      assertTrue(signUpPage.enterAccountInformationMessageIsDisplayed());
      assertEquals("ENTER ACCOUNT INFORMATION",
              signUpPage.enterAccountInformationMessageGetText());
      signUpPage.genderMaleClick()
              .passwordInputFieldSendKeys(password)
              .dayOfBirthDropdownSelect()
              .monthOfBirthDropdownSelect()
              .yearOfBirthDropdownSelect()
              .newletterCheckboxClick()
              .specialOffersCheckboxClick()
              .firstNameInputFieldSendKeys(firstName)
              .lastNameInputFieldSendKeys(lastName)
              .companyInputFieldSendKeys(company)
              .adress1InputFieldSendKeys(address1)
              .adress2InputFieldSendKeys(address2)
              .countryDropdownSelect()
              .stateInputFieldSendKeys(state)
              .cityInputFieldSendKeys(city)
              .zipcodeInputFieldSendKeys(zipcode)
              .mobileNumberInputFieldSendKeys(mobile)
              .createAccountButtonClick();
      assertTrue(homePage.accountCreatedMessageIsDisplayed());
      assertEquals("ACCOUNT CREATED!",
              homePage.accountCreatedMessageGetText());
        homePage.continueButtonClick();
      driver.navigate().refresh();
        homePage.continueButtonClick();
        assertTrue(homePage.loggedInMessageIsDisplayed());
        assertEquals(loggedInMessage,
                homePage.loggedInMessageGetText());
       homePage.deleteAccountButtonClick();
     assertTrue(homePage.accountDeletedMessageIsDisplayed());
     assertEquals("ACCOUNT DELETED!",
             homePage.accountDeletedMessageGetText());
        homePage.continueButtonClick();

    }
}
