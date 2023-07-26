package plastic_Bank_Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PB_Register_Store extends BaseClass {
	
public PB_Register_Store(AndroidDriver pBriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(pbDriver), this);
		}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Store\")")
	public WebElement store;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CREATE STORE\")")
	public WebElement createStroe;
	@AndroidFindBy(uiAutomator= "new UiSelector().text(\"camera\")")
	public WebElement camera;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"checkmark\")")
	public WebElement finalconfirmation;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Take a picture\")")
	public WebElement takeAPicture;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
	public WebElement permission;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
	public WebElement allow;
	@AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"Shutter\"]")
	public WebElement shutter;
	@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
	public WebElement photoDone;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Use Photo\")")
	public WebElement usePhoto;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm\")")
	public WebElement confirmButton;
	@AndroidFindBy(xpath= "(//android.view.View/android.widget.EditText)[1]")
	public WebElement businessName;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
	public WebElement saveButton;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
	public WebElement okButton;
	@AndroidFindBy(xpath= "(//android.view.View/android.widget.EditText)[1]")
	public WebElement itemName;
	@AndroidFindBy(xpath= "(//android.view.View/android.widget.EditText)[2]")
	public WebElement priceInPhp;
	@AndroidFindBy(xpath= "(//android.view.View/android.widget.EditText)[3]")
	public WebElement amountInStock;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Done\")")
	public WebElement doneButton;
	
	
	
	
	public void clickStore() {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(store)));
		store.click();
	}
	
	public void clickCreateStroe() {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(createStroe)));
		createStroe.click();
	}
	
	public void uploadphoto() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		Thread.sleep(4000);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(camera)));
		camera.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takeAPicture)));
		Thread.sleep(2000);
		takeAPicture.click();
	  wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
		permission.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
	  allow.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
		shutter.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
		photoDone.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmButton)));
		confirmButton.click();
		
	}
	
	public void uploadPhotoItems() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		Thread.sleep(4000);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(camera)));
		camera.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takeAPicture)));
		Thread.sleep(2000);
		takeAPicture.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
		shutter.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
		photoDone.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmButton)));
		confirmButton.click();
		
	}
	public void typeBusinessName(String bussiness_name) {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(businessName)));
		businessName.sendKeys(bussiness_name);
	}
	
	public void clickSaveButton() {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(saveButton)));
		saveButton.click();
	}
	
	public void clickOkButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(okButton)));
	    okButton.click();
	}
	
	public void typeItemName(String item_name) {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(itemName)));
		itemName.sendKeys(item_name);
	}
	
	public void typePriceInPhp(String prince_in_php) {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(priceInPhp)));
		priceInPhp.sendKeys(prince_in_php);
	}
	
	public void amountInStock(String amount_in_stock) {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(amountInStock)));
		amountInStock.sendKeys(amount_in_stock);
	}
	
	public void clickDoneButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(doneButton)));
	    doneButton.click();
	}
	
	public void fillBusnessData(String bussnessName) throws InterruptedException {
		clickStore();
		clickCreateStroe();
		uploadphoto();
		typeBusinessName(bussnessName);
		clickSaveButton();
		clickOkButton();
	}
	
	public void fillItemsData(String firstItem, String PriceInPhp, String amountInStock) throws InterruptedException {
		uploadPhotoItems();
		typeItemName(firstItem);
		typePriceInPhp(PriceInPhp);
		amountInStock(amountInStock);
		clickSaveButton();
		clickDoneButton();
		Thread.sleep(5000);
	}
	
	

}
