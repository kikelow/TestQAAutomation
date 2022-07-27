package co.com.validaTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "Bienvenidos_a_Wikipedia,")
    private WebElement labelWelcome;

    @FindBy(xpath = "//li[@id='pt-createaccount']/child::a,")
    private WebElement linkCreateAccount;

    @FindBy(xpath = "//li[@id='ca-history']/child::a,")
    private WebElement linkShowHistory;

    @FindBy(xpath = "//li[@id='footer-places-mobileview']/child::a,")
    private WebElement linkMobileVersion;

    @FindBy(xpath = "//li[@id='footer-places-desktop-toggle']/child::a,")
    private WebElement linkDesktopVersion;

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,HomePage.class);
    }



}
