package selenium.Situations.TestCase;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.Situations.BaseDriver.BaseClass;
import selenium.Situations.BaseDriver.DriverFactory;
import selenium.Situations.cleanLastReport;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

//继承BaseClass
public class situation09PO {
    @BeforeClass
    public void setUp(){
//        String mainpath = System.getProperty("user.dir");
//        String reportpath = mainpath+"\\allure-results";
//        cleanLastReport.deletDir(reportpath);
//        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
//        System.out.println(webdriverpath);
//        System.setProperty("webdriver.chrome.driver",webdriverpath);
        WebDriver driver = DriverFactory.getInstance().getDriver();
        driver.get("https://testerhome.com");
        driver.manage().window().maximize();

    }
    @Test(priority = 1)
    @Description("login test")
    @Epic("QAGP-001")
    @Feature("Feature1:LoginPage")
    @Story("Story: Valid login")
    @Step("Verify login")
    @Severity(SeverityLevel.BLOCKER)
    public void testLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("user_login")).sendKeys("1633235633@qq.com");
        driver.findElement(By.id("user_password")).sendKeys("yp10086");
        driver.findElement(By.name("commit")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/a/img")).click();
        String accountname = driver.findElement(By.xpath("//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/ul/li[1]/a")).getText();
        assertThat(accountname,equalTo("YOYO9527"));
        System.out.println(accountname);
        Thread.sleep(3000);
    }
}
