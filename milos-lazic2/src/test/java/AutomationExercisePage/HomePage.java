package AutomationExercisePage;

import AutomationExerciseBase.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Base {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath = "//a[contains(text(),\"Home\")]")
    WebElement homeButton;
    public String homeButtonIsSelected(){
        wdWait.until(ExpectedConditions.visibilityOf(homeButton));
        return homeButton.getAttribute("style=\"color: orange;\"");
    }
    @FindBy(partialLinkText = "Login")
    WebElement logInButton;
    public void logInButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(logInButton)).click();
    }
    @FindBy(xpath = " //a[contains(text(),\"Logged in as \")]")
WebElement loggedInMessage;
    public boolean loggedInMessageIsDisplayed(){
       return wdWait.until(ExpectedConditions.visibilityOf(loggedInMessage)).isDisplayed();
    }
    public String loggedInMessageGetText(){
        return wdWait.until(ExpectedConditions.visibilityOf(loggedInMessage)).getText();
    }

    @FindBy(linkText = "Delete Account")
    WebElement deleteAccountButton;
    public void deleteAccountButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(deleteAccountButton)).click();
    }

    @FindBy(xpath = "//b[text()=\"Account Created!\"]")
    WebElement accountCreatedMessage;

    public boolean accountCreatedMessageIsDisplayed(){
        return wdWait.until(ExpectedConditions.visibilityOf(accountCreatedMessage)).isDisplayed();
    }
    public String accountCreatedMessageGetText(){
        return    wdWait.until(ExpectedConditions.visibilityOf(accountCreatedMessage)).getText();
    }
    @FindBy(linkText = "Continue")
    WebElement continueButton;
    public void continueButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }
    @FindBy(css = ".text-center")
    WebElement accountDeletedMessage;
    public boolean accountDeletedMessageIsDisplayed(){
        return   wdWait.until(ExpectedConditions.visibilityOf(accountDeletedMessage)).isDisplayed();
    }
    public String accountDeletedMessageGetText(){
        return    wdWait.until(ExpectedConditions.visibilityOf(accountDeletedMessage)).getText();
    }
@FindBy(linkText = "Logout")
    WebElement logoutButton;
    public void logoutButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
    }
@FindBy(linkText = "Contact us")
    WebElement contactUsButton;

    public void contactUsButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(contactUsButton)).click();
    }
}



