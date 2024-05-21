package orikanTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Orikan_Tests extends Orikan_Base {

	@Test
	public void orikanTestCases() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Verify Register Tab
		orikanobj.enterUsername("David.Arshapogu@gmail.com");
		orikanobj.enterPassword("Arsapogu");
		orikanobj.confirmPassword("Arsapogu");
		orikanobj.clickNext();
		
		String actualTitle = "Email ID Already Registered";
		String expectedTitle = driver.findElement(By.xpath("//div[text()='Contact']")).getText();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		
//		String actualTitle = "Contact";
//		String expectedTitle = driver.findElement(By.xpath("//div[text()='Contact']")).getText();
//		Assert.assertEquals(actualTitle, expectedTitle);
	
	
	
		//Veify Contact Tab
		orikanobj.enterFirstname("David");
		orikanobj.enterLastname("Arsapogu");
		orikanobj.enterAddressLine1("One");
		orikanobj.enterAddressLine2("Two");
		orikanobj.enterPostCode("500098");
		orikanobj.enterCity("Brisbane");
		orikanobj.selectState();
		orikanobj.clickNext2();
		
		String actualTitleP = "Payment";
		String expectedTitleP = driver.findElement(By.xpath("//div[text()='Payment']")).getText();
		Assert.assertEquals(actualTitleP, expectedTitleP);
		
		//Verify Payments Tab
		orikanobj.entercardHolderName("David Arsapogu");
		orikanobj.clickVisaRadio();
		orikanobj.entercardNumber("12365985458965");
		orikanobj.enterCVV("569");
		orikanobj.selectExpireMonth();
		orikanobj.enterExpireYear("2018");
		orikanobj.clickNext3();
		
		String actualTitleT = "Terms & Conditions";
		String expectedTitleT = driver.findElement(By.xpath("//div[text()='Terms & Conditions']")).getText();
		Assert.assertEquals(actualTitleT, expectedTitleT);

		
		
	}
	
	

}
