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

public class ryanAir_FlightSelection {
	
	@FindBy(xpath = "(//div[@class='card-info__col card-info__col--vertical-stretch'][contains(.,'Type Direct')])[1]")
	private WebElement flightType_Direct; 
	
	@FindBy(xpath = "//span[contains(.,'Continue with Value fare')]")
	private WebElement packageType_ValuePack;
	
	@FindBy(xpath = "(//div[@class='card-info__col card-info__col--vertical-stretch'][contains(.,'Type Direct')])[2]")
	private WebElement returnflightType_Direct;
	
	@FindBy(xpath = "//span[contains(@class,'login-touchpoint__login-later h3')]")
	private WebElement click_LoginInLater;
	
	public ryanAir_FlightSelection(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void flightType_Direct() throws InterruptedException{
		flightType_Direct.click();
		AUL.executionSpeed(3);
	}
	
	public void packageType_ValuePack() throws InterruptedException{
		packageType_ValuePack.click();
		AUL.executionSpeed(3);
	}
	
	public void returnflightType_Direct() throws InterruptedException{
		returnflightType_Direct.click();
		AUL.executionSpeed(3);
	}
	
	public void click_LoginInLater() throws InterruptedException{
		click_LoginInLater.click();
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









