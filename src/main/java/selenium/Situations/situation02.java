package selenium.Situations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class situation02 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        String mainpath = System.getProperty("user.dir");
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        System.out.println(webdriverpath);
        System.setProperty("webdriver.chrome.driver",webdriverpath);
        WebDriver  driver = new ChromeDriver();
        driver.get("https://dl.3dmgame.com/patch/131400.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[4]/div/a[1]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[6]/div/div[1]/div[4]/a[1]")).click();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_LEFT);//按方向键的 向下
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.quit();
    }
}
