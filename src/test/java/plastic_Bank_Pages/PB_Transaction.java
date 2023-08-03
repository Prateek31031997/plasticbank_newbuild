package plastic_Bank_Pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
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
public List<WebElement> checkmark;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Delayed bonus until approval\")")
public List<WebElement> transactions;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"PET-Raw-Transparent\")")
public WebElement pet;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"HDPE-Clean-Clear\")")
public WebElement hdpe;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"search outline\")")
public WebElement searchOutline;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Add Picture\")")
public WebElement addPicture;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Take a picture\")")
public WebElement takePicture;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"OK\")")
public WebElement ok;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement requiredQuantity;
@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
public WebElement photoDone;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Exchange History\")")
public WebElement exchangeHistory;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\")")
public List<WebElement>rewards;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;

WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(10));
public void doTransaction(String number, String load1, String load2) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys(load1);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys(load2);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
    try {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
    	permission.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
        allow.click();
        Thread.sleep(5000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
        }catch(Exception e) {
        	Thread.sleep(5000);
            PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
            Sequence scrollShutter = new Sequence(fingerShutter, 1);
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerDown(0));
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerUp(0));
            pbDriver.perform(Arrays.asList(scrollShutter));
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}

public void verifyExchangeHistory() {
	PointerInput fingerScroll = new PointerInput(PointerInput.Kind.TOUCH, "fingerScroll");
    Sequence scrollUP = new Sequence(fingerScroll, 1);
    scrollUP.addAction(fingerScroll.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 545, 1930));
    scrollUP.addAction(fingerScroll.createPointerDown(0));
    scrollUP.addAction(fingerScroll.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 545, 200));
    scrollUP.addAction(fingerScroll.createPointerUp(0));
    pbDriver.perform(Arrays.asList(scrollUP));
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(exchangeHistory))); 
    exchangeHistory.click(); 
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactions.get(0)))); 
    transactions.get(0).click(); 
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(rewards.get(0)))); 
    String firstText= rewards.get(0).getText();
    String secondText= rewards.get(1).getText();
    int totalcoins=Integer.parseInt(firstText)+ Integer.parseInt(secondText);
    String BonusPerTransaction=Integer.toString(totalcoins);

}
public void verifyTransactionPB() {
	
	
}

}
