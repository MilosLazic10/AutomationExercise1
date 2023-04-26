package AutomationExercisePage;

import AutomationExerciseBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends Base {
    public SignUpPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//b[text()=\"Enter Account Information\"]")
    WebElement enterAccountInformationMessage;

    public boolean enterAccountInformationMessageIsDisplayed(){
      return   wdWait.until(ExpectedConditions.visibilityOf(enterAccountInformationMessage)).isDisplayed();
    }
    public String enterAccountInformationMessageGetText(){
        return  wdWait.until(ExpectedConditions.visibilityOf(enterAccountInformationMessage)).getText();

    }
    @FindBy(id = "id_gender1")
    WebElement genderMale;
    public SignUpPage genderMaleClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(genderMale)).click();
        return this;
    }
    @FindBy(id = "password")
    WebElement passwordInputField;
    public SignUpPage passwordInputFieldSendKeys(String password){
        wdWait.until(ExpectedConditions.elementToBeClickable(passwordInputField)).clear();
        passwordInputField.sendKeys(password);
        return this;
    }
@FindBy(id = "days")
    WebElement dayOfBirthDropdown;
    public SignUpPage dayOfBirthDropdownSelect(){
        wdWait.until(ExpectedConditions.elementToBeClickable(dayOfBirthDropdown)).isEnabled();
        Select dayOfBirthDropdown= new Select(driver.findElement(By.id("days")));
        dayOfBirthDropdown.selectByValue("6");
        return this;
    }
    @FindBy(id = "months")
    WebElement monthOfBirthDropdown;
    public SignUpPage monthOfBirthDropdownSelect (){
        wdWait.until(ExpectedConditions.elementToBeClickable(monthOfBirthDropdown)).isEnabled();
        Select monthOfBirthDropdown= new Select(driver.findElement(By.id("months")));
        monthOfBirthDropdown.selectByValue("5");
        return this;
    }
@FindBy(id = "years")
    WebElement yearOfBirthDropdown;
    public SignUpPage yearOfBirthDropdownSelect(){
        wdWait.until(ExpectedConditions.elementToBeClickable(yearOfBirthDropdown)).isEnabled();
        Select yearOfBirthDropdown= new Select(driver.findElement(By.id("years")));
        yearOfBirthDropdown.selectByValue("2021");
        return this;
    }

@FindBy(id = "newsletter")
    WebElement newletterCheckbox;
    public SignUpPage newletterCheckboxClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(newletterCheckbox)).click();
        return this;
    }
    @FindBy(id = "optin")
    WebElement specialOffersCheckbox;
    public SignUpPage specialOffersCheckboxClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(specialOffersCheckbox)).click();
        return this;

    }
    @FindBy(id = "first_name")
    WebElement firstNameInputField;
    public SignUpPage firstNameInputFieldSendKeys(String firstname){
        wdWait.until(ExpectedConditions.elementToBeClickable(firstNameInputField)).clear();
        firstNameInputField.sendKeys(firstname);
        return this;
    }
@FindBy(id = "last_name")
    WebElement lastNameInputField;
    public SignUpPage lastNameInputFieldSendKeys(String lastname){
        wdWait.until(ExpectedConditions.elementToBeClickable(lastNameInputField)).clear();
        lastNameInputField.sendKeys(lastname);
        return this;
    }

@FindBy(id = "company")
    WebElement companyInputField;
    public SignUpPage companyInputFieldSendKeys(String company){
        wdWait.until(ExpectedConditions.elementToBeClickable(companyInputField)).clear();
        companyInputField.sendKeys(company);
        return this;
    }
@FindBy(id = "address1")
    WebElement adress1InputField;
    public SignUpPage adress1InputFieldSendKeys(String adress1){
        wdWait.until(ExpectedConditions.elementToBeClickable(adress1InputField)).clear();
        adress1InputField.sendKeys(adress1);
        return this;
    }
@FindBy (id = "address2")
    WebElement adress2InputField;
    public SignUpPage adress2InputFieldSendKeys(String adress2){
        wdWait.until(ExpectedConditions.elementToBeClickable(adress2InputField)).clear();
        adress2InputField.sendKeys(adress2);
        return this;
    }
@FindBy (id = "country")
    WebElement countryDropdown;
    public SignUpPage countryDropdownSelect(){
        wdWait.until(ExpectedConditions.elementToBeClickable(countryDropdown)).isEnabled();
        Select countryDropdown= new Select(driver.findElement(By.id("country")));
        countryDropdown.selectByValue("New Zealand");
        return this;
    }
    @FindBy(id = "state")
    WebElement stateInputField;
    public SignUpPage stateInputFieldSendKeys(String state){
        wdWait.until(ExpectedConditions.elementToBeClickable(stateInputField)).clear();
        stateInputField.sendKeys(state);
        return this;
    }
@FindBy(id = "zipcode")
    WebElement zipcodeInputField;
    public SignUpPage zipcodeInputFieldSendKeys(String zipcode){
        wdWait.until(ExpectedConditions.elementToBeClickable(zipcodeInputField)).clear();
        zipcodeInputField.sendKeys(zipcode);
        return this;
    }
    @FindBy(id = "city")
    WebElement cityInputField;
    public SignUpPage cityInputFieldSendKeys(String city){
        wdWait.until(ExpectedConditions.elementToBeClickable(cityInputField)).clear();
        cityInputField.sendKeys(city);
        return this;
    }
@FindBy(id = "mobile_number")
    WebElement mobileNumberInputField;
    public SignUpPage mobileNumberInputFieldSendKeys(String mobile){
        wdWait.until(ExpectedConditions.elementToBeClickable(mobileNumberInputField)).clear();
        mobileNumberInputField.sendKeys(mobile);
        return this;

    }
@FindBy(xpath = "//button[text()=\"Create Account\"]")
    WebElement createAccountButton;
    public void createAccountButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).click();
    }

}
