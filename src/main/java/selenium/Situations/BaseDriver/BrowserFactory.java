package selenium.Situations.BaseDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.Situations.cleanLastReport;



public class BrowserFactory {
    private static BrowserFactory instance = null;
    ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    private BrowserFactory() {

    }

    public static BrowserFactory getInstance() {
        if (instance == null) {
            instance = new BrowserFactory();
        }
        return instance;
    }

    public final void setDriver(String browser) throws Exception {


        switch (browser) {

            case "chrome":
                String mainpath = System.getProperty("user.dir");
                String reportpath = mainpath+"\\allure-results";
                cleanLastReport.deletDir(reportpath);
                String webdriverpath = mainpath+"\\src\\main\\resources\\webdriver\\chromedriver.exe";
                System.out.println(webdriverpath);
                System.setProperty("webdriver.chrome.driver",
                        webdriverpath);
                webDriver.set(new ChromeDriver());
        }
    }

    public WebDriver getDriver() {
        return webDriver.get();
    }
    public void closeDriver() {
        webDriver.get().quit();
        webDriver.remove();
    }

}