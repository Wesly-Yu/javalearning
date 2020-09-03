package selenium.Situations.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//@CacheLookup 这个注解的意思是说找到元素之后将缓存元素，重复的使用这些元素，将会大大加快测试的速度
public class TesterHomePage {
    WebDriver driver;
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

    public void  TesterHomePage(WebDriver  driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //click login  into login page
    public void clicklogin(){
        login.click();
    }
    //input  email
    public void inputaccount(String email){
        loginaccount.sendKeys(email);
    }
    //input password
    public void  inputpassword(String  password){
        loginpassword.sendKeys(password);
    }
    //click login button
    public  void clickloginbtn(){
        loginbtn.click();
    }
    //click userinfo  to check user information
    public void clickuserinfoselect(){
        userinfo.click();
    }
    //get user login name
    public void  getusername(){
        accountname.getText();
    }
}