package steps;

import co.com.validaTest.config.DriverManager;
import co.com.validaTest.controllers.BussinesController;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.After;

public class StepsSearch {

    private BussinesController bussinesController = new BussinesController();
    private DriverManager driverManager = new DriverManager();

    @Before()
    private void setUp() {

    }

    @Dado("^que necesito realizar una busqueda en wikipedia sobre el browser (.*) en la url (.*)$")
    public void que_Necesito_Realizar_Una_Busqueda_En_Wikipedia(String browser, String url) {
        driverManager.launchBroser(browser, url);
        bussinesController.validateAccessAHomePage(driverManager.getDriver());
    }

    @Cuando("^digite en el buscador la palabra (.*)$")
    public void digite_En_El_Buscador_La_Palabra_Criterio_Busqueda(String searchParam) {
        bussinesController.searchInWikipedia(driverManager.getDriver(), searchParam);
        bussinesController.validateAccessPageResult(driverManager.getDriver());
    }

    @Entonces("^encontrare el titulo propuesto para la busqueda$")
    public void encontrare_El_Titulo_Propuesto_Para_La_Busqueda() {
        bussinesController.validateTitleIndice(driverManager.getDriver());
    }


    @After()
    private void finish() {
        driverManager.closeBrowser();
    }

}
