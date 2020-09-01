package selenium.Situations;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import selenium.Situations.BaseDriver.BaseClass;

public class allureListener  implements ITestListener
{

    private  static  String getTestMethodName(ITestResult iTestResult){
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Attachment
    public byte[] saveFailureScreenShot(WebDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{0}",type = "text/plain")
    public  static String saveTextLog(String message){
        return message;
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Failure method"+getTestMethodName(iTestResult)+iTestResult.getTestName());
        Object testclass = iTestResult.getInstance();
        WebDriver driver = BaseClass.getDriver();
        //Alluer ScreenShot and saveTestLog
        if (driver instanceof WebDriver){
            System.out.println("ScreenShot capture for test case:"+ getTestMethodName(iTestResult));
            saveFailureScreenShot(driver);
        }
        saveTextLog(getTestMethodName(iTestResult)+"failed and screenshot taken!");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("onStart method"+ iTestContext.getName());
        iTestContext.setAttribute("WebDriver", BaseClass.getDriver());

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
