package alchemy_Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.BaseClass;
import io.qameta.allure.Allure;


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

@FindBy(xpath = "//*[text()=' Suspend Account ']")
private WebElement suspendAccount_checkbox;

@FindBy(xpath = "//div[@role='document']/div")
private WebElement popUp_alert;

@FindBy(xpath="//div[@class='partner-info name']")
@CacheLookup private WebElement verifyNameText;

@FindBy(xpath="//input[@name='name']")
@CacheLookup private WebElement editNameTextFeild;


@FindBy(xpath = "//div/button[text()='OK']")
private WebElement okBtn_alertBox;

@FindBy(xpath = "//a[text()='Exchange History']")
private WebElement exchangeHistory;

@FindBy(xpath = "//a[text()='Exchange History']")
private WebElement exchangeHistoryTab;



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
@FindBy(xpath = "//div[text()='TOTAL']/following-sibling::div")
WebElement totalKgAlcText;

@FindBy(xpath = "//div[@class='card-header']/div/button")
List<WebElement> transactions;

@FindBy(xpath = "//span[text()='Plastic Chain']")
WebElement plasticChain;
@FindBy(xpath = "//div[@class='card-body']//div/span[1]/span[1]")
List<WebElement> hdpePetPlasticChain;
@FindBy(xpath = "//div[@class='card-body']//div/span[1]/span[1]")
List<WebElement> branchProcessorTransactionPlasticChain;
@FindBy(xpath = "//i[@class='fa fa-arrow-right pointer fs15 text-green']")
List<WebElement> greenArrow;
@FindBy(xpath = "//i[@class='fa fa-arrow-right pointer fs15 text-orange']")
List<WebElement> orangeArrow;

@FindBy(xpath = "//div[@class='card-header']/div/div/div[contains(@class, 'row')]/div/div[1]")
List<WebElement> noFraudNoErrorsToggle;

@FindBy(xpath = "//div[@class='text-natural-green']")
WebElement branchBonusTextInAlchmeyVerify; ///////

@FindBy(xpath = "//span[text()='(transferred)']")
WebElement transferedTextDisplay;

@FindBy(xpath = "//div[@class='card-header']/div/div/button[text()='Approved']")
List<WebElement> approvedConfirm;

@FindBy(xpath = "//div[contains(@class,'col pl')]/div")
List<WebElement> branchDetailsTagTexts;


public void verifybranchDetailsTagTexts() {
	
}
public void searchAddedBranch(String Name) {
	name_SearchBox.sendKeys(Name);
}

public void clickBranchesTab() {
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
	wait.until(ExpectedConditions.invisibilityOf(pageLoader));
	wait.until(ExpectedConditions.elementToBeClickable(phone_SearchBox));
	phone_SearchBox.clear();
	phone_SearchBox.sendKeys(pNum);
}
public void editBranchCityDetails(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	editBranch();
	editUserCity("Dehradun");
	saveUserDetails();
	
}

public void editBranchNameDetails(String pNum) throws InterruptedException {
	clickBranchesTab();
	Thread.sleep(5000);
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	editBranch();
	editNameTextFeild.clear();
	editNameTextFeild.sendKeys("Ashish "+randomLastName);
	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
	saveUserDetails();
}

public void suspendBranchAccount(String pNum) throws InterruptedException {
	clickBranchesTab();
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.invisibilityOf(pageLoader));
	wait.until(ExpectedConditions.elementToBeClickable(phone_SearchBox));
	phone_SearchBox.clear();
	phone_SearchBox.sendKeys(pNum);
	wait.until(ExpectedConditions.invisibilityOf(pageLoader));
	clickSpecificBranch();
	suspendAccount();
	Boolean verify = verfiyAlertBox();
	assert verify.equals(true);
	clickAlertBoxBtnOK();
	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
}

public void clickTokensActiveToggle(){
	tokensActive.click();
}

public void clickSplitModeToggle(){
	splitModeToggle.click();
}

public void clickUploadBuyReceiptsToggle(){
	uploadBuyReceiptsToggle.click();
}

public void clickTokenMarketToggle(){
	tokenMarketToggle.click();
}

