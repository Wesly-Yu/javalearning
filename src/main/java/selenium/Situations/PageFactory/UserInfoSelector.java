package selenium.Situations.PageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.Situations.BaseDriver.BaseTest;

public class UserInfoSelector extends BaseTest {
    @FindBy(xpath ="//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/a/img")
    @CacheLookup
    private  WebElement userinfo;//用户信息下拉框

    @FindBy(xpath ="//*[@id=\"main-page\"]/div[1]/nav/div/ul[1]/li/ul/li[4]/a")
    @CacheLookup
    private  WebElement userfavorites;//点击用户Favorites

    @FindBy(xpath ="//*[@id=\"main\"]/div/div[2]/div[6]/div[1]")
    @CacheLookup
    private  WebElement pagetips;//页面提示标签

    @FindBy(xpath ="//*[@title=\"[持续交付实践] 开篇：持续集成&持续交付综述\"]")
    @CacheLookup
    private  WebElement targetelementtitle;//页面提示标签

    @FindBy(xpath ="//*[@id=\"topic-sidebar\"]/div[1]/div/div[1]/div[2]/div/a[1]")
    @CacheLookup
    private  WebElement focus;//点击关注

    @FindBy(xpath = "//*[@id=\"topic-sidebar\"]/div[1]/div/div[1]/div[1]/a/i")
    @CacheLookup
    private  WebElement dianzan;//点击赞

    @FindBy(xpath = "//*[@id=\"reply_body\"]")
    @CacheLookup
    private  WebElement replyinput;//回复输入框

    @FindBy(id="reply-button")
    @CacheLookup
    private  WebElement replybtn;//回复按钮

    //初始化selenium driver
    public  UserInfoSelector(){
        WebDriver driver = getDriver();
        PageFactory.initElements(driver,this);
    }
    //click user info selector page
    public void clickuserinfoselect(){
        userinfo.click();
    }

    //click user favorites
    public void clickuserfavorites(){
        userfavorites.click();
    }
    //

    public void clicktargetarticle(){
        targetelementtitle.click();
    }
}
