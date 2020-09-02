package selenium.Situations.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TesterHomePage {

    @FindBy(xpath = "//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li[2]/a")
    @CacheLookup
    private WebElement login;  //点击登录按钮

    @FindBy(id = "user_login")
    @CacheLookup
    private  WebElement loginaccount;//登录账户

    @FindBy(id = "user_password")
    @CacheLookup
    private  WebElement loginpassword;//登录密码


    @FindBy(name = "commit")
    @CacheLookup
    private  WebElement loginbtn;//登录按钮


    @FindBy(xpath = "//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/a/img")
    @CacheLookup
    private  WebElement userinfo;//用户信息下拉框

    @FindBy(xpath = "//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/ul/li[1]/a")
    @CacheLookup
    private  WebElement accountname;//登录密码

    public void  TesterHomePage(){

    }
}
