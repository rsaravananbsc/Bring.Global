package flight.Booking;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import base.Class.*;
import pom.Class.ryanAir_FlightSelection;
import pom.Class.ryanAir_HomeScreen;
import pom.Class.ryanAir_PassengerDetails;
import pom.Class.ryanAir_SeatSelection;


public class bookingToMalaga extends BaseTest {
	@Test(priority=1,groups="smoke")
	public void test_FlightBookings() throws InterruptedException{
		String Destination=Excel.getCellValue(XL_PATH,"Bookings",1,0);
		String pass1_Firstname=Excel.getCellValue(XL_PATH,"Bookings",1,1);
		String pass1_Lastname=Excel.getCellValue(XL_PATH,"Bookings",1,2);
		String pass2_Firstname=Excel.getCellValue(XL_PATH,"Bookings",2,1);
		String pass2_Lastname=Excel.getCellValue(XL_PATH,"Bookings",2,2);
		String child1_Firstname=Excel.getCellValue(XL_PATH,"Bookings",3,1);
		String child1_Lastname=Excel.getCellValue(XL_PATH,"Bookings",3,2);
		
		
		ryanAir_HomeScreen HS = new ryanAir_HomeScreen(driver);
		Thread.sleep(10000); //Given 10 Seconds to Handle Cookies Popups Manually.
		
		HS.input_Destination(Destination);
		HS.clickItem_Destination();
		HS.select_DepatureMonth();
		HS.select_DepatureDate();
		HS.select_ReturnDate();
		
		HS.adult_CountIncrement();
		HS.child_CountIncrement();
		HS.button_Search();
		
		ryanAir_FlightSelection FS = new ryanAir_FlightSelection(driver);
		FS.flightType_Direct();
		FS.packageType_ValuePack();
		FS.returnflightType_Direct();
		FS.packageType_ValuePack();
		FS.click_LoginInLater();
		
		ryanAir_PassengerDetails PD = new ryanAir_PassengerDetails(driver);
		PD.Click_Title1();
		PD.Click_Mr();
		PD.Pass1_FirstName(pass1_Firstname);
		PD.Pass1_LastName(pass1_Lastname);
		
		PD.Pass2_FirstName(pass2_Firstname);
		PD.Pass2_LastName(pass2_Lastname);
		PD.Click_Title2();
		PD.Click_Mrs();
		
		PD.child1_FirstName(child1_Firstname);
		PD.child1_LastName(child1_Lastname);
		PD.Click_Continue();
		
		ryanAir_SeatSelection SS = new ryanAir_SeatSelection(driver);
		Thread.sleep(10000);
		SS.Click_OkayIGotit();
		Thread.sleep(5000);
		SS.Click_Seat1();
		Thread.sleep(5000);
		SS.Click_Seat2();
		Thread.sleep(5000);
		SS.Click_Seat3();
		Thread.sleep(5000);
		SS.Click_nextFlight();
		Thread.sleep(5000);
		SS.Click_PickSameSeats();
		Thread.sleep(5000);
		SS.Click_BaggageItem();
		Thread.sleep(5000);
		SS.Click_Continue2();
		Thread.sleep(5000);
		SS.Click_Continue3();
		Thread.sleep(5000);
	
	}
}

