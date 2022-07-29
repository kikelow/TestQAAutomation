package co.com.validaTest.pages;

import co.com.validaTest.config.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.SecureRandom;
import java.util.List;

public class HistoryPage {

    @FindBy(xpath = "//legend/child::span[@class='oo-ui-labelElement-label']")
    private WebElement labelHistoryPage;

    @FindBy(xpath = "//form/child::div/input[contains(@value,'Comparar revisiones seleccionadas')]")
    private WebElement btnCompareSelectedReviews;

    @FindBy(xpath = "//section[@id='pagehistory']/ul/li/child::input[@name='oldid']")
    private List<WebElement> listLeftRadioButton;

    private WebDriver driver;

    public HistoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTextLabelHistoryPage() {
        Waits.waitExplict(driver, labelHistoryPage);
        return labelHistoryPage.getText();
    }

    public void clickOnCampareSelectedReview() {
        btnCompareSelectedReviews.click();
    }

    private void selectRamdonRadioButtonLeft() {
        listLeftRadioButton.remove(1);
        WebElement radioLeft = listLeftRadioButton.get(new SecureRandom().nextInt(listLeftRadioButton.size() - 1));
        if (radioLeft.isDisplayed() && !radioLeft.isSelected()) {
            radioLeft.click();
            selectRamdonRadioButtonRight();
        }
    }

    private void selectRamdonRadioButtonRight() {
        List<WebElement> listRadioRight = driver.findElements(By.xpath("//section[@id='pagehistory']/ul/li/child::input[@name='diff' and not(@disabled)]"));
        listRadioRight.remove(0);
        WebElement radioRight = listRadioRight.get(new SecureRandom().nextInt(listRadioRight.size()-1));
        if (radioRight.isDisplayed() && !radioRight.isSelected()) {
            radioRight.click();
        }

    }

    public void selectRamdonRadioButton() {
        selectRamdonRadioButtonLeft();
    }

}
