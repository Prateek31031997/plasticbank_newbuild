package alchemy_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.BaseClass;


public class Branches extends BaseClass {

public Branches(WebDriver alcDriver) {
		
		PageFactory.initElements(alcDriver, this);
		}
@FindBy(xpath = "//div[@class='container-fluid']/div[2]")
private WebElement addNewBranch_btn;

@FindBy(xpath="//div[@class='body']/div/div/div[text()=' Branches ']")
private WebElement branches_TAB;

@FindBy(xpath = "//div[@class='tag-search']/label[text()='INCLUDE TAGS']/parent::div/div/div/input")
private WebElement searchInclude_tag;

@FindBy(xpath = "//datatable//input[@placeholder='Name']")
private WebElement name_SearchBox;

@FindBy(xpath = "//datatable//input[@placeholder='Phone']")
private WebElement phone_SearchBox;

@FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div")
private WebElement tableData_FirstRow;

@FindBy(xpath = "//div[@role='tabpanel']/div[2]/div/span")
private WebElement edit_Branch;

@FindBy(xpath = "//input[@name='city']")
private WebElement edit_city;

@FindBy(xpath = "//div[contains(@class, 'pb-button') and text()= 'Save ']")
private WebElement save_btn;

@FindBy(xpath ="//div[contains(@class, 'pb-button') and text()= 'Cancel']")
private WebElement cancel_btn;

@FindBy(xpath ="//ul[@role='tablist']/li[3]/a")
private WebElement invantory_tabBranch;

@FindBy(xpath = "//div[@role='tabpanel']//table/tbody/tr")
private WebElement totalRowsInventory_tabel;

@FindBy(xpath = "//div[@role='tabpanel']//table/tbody/tr/td[2]//div/mdl-checkbox/span[2]")
private WebElement invertoryView_checkBox;

@FindBy(xpath = "//input[@type='checkbox']/parent::div/span")
private WebElement suspendAccount_checkbox;

@FindBy(xpath = "//div[@role='document']/div")
private WebElement popUp_alert;


@FindBy(xpath="//div[@class='partner-info name']")
@CacheLookup private WebElement verifyNameText;

@FindBy(xpath="//input[@name='name']")
@CacheLookup private WebElement editNameTextFeild;


@FindBy(xpath = "//div/button[text()='OK']")
private WebElement okBtn_alertBox;

public void searchAddedBranch(String Name) {
	name_SearchBox.sendKeys(Name);
}

public void clickBranchsTab() {
	branches_TAB.click();
}

public void clickSpecificBranch() throws InterruptedException {
	Thread.sleep(15000);
	tableData_FirstRow.click();
	
}

public void editBranch() {
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='tabpanel']/div[2]/div/span")));
	edit_Branch.click();
}

public void editUserCity(String cityName) {
	edit_city.sendKeys(cityName);
}

public void saveUserDetails() {
	save_btn.click();
}

public void suspendAccount() {
	suspendAccount_checkbox.click();
}

public Boolean verfiyAlertBox() {
	Boolean verify = popUp_alert.isDisplayed();	
	return verify;
}

public void clickAlertBoxBtnOK() {
	okBtn_alertBox.click();
}
public void editBranchCityDetails(String pNum) throws InterruptedException {
	clickBranchsTab();
	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone_SearchBox));
	phone_SearchBox.clear();
	phone_SearchBox.sendKeys(pNum);
	clickSpecificBranch();
	editBranch();
	editUserCity("Dehradun");
	saveUserDetails();
	
}

public void editBranchNameDetails(String pNum) throws InterruptedException {
	clickBranchsTab();
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone_SearchBox));
	phone_SearchBox.clear();
	phone_SearchBox.sendKeys(pNum);
	clickSpecificBranch();
	editBranch();
	editNameTextFeild.clear();
	editNameTextFeild.sendKeys("Ashish Rawat");
	saveUserDetails();
}

public void suspendBranchAccount(String Num) throws InterruptedException {
	clickBranchsTab();
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone_SearchBox));
	phone_SearchBox.clear();
	phone_SearchBox.sendKeys(Num);
	clickSpecificBranch();
	Thread.sleep(2000);
	suspendAccount();
	Boolean verify = verfiyAlertBox();
	assert verify.equals(true);
	clickAlertBoxBtnOK();
	
}
}

