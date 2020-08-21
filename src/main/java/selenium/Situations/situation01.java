package selenium.Situations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/*
火狐浏览器下载文件不再出现下载提示框
 */
public class situation01 {
    public static void main(String[] args) throws InterruptedException {
        String mainpath = System.getProperty("user.dir");
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\geckodriver.exe";
        System.out.println(webdriverpath);
        System.setProperty("webdriver.gecko.driver",webdriverpath);

        //create browser profile
        FirefoxProfile profile = new FirefoxProfile();
        //https://www.sitepoint.com/mime-types-complete-list/
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
        profile.setPreference("browser.download.manager.showWhenStarting",false);
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://github.com/mozilla/geckodriver/releases/tag/v0.27.0");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement download = driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/div[2]/div/div[2]/details/div/div/div[6]/a/span"));
        download.click();
        Thread.sleep(4000);
        driver.quit();

    }

}
