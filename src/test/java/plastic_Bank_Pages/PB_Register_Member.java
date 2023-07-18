package plastic_Bank_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PB_Register_Member {
public PB_Register_Member(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
	    public WebElement signUpButton ;
		
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"skip_video\")")
	    public WebElement skipVideoButton;
		
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collectors\")")
	    public WebElement collectorsSection;
		
		@AndroidFindBy(xpath = "//android.view.View[3]/android.view.View/android.view.View/android.widget.Button")
		public WebElement becomeACollectorButton;
		
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement firstNameTextFeild;
	    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement lastNameTextFeild;
	    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement countryCodeDropdown;
	    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement phoneNumberTextFeild;
	    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement dobScroll;
	    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement genderDropdown;
	    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement passwordTestFeild;
	    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement confirmPasswordTextFeild;
	    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement agreeT&C_CheckBox;
	    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement confirmButton;
	   	  
}
