package pom.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import base.Class.AUL;

public class ryanAir_HomeScreen {
	@FindBy(xpath = "//input[contains(@id,'destination')]")
	private WebElement input_Destination;
	
	@FindBy(xpath = "//span[@data-ref='airport-item__name'][contains(.,'Malaga')]")
	private WebElement clickItem_Destination;
	
	@FindBy(xpath = "(//div[@class='m-toggle__month'][contains(.,'Nov')])[1]")
	private WebElement select_DepatureMonth;
	
	@FindBy(xpath = "//div[contains(@data-id,'2020-11-01')]")
	private WebElement select_DepatureDate;
	
	@FindBy(xpath = "//div[contains(@data-id,'2020-11-15')]")
	private WebElement select_ReturnDate;
	
	@FindBy(xpath = "(//div[@class='counter__button-wrapper--enabled'])[1]")
	private WebElement adult_CountIncrement;
	
	@FindBy(xpath = "(//div[@class='counter__button-wrapper--enabled'])[4]")
	private WebElement child_CountIncrement;
	
	@FindBy(xpath = "//button[contains(@aria-label,'Done')]")
	private WebElement button_Done;
	
	@FindBy(xpath = "//ry-spinner[@color='white'][contains(.,'Search')]")
	private WebElement button_Search;
		
	public ryanAir_HomeScreen(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void input_Destination(String Destination) throws InterruptedException{
		input_Destination.sendKeys(Destination);
		AUL.executionSpeed(3);;
	}
	
	public void clickItem_Destination() throws InterruptedException{
		clickItem_Destination.click();
		AUL.executionSpeed(3);
	}
	
	public void select_DepatureMonth() throws InterruptedException{
		select_DepatureMonth.click();
		AUL.executionSpeed(3);
	}
	
	public void select_DepatureDate() throws InterruptedException{
		select_DepatureDate.click();
		AUL.executionSpeed(3);
	}
	
	public void select_ReturnDate() throws InterruptedException{
		select_ReturnDate.click();
		AUL.executionSpeed(3);
	}
	
	public void adult_CountIncrement() throws InterruptedException{
		adult_CountIncrement.click();
		AUL.executionSpeed(3);
	}
	
	public void child_CountIncrement() throws InterruptedException{
		child_CountIncrement.click();
		AUL.executionSpeed(3);
	}
	
	public void button_Done() throws InterruptedException{
		button_Done.click();
		AUL.executionSpeed(3);
	}
	
	public void button_Search() throws InterruptedException{
		button_Search.click();
		AUL.executionSpeed(3);
	}
	
	public void verifyTitle(WebDriver driver,String eTitle){
		WebDriverWait wait=new WebDriverWait(driver,10);
		try{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is Matching",true);
		}
		catch(Exception e){
			Reporter.log("Title is NOT Matching",true);
			Assert.fail();
		}
	}
	
}









