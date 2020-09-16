package selenium.Situations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class situation09multiThread {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        String mainpath = System.getProperty("user.dir");
        String reportpath = mainpath+"\\allure-results";
        cleanLastReport.deletDir(reportpath);
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        System.out.println(webdriverpath);
        System.setProperty("webdriver.chrome.driver",
                webdriverpath);
        driver = new ChromeDriver();

    }
    @Test
    public void test01(){
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void test02(){
        driver.get("http://www.imooc.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void test03(){
        driver.get("http://gaoqing.la/");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        System.out.println("It's test over to quit");
        Thread.sleep(3000);
        driver.quit();
    }
}
