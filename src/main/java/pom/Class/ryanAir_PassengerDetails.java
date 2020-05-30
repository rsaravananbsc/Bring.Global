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

public class ryanAir_PassengerDetails {
	
	@FindBy(xpath = "(//button[contains(.,'-')])[1]")
	private WebElement Click_Title1;
	
	@FindBy(xpath = "(//div[@class='dropdown-item__label b2'][contains(.,'Mr')])[1]")
	private WebElement Click_Mr;
	
	@FindBy(xpath = "//input[@id='formState.passengers.ADT-0.name']")
	private WebElement Pass1_FirstName;
	
	@FindBy(xpath = "//input[@id='formState.passengers.ADT-0.surname']")
	private WebElement Pass1_LastName;
	
	
	@FindBy(xpath = "(//button[contains(.,'-')])[1]")
	private WebElement Click_Title2;
	
	@FindBy(xpath = "(//div[@class='dropdown-item__label b2'][contains(.,'Mrs')])[2]")
	private WebElement Click_Mrs;
	
	@FindBy(xpath = "//input[@id='formState.passengers.ADT-1.name']")
	private WebElement Pass2_FirstName;
	
	@FindBy(xpath = "//input[@id='formState.passengers.ADT-1.surname']")
	private WebElement Pass2_LastName;
	
	@FindBy(xpath = "//input[@id='formState.passengers.CHD-0.name']")
	private WebElement child1_FirstName;
	
	@FindBy(xpath = "//input[@id='formState.passengers.CHD-0.surname']")
	private WebElement child1_LastName;
	
	@FindBy(xpath = "//button[contains(.,'Continue')]")
	private WebElement Click_Continue;
	
	public ryanAir_PassengerDetails(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void Click_Title1() throws InterruptedException{
		Click_Title1.click();
		AUL.executionSpeed(3);
	}
	
	public void Click_Mr() throws InterruptedException{
		Click_Mr.click();
		AUL.executionSpeed(3);
	}
	
	public void Pass1_FirstName(String pass1_Firstname) throws InterruptedException{
		Pass1_FirstName.sendKeys(pass1_Firstname);
		AUL.executionSpeed(3);
	}
	
	public void Pass1_LastName(String pass1_Lastname) throws InterruptedException{
		Pass1_LastName.sendKeys(pass1_Lastname);
		AUL.executionSpeed(3);
	}
	
	public void Click_Title2() throws InterruptedException{
		Click_Title2.click();
		AUL.executionSpeed(3);
	}
	
	public void Click_Mrs() throws InterruptedException{
		Click_Mrs.click();
		AUL.executionSpeed(3);
	}
	
	public void Pass2_FirstName(String pass2_Firstname) throws InterruptedException{
		Pass2_FirstName.sendKeys(pass2_Firstname);
		AUL.executionSpeed(3);
	}
	
	public void Pass2_LastName(String pass2_Lastname) throws InterruptedException{
		Pass2_LastName.sendKeys(pass2_Lastname);
		AUL.executionSpeed(3);
	}
	
	public void child1_FirstName(String child1_Firstname) throws InterruptedException{
		child1_FirstName.sendKeys(child1_Firstname);
		AUL.executionSpeed(3);
	}
	
	public void child1_LastName(String child1_Lastname) throws InterruptedException{
		child1_LastName.sendKeys(child1_Lastname);
		AUL.executionSpeed(3);
	}
	
	public void Click_Continue() throws InterruptedException{
		Click_Continue.click();
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









