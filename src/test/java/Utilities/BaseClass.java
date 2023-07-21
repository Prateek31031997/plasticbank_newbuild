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

	
	  public String randomPhoneNumber;
	  public String randomBusinessName;
	  public String randomMemberPhoneNumber;
	  public String randomMemberName;
	  
	 
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

		WebDriverManager.chromedriver().setup();
		alcDriver = new ChromeDriver();
		alcDriver.manage().window().maximize();
		alcDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		alcDriver.get("https://qa-admin.cognitionfoundry.io/#/login");

	}

//String randomPhoneNumber, String randomBusinessName, String randomMemberName,String randomMemberPhoneNumber 
	@BeforeSuite
	public void generateRandomData(String randomPhoneNumber, String randomBusinessName, String randomMemberName,String randomMemberPhoneNumber) 
	{
		randomPhoneNumber = RandomStringUtils.randomNumeric(8);
		System.out.println("Collector Number " + "+63" + randomPhoneNumber);
		this.randomPhoneNumber=randomPhoneNumber;

		randomBusinessName = RandomStringUtils.randomAlphabetic(5);
		System.out.println("Branch Name " + "Gayas" + randomBusinessName);
		this.randomBusinessName=randomBusinessName;

		randomMemberName = RandomStringUtils.randomAlphabetic(5);
		System.out.println("Branch Member Name " + "Gayas" + randomMemberName);
		this.randomMemberName=randomMemberName;

		randomMemberPhoneNumber = RandomStringUtils.randomNumeric(8);
		System.out.println("Branch Member Phone Number " + randomMemberPhoneNumber);
		this.randomMemberPhoneNumber=randomMemberPhoneNumber;
		
	}

	/*
	 * protected String getRandomPhoneNumber() { return randomPhoneNumber; }
	 * 
	 * protected String getGenerateBranchName() { return randomBusinessName; }
	 * protected String getRandomBranchMemberName() { return randomMemberName; }
	 * protected String getRandomBranchMemberPhoneNumber() { return
	 * randomMemberPhoneNumber; }
	 */

}
