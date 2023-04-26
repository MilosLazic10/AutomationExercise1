package AutomationExercisePage;

import AutomationExerciseBase.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends Base {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[text()=\"Login to your account\"]")
    WebElement loginToYourAccountMessage;

    public boolean loginToYourAccountMessageIsDisplayed(){
      return wdWait.until(ExpectedConditions.visibilityOf(loginToYourAccountMessage)).isDisplayed();

    }
    public String loginToYourAccountMessageGetText(){
       return   wdWait.until(ExpectedConditions.visibilityOf(loginToYourAccountMessage)).getText();

    }
    @FindBy(xpath = "//h2[text()=\"New User Signup!\"]")
    WebElement signUpMessage;

    public boolean signUpMessageIsDisplayed(){
      return   wdWait.until(ExpectedConditions.visibilityOf(signUpMessage)).isDisplayed();
    }
    public String signUpMessageGetText (){
     return    wdWait.until(ExpectedConditions.visibilityOf(signUpMessage)).getText();

    }
    @FindBy(css = "input[data-qa=\"signup-name\"]")
    WebElement nameInputField;
    public LoginPage nameInputFieldSendKeys (String name){
        wdWait.until(ExpectedConditions.elementToBeClickable(nameInputField)).clear();
        nameInputField.sendKeys(name);
        return this;
    }
    @FindBy(css = "input[data-qa=\"signup-email\"]")
    WebElement signupEmailInputField;
    public LoginPage signupEmailInputFieldSendKeys(String email){
        wdWait.until(ExpectedConditions.elementToBeClickable(signupEmailInputField)).clear();
        signupEmailInputField.sendKeys(email);
        return this;
    }
    @FindBy(xpath = "//button[text()=\"Signup\"]")
    WebElement signUpButton;
    public LoginPage signUpButtonClick()  {
        wdWait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
        return this;
    }

    @FindBy(css = "button[data-qa=\"login-button\"]")
    WebElement loginButton;
    public void loginButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    @FindBy(css = "input[data-qa=\"login-email\"]")
    WebElement loginEmailInputField;
    public LoginPage loginEmailInputFieldSendKeys(String loginEmail){
        wdWait.until(ExpectedConditions.elementToBeClickable(loginEmailInputField)).clear();
        loginEmailInputField.sendKeys(loginEmail);
        return this;
    }

    @FindBy(name = "password")
    WebElement loginPasswordInputField;

    public LoginPage loginPasswordInputFieldSendKeys(String loginPassword){
        wdWait.until(ExpectedConditions.elementToBeClickable(loginPasswordInputField)).clear();
        loginPasswordInputField.sendKeys(loginPassword);
        return this;
    }

    @FindBy(xpath = "//p[contains(text(),\"incorrect!\")]")
    WebElement incorrectEmailOrPasswordMessage;
    public boolean incorrectEmailOrPasswordMessageIsDisplayed(){
      return   wdWait.until(ExpectedConditions.visibilityOf(incorrectEmailOrPasswordMessage)).isDisplayed();
    }

    public String incorrectEmailOrPasswordMessageGetText(){
      return   wdWait.until(ExpectedConditions.visibilityOf(incorrectEmailOrPasswordMessage)).getText();
    }
    @FindBy(xpath = "//p[text()=\"Email Address already exist!\"]")
    WebElement emailAlreadyExistingMessage;

    public boolean emailAlreadyExistingMessageIsDisplayed(){
     return   wdWait.until(ExpectedConditions.visibilityOf(emailAlreadyExistingMessage)).isDisplayed();
    }
    public String emailAlreadyExistingMessageGetText(){
      return   wdWait.until(ExpectedConditions.visibilityOf(emailAlreadyExistingMessage)).getText();
    }
}
