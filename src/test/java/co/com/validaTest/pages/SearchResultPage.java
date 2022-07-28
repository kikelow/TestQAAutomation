package co.com.validaTest.pages;

import co.com.validaTest.config.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage {

    @FindBy(id = "firstHeading")
    private WebElement labelResult;

    @FindBy(xpath = "//div[@id='toc']/child::ul/child::li//span[@class='toctext']")
    private List<WebElement> listIndice;


    private WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTextLabelResult() {
        Waits.waitExplict(driver, labelResult);
        return labelResult.getText();
    }

    public List<String> getTextLabelsIndices() {
        List<String> listTextIndices = new ArrayList<>();
        for (WebElement webElement : listIndice) {
            listTextIndices.add(webElement.getText());
        }
        return listTextIndices;
    }
}
