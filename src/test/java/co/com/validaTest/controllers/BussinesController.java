package co.com.validaTest.controllers;

import co.com.validaTest.pages.CreateAccountPage;
import co.com.validaTest.pages.HistoryPage;
import co.com.validaTest.pages.HomePage;
import co.com.validaTest.pages.SearchResultPage;
import co.com.validaTest.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class BussinesController {

    public void changeToMobileWebview(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLinkMobileVersion();
    }

    public void changeToDesktopWebview(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLinkDesktopVersion();
    }

    public void goToWelcomePage(WebDriver driver){
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.clikOnLinkPortada();
    }
    public void validateAccessAHomePage(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals("El texto obtenido no coincide con el esperado", Constants.LABEL_WELCOME, homePage.getTextFromLabelWelcome());
    }

    public void searchInWikipedia(WebDriver driver, String searchParam) {
        HomePage homePage = new HomePage(driver);
        homePage.sendText(searchParam);
        homePage.sendText(searchParam);
    }

    public void validateAccessPageResult(WebDriver driver) {
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertEquals("El texto obtenido no coincide con el esperado", Constants.LABEL_TITLE_SEARCH_SYSTEM, searchResultPage.getTextLabelResult());
    }

    public void validateTitleIndice(WebDriver driver) {
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        List<String> listStringIndice = searchResultPage.getTextLabelsIndices();
        Assert.assertTrue("La opcion buscada en el indice, no se encuentra activa", listStringIndice.contains(Constants.LABEL_TITLE_INDICE));
    }

    public void goToCreateAccount(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLinkCreateAccount();
    }

    public void validateAccesToCreateAccountPage(WebDriver driver) {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        Assert.assertEquals("El texto obtenido no coincide con el esperado", Constants.LABEL_TITLE_CREATE_ACCOUNT_PAGE, createAccountPage.getTextLabelCreateAccount());
    }

    public void inputUser(WebDriver driver, String user) {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.inputUser(user);
    }

    public void inputPassword(WebDriver driver, String password) {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.inputPasswword(password);
    }

    public void inputConfirmPassword(WebDriver driver, String confirmPassword) {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.inputPasswordConfirmation(confirmPassword);
    }

    public void inputEmail(WebDriver driver, String email) {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.inputEmail(email);
    }

    public void validateErrorMessageForUserInvalid(WebDriver driver, String errorMessage) {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        Assert.assertEquals("El texto obtenido no coincide con el esperado", errorMessage, createAccountPage.getTextDivWrongUser());
    }

    public void validateErrorMessageForPasswordInvalid(WebDriver driver, String errorMessage) {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        Assert.assertEquals("El texto obtenido no coincide con el esperado", errorMessage, createAccountPage.getTextDivWrongPassword());
    }

    public void gotoHistotySection(WebDriver driver) {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLinkHistory();
    }

    public void validateAccessToHistoryPage(WebDriver driver){
        HistoryPage historyPage = new HistoryPage(driver);
        Assert.assertEquals("El texto obtenido no coincide con el esperado", Constants.LABEL_HISTORY_PAGE, historyPage.getTextLabelHistoryPage());

    }

    public void selectOptionsFromHistory(WebDriver driver){
        HistoryPage historyPage = new HistoryPage(driver);
        historyPage.selectRamdonRadioButton();
    }

    public void compareSelectedReviews(WebDriver driver){
        HistoryPage historyPage = new HistoryPage(driver);
        historyPage.clickOnCampareSelectedReview();
    }
}
