package selenium.Situations;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class situation05webHub {
    WebDriver driver;
    @Test(priority=1)
    void setup() throws MalformedURLException {
        String nodeUrl ="http://192.168.0.4:45569/wd/hub";
        DesiredCapabilities capabilitie= DesiredCapabilities.chrome();
        capabilitie.setBrowserName("chrome");
        capabilitie.setPlatform(Platform.WIN10);
//        String mainpath = System.getProperty("user.dir");
//        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\geckodriver.exe";
//        System.out.println(webdriverpath);
        System.setProperty("webdriver.chrome.driver","E:\\javalearning\\src\\main\\resources\\webdriver\\chromedriver.exe");
        driver = new RemoteWebDriver(new URL(nodeUrl),capabilitie);
    }
    @Test(priority=2)
    void login() throws InterruptedException {
        driver.get("https://testerhome.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
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
        driver.quit();
    }
}
