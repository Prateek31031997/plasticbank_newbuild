package alchemy_Pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.BaseClass;
import plastic_Bank_Pages.PB_Transaction;


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

@FindBy(xpath = "//*[text()=' Suspend Account ']/span")
private WebElement suspendAccount_checkbox;

@FindBy(xpath = "//div[@role='document']/div")
private WebElement popUp_alert;

@FindBy(xpath="//div[@class='partner-info name']")
@CacheLookup private WebElement verifyNameText;

@FindBy(xpath="//input[@name='name']")
@CacheLookup private WebElement editNameTextFeild;


@FindBy(xpath = "//div/button[text()='OK']")
private WebElement okBtn_alertBox;

@FindBy(xpath = "//div[text()='Exchange History']")
private WebElement exchangeHistory;


@FindBy(xpath = "//loader/div//table") 
WebElement pageLoader;
@FindBy(xpath = "//label[text()='Tokens Active']/parent::div/div")
WebElement tokensActive;
@FindBy(xpath = "//label[text()='Split Mode']/parent::div/div")
WebElement splitModeToggle;
@FindBy(xpath = "//label[text()='Upload Buy Receipts']/parent::div/div")
WebElement uploadBuyReceiptsToggle;
@FindBy(xpath = "//label[text()='Show Token/Market Rate']/parent::div/div")
WebElement tokenMarketToggle;

@FindBy(xpath = "//label[text()='Show Token/Market Rate']/parent::div/div")
WebElement fraudToggle;
@FindBy(xpath = "//label[text()='Show Token/Market Rate']/parent::div/div")
WebElement errorsToggle;
@FindBy(xpath = "//label[text()='Show Token/Market Rate']/parent::div/div")
WebElement bonusToggle;
@FindBy(xpath = "//div[@class='disable-btn approve-true-state']")
WebElement approveButton;

@FindBy(xpath = "//*[text()='Plastik-HDPE-Clean-Clear']/parent::div/div[2]")
WebElement hdpeKgAlcText;
@FindBy(xpath = "//*[text()='Plastik-PET-Raw-Transparent']/parent::div/div[2]")
WebElement petKgAlcText;
@FindBy(xpath = "//*[text()='11 KG']/parent::div/div[2]")
WebElement totalKgAlcText;

@FindBy(xpath = "//div[@class='card-header']")
List<WebElement> transactions;

@FindBy(xpath = "//div[@class='card-header']/div/div/div[contains(@class, 'row')]/div/div[1]")
List<WebElement> noFraudNoErrorsToggle;

@FindBy(xpath = "//div[@class='text-natural-green']")
List<WebElement> branchBonusTextInAlchmeyVerify;

@FindBy(xpath = "//div[@class='card-header']/div/div/button")
List<WebElement> approvedConfirm;


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
	/*
	 * WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	 * wait.until(ExpectedConditions.elementToBeClickable(suspendAccount_checkbox));
	 */
	/*
	 * JavascriptExecutor executor = (JavascriptExecutor) alcDriver;
	 * executor.executeScript("arguments[0].click();", suspendAccount_checkbox);
	 */
	suspendAccount_checkbox.click();
}

public Boolean verfiyAlertBox() {
	Boolean verify = popUp_alert.isDisplayed();	
	return verify;
}

public void clickAlertBoxBtnOK() {
	okBtn_alertBox.click();
}
public void searchSpecificBranch(String pNum) throws InterruptedException {
	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone_SearchBox));
	phone_SearchBox.clear();
	phone_SearchBox.sendKeys(pNum);
}
public void editBranchCityDetails(String pNum) throws InterruptedException {
	clickBranchsTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	editBranch();
	editUserCity("Dehradun");
	saveUserDetails();
	
}

public void editBranchNameDetails(String pNum) throws InterruptedException {
	clickBranchsTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	editBranch();
	editNameTextFeild.clear();
	editNameTextFeild.sendKeys("Ashish Rawat");
	saveUserDetails();
}

public void suspendBranchAccount(String pNum) throws InterruptedException {
	clickBranchsTab();
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone_SearchBox));
	phone_SearchBox.clear();
	phone_SearchBox.sendKeys(pNum);
	clickSpecificBranch();
	suspendAccount();
	Boolean verify = verfiyAlertBox();
	assert verify.equals(true);
	clickAlertBoxBtnOK();
	Thread.sleep(2000);
}

