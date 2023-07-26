package Utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver alcDriver;
	public static AndroidDriver pbDriver;

	protected static String randomPhoneNumber;
	protected static String randomBusinessName; 
	protected static String randomBranchMemberPhoneNumber;
	protected static String randomBranchMemberName;
	
	protected static String randomLastName;
	
	public String memberName;
	public String branchmemberName;
	public String password;
	public String phoneNumber;
	public String branchMemberphoneNumber;
	public String adminphoneNumber;
	public String adminpassword;
	public String branchName;

	@SuppressWarnings("deprecation")
	@BeforeClass

	public void setup() throws MalformedURLException {
		
		  WebDriverManager.chromedriver().setup(); alcDriver = new ChromeDriver();
		  alcDriver.manage().window().maximize();
		  alcDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  alcDriver.get("https://qa-admin.cognitionfoundry.io/#/login");

		  DesiredCapabilities caps = new DesiredCapabilities();
		
		  caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		  caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		  caps.setCapability("appPackage", "org.plasticbank.app");
		  caps.setCapability("appActivity", "org.plasticbank.app.MainActivity"); URL
		  url = new URL("http://0.0.0.0:4723/wd/hub");
		  
		  pbDriver = new AndroidDriver(url, caps);
		  
		  
		    memberName= "Gayas";
			branchmemberName ="Gayas "+randomBranchMemberName;
			password= "password1";
			phoneNumber="+63"+randomPhoneNumber;
			branchMemberphoneNumber="+63"+randomBranchMemberPhoneNumber;
		   
			adminphoneNumber="+919560071590";
			adminpassword="123456a";
			branchName=randomBusinessName;
		 
	}

	
	  @BeforeSuite 
	  public void generateRandomNumber() {
	  randomPhoneNumber =RandomStringUtils.randomNumeric(8);
	  System.out.println("Member Number :+63"+randomPhoneNumber); 
	  }
	  
	  protected String getRandomPhoneNumber() { 
	  return randomPhoneNumber; }
	  
	  @BeforeSuite
	  public void generateRandomLastName() 
	  { 
	  randomLastName =RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Member Name : Gayas "+randomLastName);
	  }
	  protected String getRandomLastName() {
	  return randomLastName; }
	  
	  @BeforeSuite
	  public void generateBranchMemberName() 
	  { 
	  randomBranchMemberName ="Gayas " +RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Branch Member Name :"+randomBranchMemberName);
	  }
	  protected String getBranchMemberNumber() {
	  return randomBranchMemberName; }
	  
	  @BeforeSuite 
	  public void generateRandomBranchMemberNumber() {
	  randomBranchMemberPhoneNumber =RandomStringUtils.randomNumeric(8);
	  System.out.println("Branch Member Number : +63"+randomBranchMemberPhoneNumber); 
	  }
	  
	  protected String getRandomBranchMemberNumber() { 
	  return randomBranchMemberPhoneNumber; }
	  
	  @BeforeSuite
	  public void generateBranchName() 
	  { 
	  randomBusinessName ="Gayas " +RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Branch Name :"+randomBusinessName);
	  }
	  protected String getBranchName() {
	  return randomBusinessName; }
	 
	  @AfterClass
	  public void quit() {
		  pbDriver.quit();
		  alcDriver.quit();
	  }
	 
}

