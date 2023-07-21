package alchemy_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class Members extends BaseClass{
	
public Members(WebDriver alcDriver) {
		
		PageFactory.initElements(alcDriver, this);
		}

@FindBy(xpath="//input[@id='phone']")
public WebElement members_TAB;

@FindBy(xpath="//label[text()='INCLUDE TAGS']/parent::div/div/div/input")
private WebElement includeATag;
@FindBy(xpath="//label[text()='EXCLUDE TAGS']/parent::div/div/div/input")
private WebElement excludeATag;
@FindBy(xpath="//i[@class='export-icon']")
private WebElement export;
@FindBy(xpath="//input[@placeholder='Name']")
private WebElement name;
@FindBy(xpath="//span[@class='pr-2']")
private WebElement memberType;
@FindBy(xpath="//input[@placeholder='Level']") 
private WebElement level;
@FindBy(xpath="//input[@placeholder='Gender']")
private WebElement gender;
@FindBy(xpath="//input[@placeholder='Age']") 
private WebElement age;
@FindBy(xpath="//input[@placeholder='Country']") 
private WebElement country;
@FindBy(xpath="//input[@placeholder='Phone']") 
private WebElement phone;
@FindBy(xpath="//input[@placeholder='Registered By']")
private WebElement registeredBy;
@FindBy(xpath="//input[@placeholder='Email']")
private WebElement email;
@FindBy(xpath="//input[@placeholder='Register Date']")
private WebElement registerDate;
@FindBy(xpath="//input[@placeholder='Tokens in Wallet']") 
private WebElement tokensInWallet;
@FindBy(xpath="//input[@placeholder='Total KG Recycled']") 
private WebElement totalKGRecycled;
@FindBy(xpath="//input[@placeholder='Monthly KG']")
private WebElement monthlyKG;
@FindBy(xpath="//input[@placeholder='Monthly Earnings']")
private WebElement monthlyEarnings;
@FindBy(xpath="//input[@placeholder='Last Active']") 
private WebElement lastActive;
@FindBy(xpath="//div[contains(@class,'pb-add-button')]")
private WebElement addIcon;
@FindBy(xpath="//div[contains(text(),'Gayas')]")
private WebElement memberAdded;

//Locaters of WebElements After selecting  Member

@FindBy(xpath="//a[@id='ngb-nav-6']")
@CacheLookup private WebElement detailsTab;
@FindBy(xpath="//input[@id='phone']")
@CacheLookup private WebElement edit_phone;
@FindBy(xpath="//select[@id='country']")
@CacheLookup private WebElement edit_country;
@FindBy(xpath="//input[@id='name']") 
@CacheLookup private WebElement edit_name;
@FindBy(xpath="//input[@id='city']")
@CacheLookup private WebElement edit_city;
@FindBy(xpath="//input[@id='email']") @CacheLookup private WebElement edit_email;
@FindBy(xpath="//input[@id='birthDate']") @CacheLookup private WebElement edit_birthDate;
@FindBy(xpath="//input[@id='regDate']") @CacheLookup private WebElement edit_registrationDate;
@FindBy(xpath="//select[@id='gender']") @CacheLookup private WebElement edit_gender;
@FindBy(xpath="//input[@id='reqPin']") @CacheLookup private WebElement requirePinForSpendingToken;
@FindBy(xpath="//input[@id='bonusEligible']") @CacheLookup private WebElement bonusEligible;
@FindBy(xpath="//span[text()='Change password']") @CacheLookup private WebElement changePassword;
@FindBy(xpath="//span[normalize-space()='Direct token transfer']") @CacheLookup private WebElement directTokenTransfer;
@FindBy(xpath="//span[normalize-space()='Reclaim Tokens']") @CacheLookup private WebElement reclaimTokens;
@FindBy(xpath="//span[normalize-space()='Delete Account']") @CacheLookup private WebElement deleteAccount;
@FindBy(xpath="//span[text()='Edit']") @CacheLookup private WebElement edit;
@FindBy(xpath="//div[text()=' Suspend Account ']/input") @CacheLookup private WebElement suspendAccount;

@FindBy(xpath="//div[@class='pb-button green']") @CacheLookup private WebElement saveButton;
@FindBy(xpath="//div[@class='pb-button grey']") @CacheLookup private WebElement cancelButton;
@FindBy(xpath="//a[@id='ngb-nav-7']") @CacheLookup private WebElement exchangeHistory;
@FindBy(xpath="//a[@id='ngb-nav-8']") @CacheLookup private WebElement tags;


@FindBy(xpath="//button[normalize-space()='OK']") @CacheLookup private WebElement ok;
@FindBy(xpath="//button[normalize-space()='Cancel']") @CacheLookup private WebElement cancel;

public void verifyMember(String name) {
	members_TAB.click();
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone));
	phone.click();
	phone.sendKeys("63"+randomPhoneNumber);
	wait.until(ExpectedConditions.elementToBeClickable(memberAdded));
	String verifyName= memberAdded.getText();
	
	if (verifyName.equals(name)) {
	    System.out.println("Name is verified");
	    
	} else {
	    System.out.println("Name verification failed");
		}
	}
public void editMemberDetails() {
	
	members_TAB.click();
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone));
	phone.click();
	phone.sendKeys(randomPhoneNumber+"1111");
	wait.until(ExpectedConditions.elementToBeClickable(memberAdded));
	memberAdded.click();
	wait.until(ExpectedConditions.elementToBeClickable(edit));
	edit.click();
	edit_name.clear();
	edit_name.sendKeys("Gayas Khan");
	saveButton.click();	
}
public void suspendMember() {
	suspendAccount.click();
	ok.click();
}
public void refresh() {
	members_TAB.click();
}

}