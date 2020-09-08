package selenium.Situations.TestCase;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.Situations.BaseDriver.BaseClass;
import selenium.Situations.BaseDriver.BaseTest;
import selenium.Situations.BaseDriver.BrowserFactory;
import selenium.Situations.PageFactory.TesterHomePage;
import selenium.Situations.cleanLastReport;
import selenium.Situations.javascriptUtil;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

//继承BaseClass
public class situation09PO extends BaseTest {
//    WebDriver driver;

    @Test()
    @Description("login test")
    @Epic("QAGP-001")
    @Feature("Feature1:LoginPage")
    @Story("Story: Valid login")
    @Step("Verify login")
    @Severity(SeverityLevel.BLOCKER)
    public void testLogin() throws Exception {
        getDriver().navigate().to("https://testerhome.com");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        TesterHomePage homePage = new TesterHomePage();
        System.out.println("------------------------------");
        homePage.clicklogin();
        Thread.sleep(2000);
        homePage.businessLogin("1633235633@qq.com","yp10086");
        homePage.clickloginbtn();
        Thread.sleep(2000);
        homePage.clickuserinfoselect();
        Thread.sleep(1000);
        assertThat(homePage.getusername(),equalTo("YOYO9527"));
        Thread.sleep(2000);
        homePage.clickuserinfoselect();
    }
//    @Test(priority = 2)
//    @Description("UserFavorites test")
//    @Epic("QAGP-002")
//    @Feature("Feature1:UserFavoritesPage")
//    @Story("Story: Valid UserFavorites")
//    @Step("Verify UserFavorites")
//    @Severity(SeverityLevel.MINOR)
//    public void testUserFavorites() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/ul/li[4]/a")).click();
//        Thread.sleep(2000);
//        javascriptUtil.scrollToBottle(driver);
//        Thread.sleep(1000);
//        WebElement tips = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[6]/div[1]"));
//        javascriptUtil.scrollIntoView(tips,driver);
//        driver.findElement(By.xpath("//*[@title=\"[持续交付实践] 开篇：持续集成&持续交付综述\"]")).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@id=\"topic-sidebar\"]/div[1]/div/div[1]/div[2]/div/a[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"topic-sidebar\"]/div[1]/div/div[1]/div[1]/a/i")).click();
//        Thread.sleep(1000);
//        javascriptUtil.scrollToBottle(driver);
//        driver.findElement(By.xpath("//*[@id=\"reply_body\"]")).sendKeys("谢谢分享这方面的文章，CI,CD这一块正非常欠缺");
//        driver.findElement(By.id("reply-button")).click();
//        Thread.sleep(2000);
//    }

}
