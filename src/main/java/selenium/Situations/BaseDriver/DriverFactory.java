package selenium.Situations.BaseDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private DriverFactory() {
        //do not allowed to initialize this class from outsise
    }

    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {
        return instance;
    }

    //Thread local driver object
    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() {
        @Override
        protected WebDriver initialValue() {
            return new ChromeDriver(); // can be replaced with other browser drivers

        }
    };
    public  WebDriver getDriver(){
        return driver.get();
    }

    public void  removeDriver(){
        driver.get().quit();
        driver.remove();
    }

}
