package selenium.Situations.BaseDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.Situations.cleanLastReport;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static selenium.Situations.BaseDriver.GetProperty.getPropertied;

public class BaseClass {
    public WebDriver driver;
    public  static  ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

    public WebDriver initialize_driver(){
        String mainpath = System.getProperty("user.dir");
        String reportpath = mainpath+"\\allure-results";
        cleanLastReport.deletDir(reportpath);
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",webdriverpath);
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        tdriver.set(driver);
        return getDriver();
    }
    public  static  synchronized WebDriver getDriver(){
        return tdriver.get();
    }

//    public void open() throws IOException {
//        String baseurl = getPropertied("baseUrl");
//
//    }
}
