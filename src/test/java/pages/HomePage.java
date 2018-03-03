package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Page;

public class HomePage {
	WebDriver driver;
	Actions action;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		action = new Actions(driver);
	}
	
	@FindBy(id="headerMyAccount")
	WebElement myAccountLink;
	
	@FindBy(id="authSignIn")
	WebElement signInButton;
	
	@FindBy(id = "authRegister")
	WebElement registerButton;
	
	@FindBy(id="email_id")
	WebElement email_id_TextBox;
	
	@FindBy(id="password")
	WebElement password_TextBox;
	
	@FindBy(id="accountSignIn")
	WebElement signIn_Button;
	
	@FindBy(id="headerMyAccount")
	public WebElement welcomeTitle;
	
	@FindBy(className = "ShoppingLinks")
	WebElement shoppingLinks;
	
	@FindBy(id="departmentsFlyout")
	WebElement allDepartmentsLink;
	
	@FindBy(className="MainFlyout__level1Wrapper")
	WebElement mainFlyout_level1;
	
	@FindBy(id="roomFlyout")
	WebElement shopByRoomDDL;
	
	@FindBy(id="diyFlyout")
	WebElement diyFlayout;
	
	@FindBy(id="hsFlyout")
	WebElement homeServicesFlayout;
	
	@FindBy(xpath="//div[@class='content']//a[contains(text(),'Rugs')]")
	public WebElement rugsLink;
	
	@FindBy(xpath="//a[.='Living Room']")
	WebElement livingRoomLink;
	
	
	public void sign_in(String email, String password) {
		myAccountLink.click();
		Page.sleep(2000);
		signInButton.click();
		Page.sleep(2000);
		email_id_TextBox.sendKeys(email);
		Page.sleep(1000);
		password_TextBox.sendKeys(password);
		Page.sleep(1000);
		signIn_Button.click();
	}
	public void hoverOverShoppingLinks(int liIndex) throws InterruptedException {
		WebElement link;
		if(liIndex == 0) {
			link = shoppingLinks.findElement(By.xpath("//a[text()='All Departments']/.."));
			action.moveToElement(link).perform();
			Thread.sleep(2000);
			Assert.assertTrue(mainFlyout_level1.isDisplayed());
		}
		else if(liIndex == 1) {
			link = shoppingLinks.findElement(By.xpath("//a[text()='Shop by Room']/.."));
			action.moveToElement(link).perform();
			Thread.sleep(2000);
			Assert.assertTrue(shopByRoomDDL.isDisplayed());
		}
		else if(liIndex == 2) {
			link = shoppingLinks.findElement(By.xpath("//a[text()='DIY Projects & Ideas' and @data-id='diyProjectsIdeas']/.."));
			action.moveToElement(link).perform();
			Thread.sleep(2000);
			Assert.assertTrue(diyFlayout.isDisplayed());
		}
		else if(liIndex == 3) {
			link = shoppingLinks.findElement(By.xpath("//a[text()='Home Services' and @data-id='homeServices']/.."));
			action.moveToElement(link).perform();
			Thread.sleep(2000);
			Assert.assertTrue(homeServicesFlayout.isDisplayed());
		}
		else if(liIndex == 4) {
			link = shoppingLinks.findElement(By.xpath("//a[text()='Specials & Offers' and @class='ShoppingLinks__link']/.."));
		}		
		else if(liIndex == 5) {
			link = shoppingLinks.findElement(By.xpath("//a[text()='Local Ad' and @class='ShoppingLinks__link']/.."));
		}
		
	}
}
