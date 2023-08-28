package Utilities;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
	
	//@BeforeSuite
	 public void dataCreation() throws IOException {
			
			/*
			 * Ra ra =new Ra(); ra.sendPostRequest();
			 */
			
			/*
			 * bonusName = bonusOrderName; member_Name = members.get(0); member_Number
			 * =numbers.get(0); branch1_Name = branches.get(0); branch1_Number
			 * =numbers.get(1); branch2_Name = branches.get(1); branch2_Number
			 * =numbers.get(2); branch3_Name = branches.get(2); branch3_Number =
			 * numbers.get(3); processor_Name = processors.get(0); processor_Number =
			 * numbers.get(4);
			 */
		  }
		
	
	public static String bonusOrderName;
	public static List<String>numbers=new ArrayList<String>();
	public static List<String>members=new ArrayList<String>();
	public static List<String>branches=new ArrayList<String>();
	public static List<String>processors=new ArrayList<String>();
	public static List<String>branchhdpe=new ArrayList<String>();
	public static List<String>branchpet=new ArrayList<String>();
	public static List<String>processorhdpe=new ArrayList<String>();
	public static List<String>processorpet=new ArrayList<String>();
	public static List<String>branchIds=new ArrayList<String>();
	public static List<String>processorIds=new ArrayList<String>();

	public static String bonusName="FleekxjocRk"; 
	public static String password = "123456a";

	public static String member_Name="FleeknBkE0z";
	public static String member_Number="+635825745058";

	public static String branch1_Name="brancha_QIOfpaxi";
	public static String branch1_Number="+634695528144";

	public static String branch2_Name="branchb_9eepTJAO";
	public static String branch2_Number="+633420850063";

	public static String branch3_Name="branchc_PjBSrhAS";
	public static String branch3_Number="+636167356682";

	public static String processor_Name="process_R7DdNWYU";
	public static String processor_Number="+637781530559";
	

	public String memberBonus = "7";
	public String branchBonus = "2";

	public String hdpe_M_B1 = "10";
	public String pet_M_B1 = "9";
	public String kgdelivered = "19";///////// 76 -19
	public String kgpromised = "50,000";
	public String kgpending = "19";//////////// 76-19-0

	public String hdpe_B1_B2 = "8";
	public String pet_B1_B2 = "7";

	public String hdpe_B1_B3 = "6";
	public String pet_B1_B3 = "5";

	public String hdpe_B2_P = "4";
	public String pet_B2_P = "3";

	public String hdpe_B3_P = "1";
	public String pet_B3_P = "1";

	public String total_bonus_M_B1 = "133";
	public String hdpe_bonus_M_B1 = "70";
	public String pet_bonus_M_B1 = "63";
	public String hdpe_KG_M_B1 = "10";
	public String pet_KG_M_B1 = "9";

	public String total_bonus_B1_B2 = "30";
	public String hdpe_bonus_B1_B2 = "16";
	public String pet_bonus_B1_B2 = "14";
	public String hdpe_KG_B1_B2 = "8";
	public String pet_KG_B1_B2 = "7";

	public String total_bonus_B1_B3 = "8";
	public String hdpe_bonus_B1_B3 = "4";
	public String pet_bonus_B1_B3 = "4";
	public String hdpe_KG_B1_B3 = "6";
	public String pet_KG_B1_B3 = "5";

	public String total_bonus_B2_P = "14";
	public String hdpe_bonus_B2_P = "8";
	public String pet_bonus_B2_P = "6";
	public String hdpe_KG_B2_P = "4";
	public String pet_KG_B2_P = "3";

	public String total_bonus_B3_P = "4";
	public String hdpe_bonus_B3_P = "2";
	public String pet_bonus_B3_P = "2";
	public String hdpe_KG_B3_P = "1";
	public String pet_KG_B3_P = "1";

	public String alc_B1_ExngHisBonusVerify[] = { "8", "30", "133" };// B1-B3,B1-B2,M-B1
	public String alc_B2_ExngHisBonusVerify[] = { "14", "30" };// B2-P,B2-B1
	public String alc_B3_ExngHisBonusVerify[] = { "4", "8" };// B3-P,B3-B1
	public String alc_P_ExngHisBonusVerify[] = { "4", "14" };

	// HDPE Kg, PET Kg, Total Kg
	public String alc_M_B1_ExngHisKgVerify[] = { "10 KG", "9 KG", "19 KG" };
	public String alc_B1_B2_ExngHisKgVerify[] = { "8 KG", "7 KG", "15 KG" };
	public String alc_B1_B3_ExngHisKgVerify[] = { "6 KG", "5 KG", "11 KG" };
	public String alc_B2_P_ExngHisKgVerify[] = { "4 KG", "3 KG", "7 KG" };
	public String alc_B3_P_ExngHisKgVerify[] = { "1 KG", "1 KG", "2 KG" };

	public static WebDriver alcDriver;
	public static AndroidDriver pbDriver;

	
	  protected static String randomPhoneNumber;
	  protected static String randomBusinessName; 
	  protected static String randomBranchMemberPhoneNumber;
	  protected static String randomBranchMemberName;
	  
	  protected static String randomLastName;
	  
	 
	public String memberName;
	public String branchmemberName;
	public String phoneNumber;
	public String branchMemberphoneNumber;
	public String adminphoneNumber;
	public String adminpassword;
	public String branchName;

	@SuppressWarnings("deprecation")
	@BeforeClass

	public void setup() throws IOException {

		WebDriverManager.chromedriver().setup();
		alcDriver = new ChromeDriver();
		alcDriver.manage().window().maximize();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		alcDriver.get("https://qa-admin.cognitionfoundry.io/#/login");

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability("newCommandTimeout", 3000);
		caps.setCapability("appPackage", "org.plasticbank.app");
		caps.setCapability("appActivity", "org.plasticbank.app.MainActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		pbDriver = new AndroidDriver(url, caps);
		
		
		  memberName = "Gayas"; 
		  branchmemberName = "Gayas " + randomBranchMemberName;
		  // password= "123456a"; phoneNumber = "+63" + randomPhoneNumber;
		  branchMemberphoneNumber = "+63" + randomBranchMemberPhoneNumber;
		  
		  adminphoneNumber = "+919560071590"; 
		  adminpassword = "123456a"; 
		  branchName = randomBusinessName;
		 
	}

	
	
	  @BeforeSuite 
	  public void generateRandomNumber() { 
		  randomPhoneNumber =RandomStringUtils.randomNumeric(8); 
		  System.out.println("Member Number :+63" +randomPhoneNumber); }
	  
	  protected String getRandomPhoneNumber() {
		  
		  return randomPhoneNumber;
		  }
	  
	  @BeforeSuite 
	 
	
	  public void generateRandomLastName() {
		  
	  randomLastName = RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Member Name : Gayas " + randomLastName); }
	  
	  protected String getRandomLastName() {
		  return randomLastName; 
		  }
	  
	  @BeforeSuite 
	  public void generateBranchMemberName() {
	  randomBranchMemberName = "Gayas " + RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Branch Member Name :" + randomBranchMemberName);
	  }
	  
	  protected String getBranchMemberNumber() { 
	
		  return randomBranchMemberName; 
		  }
	  
	  @BeforeSuite public void generateRandomBranchMemberNumber() {
	  randomBranchMemberPhoneNumber = RandomStringUtils.randomNumeric(8);
	  System.out.println("Branch Member Number : +63" +
	  randomBranchMemberPhoneNumber); }
	  
	  protected String getRandomBranchMemberNumber() { 
		  return randomBranchMemberPhoneNumber; }
	  
	  @BeforeSuite 
	  public void generateBranchName() { 
		  randomBusinessName = "Gayas "+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Branch Name :" +randomBusinessName);
		  }
	  
	  protected String getBranchName() { 
		  return randomBusinessName; 
		  }
	 

	@AfterClass
	public void teardown() {

		pbDriver.quit();
		alcDriver.quit();

	}

}
