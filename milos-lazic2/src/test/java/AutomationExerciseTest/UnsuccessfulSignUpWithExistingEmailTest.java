package AutomationExerciseTest;

import AutomationExerciseBase.Base;
import AutomationExercisePage.HomePage;
import AutomationExercisePage.LoginPage;
import AutomationExercisePage.SignUpPage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnsuccessfulSignUpWithExistingEmailTest extends Base {
    HomePage homePage;
    LoginPage loginPage;

    String homePageUrl="https://automationexercise.com/";

    @Before
    public void setUpTest(){
        homePage=new HomePage();
        loginPage=new LoginPage();
    }

    @Test
    public void unsuccessfulSignUpWithExistingEmailTest(){

        assertEquals(homePageUrl, driver.getCurrentUrl());
        homePage.logInButtonClick();
        assertTrue(loginPage.signUpMessageIsDisplayed());
        assertEquals("New User Signup!",
                loginPage.signUpMessageGetText());
        loginPage.nameInputFieldSendKeys("testname")
                .signupEmailInputFieldSendKeys("test20703@testnimail.com")
                .signUpButtonClick();
        assertTrue(loginPage.emailAlreadyExistingMessageIsDisplayed());
        assertEquals("Email Address already exist!",
                loginPage.emailAlreadyExistingMessageGetText());
    }
}
