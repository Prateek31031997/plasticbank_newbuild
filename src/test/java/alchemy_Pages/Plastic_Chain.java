package alchemy_Pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class Plastic_Chain extends BaseClass {
	
	public Plastic_Chain(WebDriver alcDriver){
        PageFactory.initElements(alcDriver, this);
    }
	
    @FindBy(xpath = "//div[@class='body']/div/div/div[text()=' Orders ']")
    WebElement orders_tab;
    @FindBy(xpath = "//a[@role='tab' and text()='Bonus']")
    WebElement ordersTab_bonus;
    @FindBy(xpath = "//datatable//input[@placeholder='Name']")
    WebElement name_SearchBox;
	
	@FindBy(xpath = "//loader/div//table")
	WebElement pageLoader;
    @FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div")
    WebElement tableData_FirstRow;
    @FindBy(xpath = "//div[text()='Exchange History ']")
    WebElement exchangeHistoryTag;
	
	@FindBy(xpath = "//span[text()='Plastic Chain']")
    WebElement plasticChain;
    @FindBy(xpath = "//i[@class='fa fa-arrow-right pointer fs15 text-green']")
    List<WebElement> greenArrow;
    @FindBy(xpath = "//i[@class='fa fa-arrow-right pointer fs15 text-orange']")
    List<WebElement> orangeArrow;
    
    @FindBy(xpath = "(//div[contains(@class,\"row border-bottom\")])[1]/span/span[not(contains(@class,'text-green'))and(not(contains(text(),'(Branch)'))and(not(contains(text(),'(Processor)'))))]")
    List<WebElement> pcRow1;
    @FindBy(xpath = "(//div[contains(@class,\"row border-bottom\")])[2]/span/span[not(contains(@class,'text-green'))and(not(contains(text(),'(Branch)'))and(not(contains(text(),'(Processor)'))))]")
    List<WebElement> pcRow2;
    @FindBy(xpath = "(//div[contains(@class,\"row border-bottom\")])[3]/span/span[not(contains(@class,'text-green'))and(not(contains(text(),'(Branch)'))and(not(contains(text(),'(Processor)'))))]")
    List<WebElement> pcRow3;
    @FindBy(xpath = "(//div[contains(@class,\"row border-bottom\")])[4]/span/span[not(contains(@class,'text-green'))and(not(contains(text(),'(Branch)'))and(not(contains(text(),'(Processor)'))))]")
    List<WebElement> pcRow4;
    @FindBy(xpath = "(//div[contains(@class,\"row border-bottom\")])[5]/span/span[not(contains(@class,'text-green'))and(not(contains(text(),'(Branch)'))and(not(contains(text(),'(Processor)'))))]")
    List<WebElement> pcRow5;
    @FindBy(xpath = "(//div[contains(@class,\"row border-bottom\")])[6]/span/span[not(contains(@class,'text-green'))and(not(contains(text(),'(Branch)'))and(not(contains(text(),'(Processor)'))))]")
    List<WebElement> pcRow6;
    @FindBy(xpath = "(//div[contains(@class,\"row border-bottom\")])[7]/span/span[not(contains(@class,'text-green'))and(not(contains(text(),'(Branch)'))and(not(contains(text(),'(Processor)'))))]")
    List<WebElement> pcRow7;
    @FindBy(xpath = "(//div[contains(@class,\"row border-bottom\")])[8]/span/span[not(contains(@class,'text-green'))and(not(contains(text(),'(Branch)'))and(not(contains(text(),'(Processor)'))))]")
    List<WebElement> pcRow8;
  
	public static ArrayList<String> pcRow1exp = new ArrayList<>();
	public static ArrayList<String> pcRow2exp = new ArrayList<>();
	public static ArrayList<String> pcRow3exp = new ArrayList<>();
	public static ArrayList<String> pcRow4exp = new ArrayList<>();
	public static ArrayList<String> pcRow5exp = new ArrayList<>();
	public static ArrayList<String> pcRow6exp = new ArrayList<>();
	public static ArrayList<String> pcRow7exp = new ArrayList<>();
	public static ArrayList<String> pcRow8exp = new ArrayList<>();
	
	
	private void clickOrdersTab() throws InterruptedException {
        Thread.sleep(3000);
        orders_tab.click();
    }

    private void clickBounsTab() throws InterruptedException {
        Thread.sleep(2000);
        ordersTab_bonus.click();
    }

    private void search_byName(String name) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(pageLoader));
        wait.until(ExpectedConditions.elementToBeClickable(name_SearchBox));
        name_SearchBox.click();
        name_SearchBox.clear();
        name_SearchBox.sendKeys(name);
        Thread.sleep(15000);
    }

    private void clickSpecificOrdersBonus() {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(tableData_FirstRow));
        tableData_FirstRow.click();
    }
    private void clickExchangeHistory() {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(exchangeHistoryTag));
        exchangeHistoryTag.click();
    }
    
	public void verifyGreenarrows(){
    	assertTrue(greenArrow.size()==12);
    	}

    	public void verifyOrangenarrows(){
    	assertTrue(orangeArrow.size()==12);
    	}

    
    public void plastic_ChainVerificationBefore(String bonusName) throws InterruptedException {
    	
    	clickOrdersTab();
    	clickBounsTab();
    	search_byName(bonusName);
    	clickSpecificOrdersBonus();
    	clickExchangeHistory();
    	
    	plasticChain.click();
    	verifyOrangenarrows();	
    	
    }
   // 
    public void ListElementsAssertion() {
    	
    	
        
    	pcRow1exp.add("HDPE - 4.00KG");
    	pcRow1exp.add(branch1_Name);
    	pcRow1exp.add(branch2_Name);
    	pcRow1exp.add(processor_Name);
    	
    	pcRow2exp.add("HDPE - 1.00KG");
    	pcRow2exp.add(branch1_Name);
    	pcRow2exp.add(branch3_Name);
    	pcRow2exp.add(processor_Name);
    	
    	pcRow3exp.add("HDPE - 1.00KG");
    	pcRow3exp.add(branch1_Name);
    	pcRow3exp.add(branch3_Name);
    	
    	pcRow4exp.add("HDPE - 4.00KG");
    	pcRow4exp.add(branch1_Name);
    	pcRow4exp.add(branch2_Name);
    	
    	pcRow5exp.add("PET - 3.00KG");
    	pcRow5exp.add(branch1_Name);
    	pcRow5exp.add(branch2_Name);
    	pcRow5exp.add(processor_Name);
    	
    	pcRow6exp.add("PET - 4.00KG");
    	pcRow6exp.add(branch1_Name);
    	pcRow6exp.add(branch2_Name);
    	
    	pcRow7exp.add("PET - 1.00KG");
    	pcRow7exp.add(branch1_Name);
    	pcRow7exp.add(branch3_Name);
    	pcRow7exp.add(processor_Name);
    	
    	pcRow8exp.add("PET - 1.00KG");
    	pcRow8exp.add(branch1_Name);
    	pcRow8exp.add(branch3_Name);
    	
    	List<List<String>> expectedLists = new ArrayList<>();
    	
    	expectedLists.add(pcRow1exp);
        expectedLists.add(pcRow2exp);
        expectedLists.add(pcRow3exp);
        expectedLists.add(pcRow4exp);
        expectedLists.add(pcRow5exp);
        expectedLists.add(pcRow6exp);
        expectedLists.add(pcRow7exp);
        expectedLists.add(pcRow8exp);
    	
    	
    	
    	List<String>pcRow1Actual = new ArrayList<>();
    	for(WebElement ele: pcRow1) {
    		pcRow1Actual.add(ele.getText());
    	}
    	List<String>pcRow2Actual = new ArrayList<>();
    	for(WebElement ele: pcRow2) {
    		pcRow2Actual.add(ele.getText());
    	}
    	List<String>pcRow3Actual = new ArrayList<>();
    	for(WebElement ele: pcRow3) {
    		pcRow3Actual.add(ele.getText());
    	}
    	List<String>pcRow4Actual = new ArrayList<>();
    	for(WebElement ele: pcRow4) {
    		pcRow4Actual.add(ele.getText());
    	}
    	List<String>pcRow5Actual = new ArrayList<>();
    	for(WebElement ele: pcRow5) {
    		pcRow5Actual.add(ele.getText());
    	}
    	List<String>pcRow6Actual = new ArrayList<>();
    	for(WebElement ele: pcRow6) {
    		pcRow6Actual.add(ele.getText());
    	}
    	List<String>pcRow7Actual = new ArrayList<>();
    	for(WebElement ele: pcRow7) {
    		pcRow7Actual.add(ele.getText());
    	}
    	List<String>pcRow8Actual = new ArrayList<>();
    	for(WebElement ele: pcRow8) {
    		pcRow8Actual.add(ele.getText());
    	}
    	
    	
    	boolean isMatching = false;
    	System.out.println("-------");

        for (List<String> expectedList : expectedLists) {
            if (expectedList.equals(pcRow1Actual)) {
                isMatching = true;
                System.out.println("1");
                break;
            }
        }
        
        assertTrue(isMatching == true);
        System.out.println("11");
        
        
        boolean isMatching2 = false;
        for (List<String> expectedList : expectedLists) {
            if (expectedList.equals(pcRow2Actual)) {
                isMatching2 = true;
                System.out.println("2");
                break;
            }
        }
        assertTrue(isMatching2 == true);
        System.out.println("22");
        
        
        boolean isMatching3 = false;
        for (List<String> expectedList : expectedLists) {
            if (expectedList.equals(pcRow3Actual)) {
                isMatching3 = true;
                System.out.println("3");
                break;
            }
        }
        assertTrue(isMatching3 == true);
        System.out.println("33");
        
        
        boolean isMatching4 = false;
        for (List<String> expectedList : expectedLists) {
            if (expectedList.equals(pcRow4Actual)) {
                isMatching4 = true;
                System.out.println("4");
                break;
            }
        }
        assertTrue(isMatching4 == true);
        System.out.println("44");
        
        
        boolean isMatching5 = false;
        for (List<String> expectedList : expectedLists) {
            if (expectedList.equals(pcRow5Actual)) {
                isMatching5 = true;
                System.out.println("5");
                break;
            }
        }
        System.out.println("55");
        assertTrue(isMatching5 == true);
        
        
        boolean isMatching6 = false;
        for (List<String> expectedList : expectedLists) {
            if (expectedList.equals(pcRow6Actual)) {
                isMatching6 = true;
                System.out.println("6");
                break;
            }
        }
        assertTrue(isMatching6 == true);
        System.out.println("66");
        
        
        boolean isMatching7 = false;
        for (List<String> expectedList : expectedLists) {
            if (expectedList.equals(pcRow7Actual)) {
                isMatching7 = true;
                System.out.println("7");
                break;
            }
        }
        assertTrue(isMatching7 == true);
        System.out.println("77");
        
        
        boolean isMatching8 = false;
        for (List<String> expectedList : expectedLists) {
            if (expectedList.equals(pcRow8Actual)) {
                isMatching8 = true;
                System.out.println("8");
                break;
            }
        }
        assertTrue(isMatching8 == true);
        System.out.println("88");
        
        
     
           	
    }
    public void plastic_ChainVerificationAfter(String bonusName) throws InterruptedException {
    	
    	clickOrdersTab();
    	clickBounsTab();
    	search_byName(bonusName);
    	clickSpecificOrdersBonus();
    	clickExchangeHistory();
    	plasticChain.click();
    	verifyGreenarrows();
    	
    	ListElementsAssertion();
    	
    }
	
	

}
