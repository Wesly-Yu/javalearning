package selenium.Situations.BaseDriver;

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


    @BeforeClass
    public void setup ()  {
        String mainpath = System.getProperty("user.dir");
        String reportpath = mainpath+"\\allure-results";
        cleanLastReport.deletDir(reportpath);
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",
                webdriverpath);
        //Set Browser to ThreadLocalMap
        driver.set(new ChromeDriver());
    }

    public WebDriver getDriver() {
        //Get driver from ThreadLocalMap
        return driver.get();
    }

    @AfterClass
    public void tearDown() {
        getDriver().quit();
    }

    @AfterClass
    void terminate () {
        //Remove the ThreadLocalMap element
        driver.remove();
    }
}
