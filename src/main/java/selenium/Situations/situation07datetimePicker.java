package selenium.Situations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class situation07datetimePicker {
    public static void main(String[] args) throws InterruptedException {
        String divmonth = "October";
        String mainpath = System.getProperty("user.dir");
        String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
        System.out.println(webdriverpath);
        System.setProperty("webdriver.chrome.driver",webdriverpath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.phptravels.net/"); //http://www.expedia.ca/
        driver.manage().window().maximize();
        Thread.sleep(3000);
        ////div[1]//nav[1]//div[2]
        driver.findElement(By.xpath("//input[@id='checkin']")).click();
        Thread.sleep(1000);
        String monthstring = driver.findElement(By.xpath("//div[1]//nav[1]//div[2]")).getText();
        String[] listcollection = monthstring.split(",");
        System.out.println(listcollection[0]);
        while (true){
            if(listcollection[0].equals(divmonth)){
                break;
            }else {
                driver.findElement(By.xpath("//div[1]//nav[1]//div[3]")).click();
            }
        }
        //div[@id='datepickers-container']//div[1]//div[1]//div[1]//div[2]//div[contains(text(),"20")]
        List<WebElement>  datelist = driver.findElements(By.xpath("//div[@id='datepickers-container']//div[1]//div[1]//div[1]//div[2]"));
        System.out.println(datelist.size());
        driver.findElement(By.xpath("//div[@id='datepickers-container']//div[1]//div[1]//div[1]//div[2]//div[contains(text(),\"20\")]")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}


