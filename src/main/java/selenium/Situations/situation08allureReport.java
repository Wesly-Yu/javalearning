package selenium.Situations;

import io.qameta.allure.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class situation08allureReport {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        String mainpath = System.getProperty("user.dir");
        String reportpath = mainpath+"\\allure-results";
        cleanLastReport.deletDir(reportpath);
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",
                webdriverpath);
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
    @Test(priority = 2)
    @Description("UserFavorites test")
    @Epic("QAGP-002")
    @Feature("Feature1:UserFavoritesPage")
    @Story("Story: Valid UserFavorites")
    @Step("Verify UserFavorites")
    @Severity(SeverityLevel.MINOR)
    public void testUserFavorites() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/ul/li[4]/a")).click();
        Thread.sleep(2000);
        javascriptUtil.scrollToBottle(driver);
        Thread.sleep(1000);
        WebElement  tips = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[6]/div[1]"));
        javascriptUtil.scrollIntoView(tips,driver);
        driver.findElement(By.xpath("//*[@title=\"[持续交付实践] 开篇：持续集成&持续交付综述\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"topic-sidebar\"]/div[1]/div/div[1]/div[2]/div/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topic-sidebar\"]/div[1]/div/div[1]/div[1]/a/i")).click();
        Thread.sleep(1000);
        javascriptUtil.scrollToBottle(driver);
        driver.findElement(By.xpath("//*[@id=\"reply_body\"]")).sendKeys("谢谢分享这方面的文章，CI,CD这一块正非常欠缺");
        driver.findElement(By.id("reply-button")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    @Description("UserNoteBook Create and Delete test")
    @Epic("QAGP-003")
    @Feature("Feature1:UserNoteBookCreate")
    @Story("Story: Valid NoteBook")
    @Step("Verify UserNoteBook")
    @Severity(SeverityLevel.MINOR)
    public  void testNewNoteBook() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/a/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='nav user-bar navbar-nav navbar-right']//li[5]//a[1]")).click();
        Thread.sleep(2000);
        String noteBookPage=driver.findElement(By.xpath("//*[@id=\"notes\"]/div[2]/div")).getText();
        assertThat(noteBookPage,equalTo("你还没有创建过一个文件。"));
        driver.findElement(By.xpath("//*[@id=\"homeland-note\"]/div/div[2]/div/div[1]/p/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("note_body")).sendKeys("test note book function");
        driver.findElement(By.name("commit")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"notes\"]/div[1]/div/span/a[2]/i")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String noteBookcount=driver.findElement(By.xpath("//*[@id=\"homeland-note\"]/div/div[2]/div/div[2]")).getText();
        assertThat(noteBookcount,equalTo("查看我的 0 条 Note..."));
    }

    @Test(priority = 4)
    @Description("updateAccountProfile  parameter")
    @Epic("QAGP-004")
    @Feature("Feature1:updateAccountProfile")
    @Story("Story: Valid updateAccountProfile")
    @Step("Verify updateAccountProfile")
    @Severity(SeverityLevel.MINOR)
    public void updateAccountProfile() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/ul/li[3]/a")).click();
        Thread.sleep(2000);
        String simpleProfile = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/ul/li[1]/a/span")).getText();
        assertThat(simpleProfile,equalTo("基本信息"));
        driver.findElement(By.id("user_bio")).clear();
        driver.findElement(By.id("user_bio")).sendKeys("只是测试一下下啦");
        driver.findElement(By.xpath("//*[@id=\"edit_user_15904\"]/div[2]/button")).click();
        String updatesuccess=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]")).getText();
        assertThat(updatesuccess,equalTo("更新成功"));
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    @Description("updateMoreProfile  parameter")
    @Epic("QAGP-005")
    @Feature("Feature1:updateMoreProfile")
    @Story("Story: Valid updateMoreProfile")
    @Step("Verify updateMoreProfile")
    @Severity(SeverityLevel.CRITICAL)
    public void updateMoreProfile() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/ul/li[2]/a/span")).click();
        Thread.sleep(2000);
        String city = driver.findElement(By.xpath("//*[@id=\"edit_user_15904\"]/div[1]/label")).getText();
        assertThat(city,equalTo("城市"));//断言是否进入界面
        driver.findElement(By.id("user_company")).clear();
        driver.findElement(By.id("user_company")).sendKeys("Simens");
        driver.findElement(By.id("user_website")).clear();
        driver.findElement(By.id("user_website")).sendKeys("https://github.com/Wesly-Yu");//https://github.com/Wesly-Yu
        driver.findElement(By.id("user_profile_wechat")).clear();
        driver.findElement(By.id("user_profile_wechat")).sendKeys("女施主老衲给你送茶来啦");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"edit_user_15904\"]/div[10]/button")).click();

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        System.out.println("It's test over to quit");
        Thread.sleep(3000);
        driver.quit();
    }
}