public void clickTokensActiveToggle(){
	tokensActive.click();
}

public void clickSplitModeToggle(){
	splitModeToggle.click();
}

public void clickUploadButReceiptsToggle(){
	uploadBuyReceiptsToggle.click();
}

public void clickTokenMarketToggle(){
	tokenMarketToggle.click();
}

public void clickTogglesInBranches(String pNum) throws InterruptedException {
	clickBranchsTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	editBranch();
	//clickTokenMarketToggle();
	//clickSplitModeToggle();
	clickUploadButReceiptsToggle();
}
public void clickExchangeHistoryButton() {
	exchangeHistory.click();
}
public void transactionApproveExcHisB1(String pNum) throws InterruptedException {
	clickBranchsTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	clickExchangeHistoryButton();
	for (WebElement transaction:transactions) {	
		
	transaction.click();
	Thread.sleep(1000);
	for (int i=0;i<2;i++)
	{	
		Thread.sleep(5000);
		noFraudNoErrorsToggle.get(i).click();
	}
	for(int j=0; j<transactions.size();j++) {
	String alcBonus= branchBonusTextInAlchmeyVerify.get(j).getText();
	assertEquals(alcBonus,alc_B1_ExngHisBonusVerify[j] );
	String kgArr[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
	if(j==0) {
		assertEquals(alc_B1_B3_ExngHisKgVerify,kgArr);
	}
	else if(j==1) {
		assertEquals(alc_B1_B2_ExngHisKgVerify,kgArr);
	}
	else if(j==2) {
		assertEquals(alc_M_B1_ExngHisKgVerify,kgArr);
	}
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(approveButton));
	approveButton.click();
	Thread.sleep(5000);
	}
	for(int i=0;i<=approvedConfirm.size();i++) {
		String ac=approvedConfirm.get(i).getText();
		assertEquals(ac, "Approved");	
	}
}
}

public void transactionApproveExcHisB2(String pNum) throws InterruptedException {
	clickBranchsTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	clickExchangeHistoryButton();
	for (WebElement transaction:transactions) {	
		
	transaction.click();
	Thread.sleep(1000);
	for (int i=0;i<2;i++)
	{	
		Thread.sleep(5000);
		noFraudNoErrorsToggle.get(i).click();
	}
	
	for(int j=0; j<transactions.size();j++) {
	String alcBonus= branchBonusTextInAlchmeyVerify.get(j).getText();
	assertEquals(alcBonus,alc_B1_ExngHisBonusVerify[j] );
	String kgArr[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
	if(j==0) {
		assertEquals(alc_B2_P_ExngHisKgVerify,kgArr);
	}
	else if(j==1) {
		assertEquals(alc_B1_B2_ExngHisKgVerify,kgArr);
	}
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(approveButton));
	approveButton.click();
	Thread.sleep(5000);
	}
	for(int i=0;i<=approvedConfirm.size();i++) {
		String ac=approvedConfirm.get(i).getText();
		assertEquals(ac, "Approved");	
	}
}
}

public void transactionApproveExcHisB3(String pNum) throws InterruptedException {
	clickBranchsTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	clickExchangeHistoryButton();
	for (WebElement transaction:transactions) {	
		
	transaction.click();
	Thread.sleep(1000);
	for (int i=0;i<2;i++)
	{	
		Thread.sleep(5000);
		noFraudNoErrorsToggle.get(i).click();
	}
	
	for(int j=0; j<transactions.size();j++) {
	String alcBonus= branchBonusTextInAlchmeyVerify.get(j).getText();
	assertEquals(alcBonus,alc_B1_ExngHisBonusVerify[j] );
	String kgArr[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
	if(j==0) {
		assertEquals(alc_B3_P_ExngHisKgVerify,kgArr);
	}
	else if(j==1) {
		assertEquals(alc_B1_B3_ExngHisKgVerify,kgArr);
	}
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(approveButton));
	approveButton.click();
	Thread.sleep(5000);
	}
	for(int i=0;i<=approvedConfirm.size();i++) {
		String ac=approvedConfirm.get(i).getText();
		assertEquals(ac, "Approved");	
	}
}
}
public void verifyTransactionApproved(String pNum) throws InterruptedException {
	clickBranchsTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	clickExchangeHistoryButton();
	
}
}

