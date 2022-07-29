package steps;

import co.com.validaTest.config.DriverManager;
import co.com.validaTest.controllers.BussinesController;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class StepsCreateAccount {

    private BussinesController bussinesController = new BussinesController();
    private DriverManager driverManager = new DriverManager();

    @Before()
    private void setUp() {

    }

    @Dado("^que quiero inscribirme en wikipedia a traves del browser (.*) por la url (.*)$")
    public void queQuieroInscribirmeEnWikipediaATravesDelBrowserBrowserPorLaUrlUrl(String browser,String url) {
        driverManager.launchBroser(browser, url);
        bussinesController.validateAccessAHomePage(driverManager.getDriver());
    }

    @Cuando("^haga click en la opcion crear cuenta$")
    public void hagaClickEnLaOpcionCrearCuenta() {
        bussinesController.goToCreateAccount(driverManager.getDriver());
        bussinesController.validateAccesToCreateAccountPage(driverManager.getDriver());
    }

    @Y("^ingrese mi usuario (.*)$")
    public void ingreseMiUsuarioUser(String user) {
        bussinesController.inputUser(driverManager.getDriver(), user);
    }

    @Y("^ingrese mi password (.*)$")
    public void ingreseMiPasswordPassword(String password) {
        bussinesController.inputPassword(driverManager.getDriver(), password);
    }

    @Y("^confirmacion de password (.*)$")
    public void confirmacionDePasswordConfirmationPassword(String confirmationPass) {
        bussinesController.inputConfirmPassword(driverManager.getDriver(), confirmationPass);
    }

    @Entonces("^ingresare mi correo (.*)$")
    public void ingresareMiMiCorreoEmail(String email) {
        bussinesController.inputEmail(driverManager.getDriver(), email);
    }

    @Y("^ingrese el usuario invalido (.*)$")
    public void ingreseMiUsuarioInvalidoUser(String user) {
        bussinesController.inputUser(driverManager.getDriver(), user);
    }

    @Entonces("^se mostrara un mensaje de error (.*)$")
    public void seMostroraUnMensajeDeErrorErrorMessage(String errorMessage) {
        bussinesController.validateErrorMessageForUserInvalid(driverManager.getDriver(), errorMessage);
    }

    @Y("^ingrese mi contraseña invalida (.*)$")
    public void ingreseMiContraseñaInvalidaPassword(String password) {
        bussinesController.inputPassword(driverManager.getDriver(), password);
    }

    @Entonces("^se mostrara el mensaje de error (.*)$")
    public void seMostraraElMensajeDeErrorErrorMessage(String errorMessage) {
        bussinesController.validateErrorMessageForPasswordInvalid(driverManager.getDriver(), errorMessage);
    }

    @After()
    private void finish() {
        driverManager.closeBrowser();
    }
}
