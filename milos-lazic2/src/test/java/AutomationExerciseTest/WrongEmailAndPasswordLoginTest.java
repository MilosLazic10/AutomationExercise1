package AutomationExerciseTest;

import AutomationExerciseBase.Base;
import AutomationExercisePage.HomePage;
import AutomationExercisePage.LoginPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class WrongEmailAndPasswordLoginTest extends Base {
    HomePage homePage;
    LoginPage loginPage;

    String homePageUrl="https://automationexercise.com/";

    @Before
    public void setUpTest(){
        homePage=new HomePage();
        loginPage=new LoginPage();
    }
    @Test
    public void wrongEmailAndPasswordLoginTest(){
        assertEquals(homePageUrl, driver.getCurrentUrl());
        homePage.logInButtonClick();
        assertTrue(loginPage.loginToYourAccountMessageIsDisplayed());
        assertEquals("Login to your account",
                loginPage.loginToYourAccountMessageGetText());
        loginPage.loginEmailInputFieldSendKeys("abcd@mail.com")
                .loginPasswordInputFieldSendKeys("dasdas")
                .loginButtonClick();
        assertTrue(loginPage.incorrectEmailOrPasswordMessageIsDisplayed());
        assertEquals("Your email or password is incorrect!",
                loginPage.incorrectEmailOrPasswordMessageGetText());


    }
}
