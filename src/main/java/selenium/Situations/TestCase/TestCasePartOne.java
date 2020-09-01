package selenium.Situations.TestCase;

import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import selenium.Situations.BaseDriver.BaseClass;
import selenium.Situations.allureListener;
import selenium.Situations.cleanLastReport;

@Listeners({allureListener.class})
public class TestCasePartOne extends BaseClass {
    public WebDriver driver;
    @BeforeClass
    public void setUp(){
        BaseClass base = new BaseClass();
        base.initialize_driver();
        String mainpath = System.getProperty("user.dir");
        String reportpath = mainpath+"\\allure-results";
        cleanLastReport.deletDir(reportpath);


    }
}
