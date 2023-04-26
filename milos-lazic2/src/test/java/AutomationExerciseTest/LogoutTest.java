package AutomationExerciseTest;

import AutomationExerciseBase.Base;
import AutomationExercisePage.HomePage;
import AutomationExercisePage.LoginPage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LogoutTest extends Base {
    HomePage homePage;
    LoginPage loginPage;
    String homePageUrl="https://automationexercise.com/";
    String loginPageUrl="https://automationexercise.com/login";


    @Before
    public void setUpTest(){
        homePage=new HomePage();
        loginPage=new LoginPage();

    }
    @Test
    public void logoutTest(){

        assertEquals(homePageUrl, driver.getCurrentUrl());
        homePage.logInButtonClick();
        assertTrue(loginPage.loginToYourAccountMessageIsDisplayed());
        assertEquals("Login to your account",
                loginPage.loginToYourAccountMessageGetText());
        loginPage.loginEmailInputFieldSendKeys("test20703@testnimail.com")
                .loginPasswordInputFieldSendKeys("test20703")
                .loginButtonClick();
        assertTrue(homePage.loggedInMessageIsDisplayed());
        assertEquals("Logged in as test20703",
                homePage.loggedInMessageGetText());
        homePage.logoutButtonClick();
        assertEquals(loginPageUrl, driver.getCurrentUrl());
    }
}