public void clickTogglesInBranches(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	editBranch();
	//clickTokenMarketToggle();
	//clickSplitModeToggle();
	clickUploadBuyReceiptsToggle();
}
public void clickExchangeHistoryButton() {
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(exchangeHistory));
	exchangeHistory.click();
}
public void clickExchangeHistoryTab() {
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(exchangeHistoryTab));
	exchangeHistoryTab.click();
}


public void firstTransactionApproveExcHisB1(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	List<String>actualbranchDetailsText=new ArrayList<>();//left for Assertion
	for(WebElement branchDetails: branchDetailsTagTexts)
	actualbranchDetailsText.add(branchDetails.getText());
	Assert.assertEquals(actualbranchDetailsText, Arrays.asList("19","0","1","0"));
	Thread.sleep(3000);
	clickExchangeHistoryTab();
		
		transactions.get(0).click();
		Thread.sleep(2000);
		String alcBonus= branchBonusTextInAlchmeyVerify.getText();
		assertEquals(total_bonus_M_B1,alcBonus);
		String kgArr[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
		assertEquals(kgArr,alc_M_B1_ExngHisKgVerify);
		  Thread.sleep(2000);
		    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		    Thread.sleep(2000);
	 
}
public void transactionApproveExcHisB1(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	List<String> actualBr1TagsDetails = new ArrayList<>();
	for(WebElement branchDetails: branchDetailsTagTexts)
		actualBr1TagsDetails.add(branchDetails.getText()) ;
	System.out.println("B1="+actualBr1TagsDetails);
	
	List<String> expectedBr1TagsDetails = new ArrayList<>();
	expectedBr1TagsDetails.addAll(Arrays.asList("19","0","1","0"));
	Assert.assertEquals(actualBr1TagsDetails, expectedBr1TagsDetails);
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot) pbDriver;
    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
    Thread.sleep(2000);
    
	clickExchangeHistoryButton();
	for (int p=0; p<3; p++) {
		
	transactions.get(p).click();
	Thread.sleep(1000);
	for (int i=0;i<2;i++)
	{	
		
		noFraudNoErrorsToggle.get(i).click();
		Thread.sleep(5000);
	}
		
	String actualAlcBonus= branchBonusTextInAlchmeyVerify.getText();
	String actualAlcKgList[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
	
	if(p==0) {
		assertEquals(actualAlcBonus,alc_B1_ExngHisBonusVerify[0] );
		assertEquals(actualAlcKgList,alc_B1_B3_ExngHisKgVerify);
	}
	else if(p==1) {
		assertEquals(actualAlcBonus,alc_B1_ExngHisBonusVerify[1]);
		assertEquals(actualAlcKgList,alc_B1_B2_ExngHisKgVerify);
	}
	else if(p==2) {
		assertEquals(actualAlcBonus,alc_B1_ExngHisBonusVerify[2]);
		assertEquals(actualAlcKgList,alc_M_B1_ExngHisKgVerify);
	}
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(approveButton));
	approveButton.click();
	Thread.sleep(4000);
	}
	
	for(int i=0;i<approvedConfirm.size();i++) {
		String ac=approvedConfirm.get(i).getText();
		assertEquals(ac, "Approved");	
}
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
}
public void transactionApproveExcHisB2(String pNum) throws InterruptedException {

	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	List<String> actualBr2TagsDetails = new ArrayList<>();
	for(WebElement branchDetails: branchDetailsTagTexts)
		actualBr2TagsDetails.add(branchDetails.getText()) ;
	System.out.println("B2="+actualBr2TagsDetails);
	List<String> expectedBr2TagsDetails = new ArrayList<>();
	expectedBr2TagsDetails.addAll(Arrays.asList("0","0","0","0"));
	Assert.assertEquals(actualBr2TagsDetails, expectedBr2TagsDetails);
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot) pbDriver;
    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
    Thread.sleep(2000);
	
	clickExchangeHistoryButton();
	for (int p=0; p<=1; p++) {
	transactions.get(p).click();
	Thread.sleep(2000);
	
		
	String actualAlcBonus= branchBonusTextInAlchmeyVerify.getText();
	String actualAlcKgList[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
	
	if(p==0) {
		
		assertEquals(actualAlcBonus,alc_B2_ExngHisBonusVerify[0] );
		assertEquals(actualAlcKgList,alc_B2_P_ExngHisKgVerify);
		
		for (int i=0;i<2;i++)
		{	
			noFraudNoErrorsToggle.get(i).click();
			Thread.sleep(5000);
		}
	
		WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.elementToBeClickable(approveButton));
		approveButton.click();
		Thread.sleep(4000);
	}
	
	else if(p==1) {
		
		assertEquals(actualAlcBonus,alc_B2_ExngHisBonusVerify[1]);
		assertEquals(actualAlcKgList,alc_B1_B2_ExngHisKgVerify);
		transactions.get(p).click();
		Thread.sleep(2000);	
	}
	}
	
	for(int i=0;i<approvedConfirm.size();i++) {
		String ac=approvedConfirm.get(i).getText();
		assertEquals(ac, "Approved");	
}
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
}

