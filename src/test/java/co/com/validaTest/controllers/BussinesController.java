package co.com.validaTest.controllers;

import co.com.validaTest.pages.HomePage;
import co.com.validaTest.pages.SearchResultPage;
import co.com.validaTest.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class BussinesController {

    public void validateAccessAHomePage(WebDriver driver){
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals("El texto obtenido no coincide con el esperado", Constants.LABEL_WELCOME,homePage.getTextFromLabelWelcome());
    }

    public void searchInWikipedia(WebDriver driver, String searchParam){
        HomePage homePage = new HomePage(driver);
        homePage.sendText(searchParam);
        homePage.sendText(searchParam);
    }
    public void validateAccessPageResult(WebDriver driver){
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertEquals("El texto obtenido no coincide con el esperado", Constants.LABEL_TITLE_SEARCH_SYSTEM,searchResultPage.getTextLabelResult());
    }

    public void validateTitleIndice(WebDriver driver){
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        List<String> listStringIndice = searchResultPage.getTextLabelsIndices();
        Assert.assertTrue("La opcion buscada en el indice, no se encuentra activa", listStringIndice.contains(Constants.LABEL_TITLE_INDICE));
    }

}
