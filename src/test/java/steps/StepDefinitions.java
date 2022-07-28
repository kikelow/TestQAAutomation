package steps;

import co.com.validaTest.config.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class StepDefinitions {

    private DriverManager driverManager;

    @Before()
    private void setUp() {
        driverManager = new DriverManager();
    }





    @After()
    private void finish(){
        driverManager.closeBrowser();
    }


}
