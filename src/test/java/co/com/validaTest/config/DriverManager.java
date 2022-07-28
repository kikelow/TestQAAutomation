package co.com.validaTest.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverManager {

    private WebDriver driver;

    private Log log = LogFactory.getLog(DriverManager.class);

    public WebDriver getDriver(){
        return driver;
    }

    public void launchBroser(String browser,String url){
        try {
            driver = getDriverInstance(browser);
            driver.manage().window().maximize();
            driver.get(url);
        }catch (NullPointerException e){
            log.error("No instance for webdriverFound" , e);

        }
    }

    private WebDriver getDriverInstance(String browser){
        WebDriver driver = null;
        switch(browser.toUpperCase()){
            case "CHROME" :
                System.setProperty("webdriver.chrome.driver", "src/test/resources/Utils/drivers/chrome/chromedriver.exe");
                ChromeOptions chromeOption = new ChromeOptions();
                chromeOption.addArguments("incognito");
                chromeOption.addArguments("disable-popup-blocking");
                 driver = new ChromeDriver(chromeOption);
                break;
            case "EDGE" :
                System.setProperty("webdriver.edge.driver", "src/test/resources/Utils/drivers/edge/msedgedriver.exe");
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.setCapability("InPrivate", true);
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
            log.info("No entro un valor para un Browser valido.");
        }
        return driver;
    }

    public void closeBrowser(){
        driver.quit();
    }


}
