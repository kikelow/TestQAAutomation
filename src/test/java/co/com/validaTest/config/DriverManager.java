package co.com.validaTest.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverManager {

    private Log log = LogFactory.getLog(DriverManager.class);

    public void launchBroser(String browser,String url){
        try {
            WebDriver webdriver = getDriverInstance(browser);
            webdriver.get(url);
        }catch (NullPointerException e){
            log.error("No instance for webdriverFound" , e);

        }
    }

    private WebDriver getDriverInstance(String browser){
        WebDriver driver = null;
        switch(browser.toUpperCase()){
            case "CHROME" :
                System.setProperty("webdriver.chrome.driver", "src/test/resources/Utils/drivers/chrome/chromedriver.exe");
                 driver = new ChromeDriver();
                break;
            case "EDGE" :
                System.setProperty("webdriver.edge.driver", "src/test/resources/Utils/drivers/edge/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            default:
            log.info("No entro un valor para un Browser valido.");
        }
        return driver;
    }

    public static void main(String[] args) {
        DriverManager driverManager = new DriverManager();
        driverManager.launchBroser("chrome","https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }
}
