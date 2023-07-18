package plastic_Bank_Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PB_LoginPage extends BaseClass{
public PB_LoginPage(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement loginButton;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Settings\")")
	    public WebElement settings;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
	    public WebElement menu;
		@AndroidFindBy(xpath= "//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
		public WebElement phoneNumberTextFeild;
		@AndroidFindBy(xpath= "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
		public WebElement passwordTextFeild;
		
		
		public void login() {
			WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(loginButton)));
			loginButton.click();
			}
		public void enterPhoneNumber(String PhoneNumber) {
			WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextFeild)));
			phoneNumberTextFeild.sendKeys(PhoneNumber);
			}
		public void enterPassword() {
			WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(passwordTextFeild)));
			passwordTextFeild.sendKeys("Fleek@123");
			passwordTextFeild.click();
			
			pbDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
		}
			
		public void menu() {
			WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
			menu.click();
			}
		public void settings() {
			WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
			settings.click();
			}

}
