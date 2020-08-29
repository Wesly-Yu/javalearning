package selenium.Situations;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.reflect.misc.FieldUtil;
import org.apache.commons.*;
import java.io.File;
import java.io.IOException;

/*
javascript  scroll to element

 */
public class situation04javascript {
    public static void main(String[] args) throws InterruptedException, IOException {
        String mainpath = System.getProperty("user.dir");
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        System.out.println(webdriverpath);
        System.setProperty("webdriver.chrome.driver",webdriverpath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/"); //
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement inputext = driver.findElement(By.id("kw"));
        inputext.sendKeys("shengxie");
        javascriptUtil.drawBorder(inputext,driver);
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File trg1 = new File("D://screenshot//1.png");
        FileUtils.copyFile(screenshot,trg1);
        WebElement searchbutton = driver.findElement(By.id("su"));
        javascriptUtil.drawBorder(searchbutton,driver);
        File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File trg2 = new File("D://screenshot//2.png");
        FileUtils.copyFile(screenshot2,trg2);
        searchbutton.click();  //
        Thread.sleep(2000);
        WebElement relatedsearch = driver.findElement(By.xpath("//*[@id=\"con-ar\"]/div[3]/div/div/div/div"));
        javascriptUtil.scrollIntoView(relatedsearch,driver);
        javascriptUtil.drawBorder(relatedsearch,driver);
        File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File trg3 = new File("D://screenshot//3.png");
        FileUtils.copyFile(screenshot3,trg3);
        Thread.sleep(5000);
        driver.quit();
    }
}
