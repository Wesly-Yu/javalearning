package selenium.Situations.TestCase;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import selenium.Situations.BaseDriver.BaseDriver;
import selenium.Situations.Operator.loginOperator;

import static org.hamcrest.MatcherAssert.assertThat;

//继承BaseClass
public class TestPageFactory extends BaseDriver {

    @Test()
    public void testLogin() throws Exception {
        loginOperator loginOperator = new loginOperator();
        loginOperator.loginByPageFactory("https://testerhome.com","1633235633@qq.com","yp10086","YOYO9527");
    }

}
