package Utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver alcDriver;
	public static AndroidDriver pbDriver;

	protected static String randomBusinessName; 
	protected static String randomMemberPhoneNumber;
	protected static String randomMemberName;
	protected static String randomPhoneNumber;
	protected static String randomLastName;

	@SuppressWarnings("deprecation")
	@BeforeClass

	public void setup() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability("appPackage", "org.plasticbank.app");
		caps.setCapability("appActivity", "org.plasticbank.app.MainActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		pbDriver = new AndroidDriver(url, caps);

		
		  WebDriverManager.chromedriver().setup(); alcDriver = new ChromeDriver();
		  alcDriver.manage().window().maximize();
		  alcDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  alcDriver.get("https://qa-admin.cognitionfoundry.io/#/login");
		  
		 
	}

	
	  @BeforeSuite 
	  public void generateRandomNumber() {
	  randomPhoneNumber =RandomStringUtils.randomNumeric(8);
	  System.out.println(randomPhoneNumber); 
	  }
	  
	  protected String getRandomPhoneNumber() { 
	  return randomPhoneNumber; }
	  
	  @BeforeSuite
	  public void generateRandomLastName() 
	  { 
	  randomLastName =RandomStringUtils.randomAlphabetic(5);
	  System.out.println(randomLastName);
	  }
	  protected String getRandomLastName() {
	  return randomLastName; }
	 
}
