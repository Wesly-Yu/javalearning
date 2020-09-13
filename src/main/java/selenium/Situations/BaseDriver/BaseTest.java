package selenium.Situations.BaseDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import selenium.Situations.cleanLastReport;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    //Declare ThreadLocal Driver (ThreadLocalMap) for ThreadSafe Tests
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    Logger logger = Logger.getLogger("BaseTest");

    @BeforeClass
    public void setup ()  {
        String mainpath = System.getProperty("user.dir");
        String reportpath = mainpath+"\\allure-results";
        cleanLastReport.deletDir(reportpath);
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        logger.info("-------"+webdriverpath+"-------");
        System.setProperty("webdriver.chrome.driver",
                webdriverpath);
        //Set Browser to ThreadLocalMap
        driver.set(new ChromeDriver());
    }

    public WebDriver getDriver() {
        //Get driver from ThreadLocalMap
        logger.info("-------getDriver-------");
        return driver.get();
    }

    @AfterMethod
    public void tearDown() {
        logger.info("-------tearDown-------");
        getDriver().quit();
    }

    @AfterClass
    public void terminate () {
        //Remove the ThreadLocalMap element
        logger.info("-------terminate-------");
        driver.remove();
    }
}
