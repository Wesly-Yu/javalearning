package selenium.Situations.BaseDriver;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import selenium.Situations.cleanLastReport;


public class BaseDriver {
    //Declare ThreadLocal Driver (ThreadLocalMap) for ThreadSafe Tests
    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();


    @BeforeClass
    public void SetUp ()  {
        String mainpath = System.getProperty("user.dir");
        String reportpath = mainpath+"\\allure-results";
        cleanLastReport.deletDir(reportpath);
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        System.out.println(webdriverpath);
        System.setProperty("webdriver.chrome.driver",
                webdriverpath);
        //Set Browser to ThreadLocalMap
        driver.set(new ChromeDriver());
    }

    public WebDriver getDriver() {
        //Get driver from ThreadLocalMap
        return driver.get();
    }

    @AfterMethod
    public void tearDown() {
//        logger.info("-------tearDown-------");
        getDriver().quit();
    }

    @AfterClass
    void terminate () {
        //Remove the ThreadLocalMap element
//        logger.info("-------terminate-------");
        driver.remove();
    }
}
