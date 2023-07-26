package alchemy_Pages;

import Utilities.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Stores extends BaseClass {

	public Stores(WebDriver alcDriver){
        PageFactory.initElements(alcDriver, this);
    }
    
	public String name = " GKStore ";
    @FindBy(xpath = "//div[@class='body']/div/div/div[text()=' Stores ']") private WebElement stores_tab;
    @FindBy(xpath = "//datatable//input[@placeholder='Name']") private WebElement name_SearchBox;
    @FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div") private WebElement tableData_FirstRow;
    @FindBy(xpath = "//div[@role='tabpanel']/div/div[1]/span") private WebElement edit_store;
    @FindBy(xpath = "//input[@name='city']") private WebElement edit_city;
    @FindBy(xpath = "//div[contains(@class, 'pb-button') and text()= 'Save ']") private WebElement save_btn;


    public void clickStoreTab(){
        stores_tab.click();
    }

    public void search_byName(String name) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(tableData_FirstRow));
        name_SearchBox.click();
        name_SearchBox.sendKeys(name);
        Thread.sleep(5000);
    }

    public String verifyCreatedStoreVisble(){
        return tableData_FirstRow.getText();
    }

    public void clickCreatedStoreVisble(){
        tableData_FirstRow.click();
    }
    
    public void clickEditStore() throws InterruptedException {
       // WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.elementToBeClickable(edit_store));
        Thread.sleep(20000);
        edit_store.click();
    }

    public void editUserCity(String cityName) {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(edit_city));
        edit_city.clear();
        edit_city.sendKeys(cityName);
    }

    public void saveStoreDetails() {
        save_btn.click();
    }

    public void verifyCreatedStore(String name) throws InterruptedException{
        clickStoreTab();
        search_byName(name);
        assert verifyCreatedStoreVisble().contains(name);
    }

    public void editStore_Details(String cityName) throws InterruptedException{
    	clickCreatedStoreVisble();
    	clickEditStore();
        editUserCity(cityName);
        saveStoreDetails();
    }
}
