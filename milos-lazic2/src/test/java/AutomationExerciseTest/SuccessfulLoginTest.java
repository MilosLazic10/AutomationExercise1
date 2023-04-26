package AutomationExerciseTest;

import AutomationExerciseBase.Base;
import AutomationExercisePage.HomePage;
import AutomationExercisePage.LoginPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import AutomationExercisePage.SignUpPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class SuccessfulLoginTest extends Base {
 HomePage homePage;
 LoginPage loginPage;

 SignUpPage signUpPage;

    String homePageUrl="https://automationexercise.com/";


 @Before public void setUpTest(){
     homePage= new HomePage();
     loginPage= new LoginPage();
     signUpPage=new SignUpPage();




 }
 @Test
    public void successfulLoginTest(){
     assertEquals(homePageUrl, driver.getCurrentUrl());
     homePage.logInButtonClick();
     assertTrue(loginPage.loginToYourAccountMessageIsDisplayed());
     assertEquals("Login to your account",
             loginPage.loginToYourAccountMessageGetText());
     loginPage.loginEmailInputFieldSendKeys("test66330@testnimail.com")
     .loginPasswordInputFieldSendKeys("test66330")
        .loginButtonClick();
        assertTrue(homePage.loggedInMessageIsDisplayed());
        assertEquals("Logged in as test66330",
                homePage.loggedInMessageGetText());
     homePage.deleteAccountButtonClick();
     driver.navigate().refresh();
     assertTrue(driver.findElements(By.linkText(" Delete Account")).isEmpty());


 }
}
