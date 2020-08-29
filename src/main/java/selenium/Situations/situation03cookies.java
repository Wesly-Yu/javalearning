package selenium.Situations;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

/*
selenium  get  add cookie

 */
public class situation03cookies {
    public static void main(String[] args) throws InterruptedException {
        String mainpath = System.getProperty("user.dir");
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        System.out.println(webdriverpath);
        System.setProperty("webdriver.chrome.driver",webdriverpath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bilibili.com/"); //
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());//get cookies number
        Cookie seleniumcookie = new Cookie("Mycookie", "1234567");
        driver.manage().addCookie(seleniumcookie);
        cookies = driver.manage().getCookies();//重新获取cookie后才能显示最新的cookie数量，否则则是显示原先的
        System.out.println(cookies.size());
        for (Cookie cookie:cookies){
            System.out.println(cookie.getName()+":"+cookie.getValue());
        }
        driver.manage().deleteCookie(seleniumcookie);//删除指定名称的cookie
        driver.quit();
    }
}
