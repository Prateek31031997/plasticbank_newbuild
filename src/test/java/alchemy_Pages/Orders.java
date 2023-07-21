/*
 * package alchemy_Pages;
 * 
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.support.CacheLookup; import
 * org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory;
 * 
 * import Utilities.BaseClass;
 * 
 * public class Orders extends BaseClass{ public Orders(WebDriver alcDriver) {
 * 
 * PageFactory.initElements(alcDriver, this); }
 * 
 * @FindBy(xpath="//div[@class='sidebar-container non-prod-sidebar']//div[5]"
 * ) @CacheLookup private WebElement ordeerTagSideBar;
 * 
 * @FindBy(xpath="//input[@placeholder='Brand']") @CacheLookup private
 * WebElement brand;
 * 
 * @FindBy(xpath="//input[@placeholder='Name']") @CacheLookup private WebElement
 * name;
 * 
 * @FindBy(xpath="//input[@placeholder='Country']") @CacheLookup private
 * WebElement country;
 * 
 * @FindBy(xpath="//input[@placeholder='Date Created']") @CacheLookup private
 * WebElement dateCreated;
 * 
 * @FindBy(xpath="//input[@placeholder='Due date']") @CacheLookup private
 * WebElement dueDate;
 * 
 * @FindBy(xpath="//input[@placeholder='Total weight']") @CacheLookup private
 * WebElement totalWeight;
 * 
 * @FindBy(xpath="//input[@placeholder='Amount Fulfilled']") @CacheLookup
 * private WebElement amountFulfilled;
 * 
 * @FindBy(xpath="//input[@placeholder='Status']") @CacheLookup private
 * WebElement status;
 * 
 * @FindBy(xpath="//input[@placeholder='Shipping Date']") @CacheLookup private
 * WebElement shippingDate;
 * 
 * 
 * 
 * @FindBy(xpath="//div[@class='ml-2 mr-4 pointer lh40 active-tab']"
 * ) @CacheLookup private WebElement orderDetails;
 * 
 * @FindBy(xpath="//div[@class='pointer lh40']") @CacheLookup private WebElement
 * auditTrail;
 * 
 * @FindBy(xpath="//span[@class='fs19 underline']") @CacheLookup private
 * WebElement editOrder;
 * 
 * @FindBy(xpath="//div[@class='col panel-title pl-0 pr-2']") @CacheLookup
 * private WebElement orderName:ToplunMega;
 * 
 * @FindBy(xpath="//span[normalize-space()='Indonesia']") @CacheLookup private
 * WebElement indonesia;
 * 
 * @FindBy(xpath="//div[normalize-space()='Order Graph']") @CacheLookup private
 * WebElement orderGraph;
 * 
 * @FindBy(
 * xpath="//div[@class='panel-title d-flex p-4'][normalize-space()='Processors']"
 * ) @CacheLookup private WebElement processors;
 * 
 * @FindBy(xpath="//div[normalize-space()='Connected Bonus Orders']"
 * ) @CacheLookup private WebElement connectedBonusOrders;
 * 
 * @FindBy(xpath="//div[normalize-space()='Connected Bonus Orders']"
 * ) @CacheLookup private WebElement connectedBonusOrders;
 * 
 * @FindBy(
 * xpath="//div[normalize-space()='Associated Transaction Items From Exchange History']"
 * ) @CacheLookup private WebElement associatedTransactionItemsF;
 * 
 * @FindBy(xpath="//div[@class='add-container p-4']") @CacheLookup private
 * WebElement addBonus;
 * 
 * @FindBy(xpath="//div[normalize-space()='Offline Data']") @CacheLookup private
 * WebElement offlineData;
 * 
 * @FindBy(xpath="//div[normalize-space()='Add From Exchange History']"
 * ) @CacheLookup private WebElement addFromExchangeHistory;
 * 
 * 
 * @FindBy(xpath="//input[@id='name']") @CacheLookup private WebElement brand;
 * 
 * @FindBy(xpath="//input[@id='brand']") @CacheLookup private WebElement brand;
 * 
 * @FindBy(xpath="//input[@id='shippingDate']") @CacheLookup private WebElement
 * shippingDate;
 * 
 * @FindBy(xpath="//input[@id='productionDate']") @CacheLookup private
 * WebElement productionDate;
 * 
 * @FindBy(xpath="//input[@id='subBrand']") @CacheLookup private WebElement
 * sub-Brand;
 * 
 * @FindBy(xpath="//input[@id='brand']") @CacheLookup private WebElement brand;
 * 
 * @FindBy(
 * xpath="//body/app-root/div[@class='router-container-full']/main[@class='ng-star-inserted']/div[@class='body']/div[@class='main']/div[@class='content']/div[@class='box']/div[@class='main-container']/base-orders-offsets[@class='ng-star-inserted']/order-view-edit[@class='ng-star-inserted']/div[@class='container-fluid ng-star-inserted']/div/div[@class='tab-content']/div[@id='ngb-nav-3-panel']/order-edit[@class='ng-star-inserted']/div[@class='container-fluid']/div[@class='row']/div[@class='col']/div[@class='section-white-container box-shadow mt-4']/div[@class='row']/div[@class='col']/div[@class='row p-3']/div[1]/input[1]"
 * ) @CacheLookup private WebElement orderName;
 * 
 * @FindBy(xpath="//div[@class='pb-button green']") @CacheLookup private
 * WebElement save;
 * 
 * @FindBy(xpath="//div[@class='pb-button grey']") @CacheLookup private
 * WebElement cancel; }
 */