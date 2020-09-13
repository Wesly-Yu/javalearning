package selenium.Situations.TestCase;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import selenium.Situations.Operator.loginOperator;

import static org.hamcrest.MatcherAssert.assertThat;

//继承BaseClass
public class TestPageFactory{


    @Test()
    @Description("login test")
    @Epic("QAGP-001")
    @Feature("Feature1:LoginPage")
    @Story("Story: Valid login")
    @Step("Verify login")
    @Severity(SeverityLevel.BLOCKER)
    public void testLogin() throws Exception {
        loginOperator loginOperator = new loginOperator();
        loginOperator.loginByPageFactory("https://testerhome.com","1633235633@qq.com","yp10086","YOYO9527");
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
