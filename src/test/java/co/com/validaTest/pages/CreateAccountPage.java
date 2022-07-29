package co.com.validaTest.pages;

import co.com.validaTest.config.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

    @FindBy(id = "firstHeading")
    private WebElement labelCreateAccount;

    @FindBy(id = "wpName2")
    private WebElement txtUser;

    @FindBy(xpath = "//input[@id='wpName2']/following-sibling::div")
    private WebElement divMsgWrongUser;

    @FindBy(id = "wpPassword2")
    private WebElement txtPassword;

    @FindBy(id = "wpRetype")
    private WebElement txtConfirmPassword;

    @FindBy(id = "wpEmail")
    private WebElement txtEmail;

    private WebDriver driver;

    public CreateAccountPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getTextLabelCreateAccount(){
        Waits.waitExplict(driver,labelCreateAccount);
        return labelCreateAccount.getText();
    }

    public void inputUser(String user){
        txtUser.sendKeys(user);
    }

    public void inputPasswword(String password){
        txtPassword.sendKeys(password);
    }

    public void inputPasswordConfirmation(String password){
        txtConfirmPassword.sendKeys(password);
    }

    public void inputEmail(String email){
        txtEmail.sendKeys(email);
    }

    public String getTextDivWrongPassword(){
        Waits.waitForElemenPresent(driver,By.xpath("//input[@id='wpPassword2']/following-sibling::div[contains(@class,'error')]"));
        WebElement divWrongPassword = driver.findElement(By.xpath("//input[@id='wpPassword2']/following-sibling::div[contains(@class,'error')]"));
        return divWrongPassword.getText();
    }

    public String getTextDivWrongUser(){
        Waits.waitForElemenPresent(driver,By.xpath("//input[@id='wpName2']/following-sibling::div[contains(@class,'error')]"));
        WebElement divWrongUser = driver.findElement(By.xpath("//input[@id='wpName2']/following-sibling::div[contains(@class,'error')]"));
        return divWrongUser.getText();
    }
}
