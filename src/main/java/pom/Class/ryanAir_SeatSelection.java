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

public class ryanAir_SeatSelection {
	
	@FindBy(xpath = "//button[contains(.,'Okay, got it.')]")
	private WebElement Click_OkayIGotit;
	
	@FindBy(xpath = "(//button[@class='ng-star-inserted seatmap__seat seatmap__seat--standard'])[55]")
	private WebElement Click_Seat1;
	
	@FindBy(xpath = "(//button[@class='ng-star-inserted seatmap__seat seatmap__seat--standard'])[55]")
	private WebElement Click_Seat2;
	
	@FindBy(xpath = "(//button[@class='ng-star-inserted seatmap__seat seatmap__seat--standard'])[55]")
	private WebElement Click_Seat3;
	
	@FindBy(xpath = "//button[contains(.,'Next flight')]")
	private WebElement Click_nextFlight;
	
	@FindBy(xpath = "//button[contains(.,'Pick these seats')]")
	private WebElement Click_PickSameSeats;
	
	@FindBy(xpath = "//p[contains(.,'1 Small Bag only')]")
	private WebElement Click_BaggageItem;
	
	@FindBy(xpath = "//button[contains(.,'Continue')]")
	private WebElement Click_Continue2;
	
	@FindBy(xpath = "//button[contains(.,'Continue')]")
	private WebElement Click_Continue3;
	
	public ryanAir_SeatSelection(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void Click_OkayIGotit() throws InterruptedException{
		AUL.executionSpeed(10);
		Click_OkayIGotit.click();
		AUL.executionSpeed(5);
	}
	
	public void Click_Seat1() throws InterruptedException{
		Click_Seat1.click();
		AUL.executionSpeed(5);
	}
	
	public void Click_Seat2() throws InterruptedException{
		Click_Seat2.click();
		AUL.executionSpeed(5);
	}
	
	public void Click_Seat3() throws InterruptedException{
		Click_Seat3.click();
		AUL.executionSpeed(5);
	}
	
	public void Click_nextFlight() throws InterruptedException{
		Click_nextFlight.click();
		AUL.executionSpeed(5);
	}
	
	public void Click_PickSameSeats() throws InterruptedException{
		Click_PickSameSeats.click();
		AUL.executionSpeed(5);
	}
	
		
	public void Click_BaggageItem() throws InterruptedException{
		Click_BaggageItem.click();
		AUL.executionSpeed(5);
	}
	
	public void Click_Continue2() throws InterruptedException{
		Click_Continue2.click();
		AUL.executionSpeed(5);
	}
	
	public void Click_Continue3() throws InterruptedException{
		Click_Continue3.click();
		AUL.executionSpeed(5);
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









