package plastic_Bank_Pages;

import Utilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Allure;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class PB_Member_Profile extends BaseClass{


    public PB_Member_Profile(AndroidDriver driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    @AndroidFindBy(xpath= "//android.view.View/android.widget.TextView/parent::android.view.View")
    public WebElement tokenValue;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
    public WebElement permission;



    public boolean tokenValueProfile() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(tokenValue)));
        Thread.sleep(2000);
        TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
        Thread.sleep(2000);
        return tokenValue.isDisplayed();
    }



}

