package selenium.Situations.Operator;

import org.apache.log4j.Logger;
import selenium.Situations.BaseDriver.BaseTest;
import selenium.Situations.PageFactory.TesterHomePage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class loginOperator extends BaseTest {
    /***
     * 登录过程
     * @param email
     * @param password
     * @param expected
     */
    public void loginByPageFactory(String url,String email, String password, String expected) throws Exception {
        Logger logger = Logger.getLogger("loginOperator");
        getDriver().navigate().to(url);
        logger.info("-------"+url+"-------");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TesterHomePage homePage = new TesterHomePage();
        homePage.clicklogin();
        Thread.sleep(2000);
        homePage.businessLogin(email,password);
        logger.info("-------"+email+"------"+password+"-------");
        homePage.clickloginbtn();
        Thread.sleep(2000);
        homePage.clickuserinfoselect();
        Thread.sleep(1000);
        assertThat(homePage.getusername(),equalTo(expected));
        logger.info("-------"+expected+"-------");
        Thread.sleep(2000);
        homePage.clickuserinfoselect();

    }
}
