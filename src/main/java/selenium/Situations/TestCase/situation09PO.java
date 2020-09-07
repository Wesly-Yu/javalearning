package selenium.Situations.TestCase;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.Situations.BaseDriver.BaseClass;
import selenium.Situations.BaseDriver.BrowserFactory;
import selenium.Situations.PageFactory.TesterHomePage;
import selenium.Situations.cleanLastReport;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

//继承BaseClass
public class situation09PO extends BaseClass {
//    WebDriver driver;
    @BeforeClass
    public void setUp() {
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
    public void testLogin() throws Exception {
        TesterHomePage homePage = new TesterHomePage();
        Thread.sleep(5000);
        System.out.println("------------------------------");
        homePage.clicklogin();
        Thread.sleep(3000);
        homePage.businessLogin("1633235633@qq.com","yp10086");
        homePage.clickloginbtn();
        Thread.sleep(3000);
        homePage.clickuserinfoselect();
        Thread.sleep(1000);
        assertThat(homePage.getusername(),equalTo("YOYO9527"));
        Thread.sleep(3000);
    }
    @AfterClass
    public void tearDown(){
        BrowserFactory browserFactory = BrowserFactory.getInstance();
        browserFactory.closeDriver();

    }
}
