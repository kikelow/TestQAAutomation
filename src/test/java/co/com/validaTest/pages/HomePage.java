package co.com.validaTest.pages;

import co.com.validaTest.config.Waits;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "Bienvenidos_a_Wikipedia,")
    private WebElement labelWelcome;

    @FindBy(xpath = "//li[@id='pt-createaccount']/child::a")
    private WebElement linkCreateAccount;

    @FindBy(xpath = "//li[@id='ca-history']/child::a")
    private WebElement linkShowHistory;

    @FindBy(xpath = "//li[@id='footer-places-mobileview']/child::a")
    private WebElement linkMobileVersion;

    @FindBy(xpath = "//li[@id='footer-places-desktop-toggle']/child::a")
    private WebElement linkDesktopVersion;

    @FindBy(id = "searchInput")
    private WebElement txtSearch;

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getTextFromLabelWelcome(){
        Waits.waitExplict(driver,labelWelcome);
        return labelWelcome.getText();
    }

    public void clickOnLinkCreateAccount(){
        linkCreateAccount.click();
    }

    public void clickOnLinkHistory(){
        linkShowHistory.click();
    }

    public void clickOnLinkMobileVersion(){
        linkMobileVersion.click();
    }

    public void clickOnLinkDesktopVersion(){
        linkDesktopVersion.click();
    }

    public void sendText(String searchParam){
        txtSearch.sendKeys(searchParam);
        Waits.waitExplict(driver,txtSearch);
        txtSearch.sendKeys(Keys.ENTER);
    }
}
