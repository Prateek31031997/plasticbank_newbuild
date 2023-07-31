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

public class PB_Transaction extends BaseClass {
	
public PB_Transaction(AndroidDriver pbDriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(pbDriver), this);
	}
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement search;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(31)")
public WebElement searchResult;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"checkmark\")")
public WebElement checkmark;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"PET-Raw-Transparent\")")
public WebElement pet;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"HDPE-Clean-Clear\")")
public WebElement hdpe;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"search outline\")")
public WebElement searchOutline;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement requiredQuantity;

WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(10));
public void getMaterialFrom(String type,String number, String load) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark)));
    checkmark.click();
    if(type=="pet") {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
	pet.click();
    }
    else if(type=="hdpe") {
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
    	hdpe.click();
    }
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys(load);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark)));
    checkmark.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark)));
    checkmark.click();
    
    
	
	  wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	  checkmark))); checkmark.click();
	 
}
}