public void transactionApproveExcHisB3(String pNum) throws InterruptedException {
	
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	List<String> actualBr3TagsDetails = new ArrayList<>();
	for(WebElement branchDetails: branchDetailsTagTexts)
		actualBr3TagsDetails.add(branchDetails.getText()) ;
	System.out.println("B3="+actualBr3TagsDetails);
	List<String> expectedBr3TagsDetails = new ArrayList<>();
	expectedBr3TagsDetails.addAll(Arrays.asList("0","0","0","0"));
	Assert.assertEquals(actualBr3TagsDetails, expectedBr3TagsDetails);
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot) pbDriver;
    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
    Thread.sleep(2000);
	
	clickExchangeHistoryButton();
	
	for (int p=0; p<=1; p++) {		
	transactions.get(p).click();
	Thread.sleep(1000);
	
		
	String actualAlcBonus= branchBonusTextInAlchmeyVerify.getText();
	String actualAlcKgList[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
	
	if(p==0) {
		
		assertEquals(alc_B3_ExngHisBonusVerify[0],actualAlcBonus );
		assertEquals(alc_B3_P_ExngHisKgVerify,actualAlcKgList);
		
		for (int i=0;i<2;i++)
		{	
			noFraudNoErrorsToggle.get(i).click();
			Thread.sleep(5000);
		}
	
		WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.elementToBeClickable(approveButton));
		approveButton.click();
		Thread.sleep(4000);
	}
	
	else if(p==1) {
	
		assertEquals(actualAlcBonus,alc_B3_ExngHisBonusVerify[1]);
		assertEquals(actualAlcKgList,alc_B1_B3_ExngHisKgVerify);
		transactions.get(p).click();
		Thread.sleep(2000);
		
	}
	}
	
	for(int i=0;i<approvedConfirm.size();i++) {
		String ac=approvedConfirm.get(i).getText();
		assertEquals(ac, "Approved");	
	}
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
}

public void verifyBonusTransfered(String pNum) throws InterruptedException {
	
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	clickExchangeHistoryButton();
	Thread.sleep(2000);
	for (WebElement transaction:transactions) {

		transaction.click();
		Thread.sleep(4000);
		assertTrue(transferedTextDisplay.isDisplayed());
		Thread.sleep(2000);
			TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		    Thread.sleep(3000);
		    transaction.click();
		}
	}

public void transactionApproveInBranch(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	Thread.sleep(2000);
    
	clickExchangeHistoryButton();
	for (int p=0; p<3; p++) {
		
	transactions.get(p).click();
	Thread.sleep(1000);
	for (int i=0;i<2;i++)
	{	
		
		noFraudNoErrorsToggle.get(i).click();
		Thread.sleep(5000);
	}
		
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(approveButton));
	approveButton.click();
	Thread.sleep(4000);
	}
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
}
public void verifyBonusInBranchExcHistory(String pNum) throws InterruptedException {
	
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	clickExchangeHistoryButton();
	Thread.sleep(2000);
	for (WebElement transaction:transactions) {

		transaction.click();
		Thread.sleep(4000);
		assertTrue(transferedTextDisplay.isDisplayed());
		Thread.sleep(2000);
			TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		    Thread.sleep(3000);
		    transaction.click();
		}
}
}

