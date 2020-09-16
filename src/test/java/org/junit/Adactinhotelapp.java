package org.junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactinhotelapp {
	public static WebDriver driver;
	@BeforeClass
	public static void lunchbowser() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
	
	}  
	@AfterClass
	public static void CloseBowser() throws InterruptedException {
		// TODO Auto-generated method stub
	

		System.out.println("close the bowser");
	}
//	@Before
//	public void starttime() {
//		// TODO Auto-generated method stub
//		Date d = new Date();
//		System.out.println(d);
//	}
//	@After
//	public void Endtime() {
//		// TODO Auto-generated method stub
//		Date d = new Date();
//		System.out.println(d);	
//	}
	
	//login page
	@Test
	public void login() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("username")).sendKeys("dorababu5424");
		driver.findElement(By.id("password")).sendKeys("Dora@1997");
		driver.findElement(By.id("login")).click();
		System.out.println("Test case 1 done");
	}

	//select hotel
	@Test
	public void Hotelselect() throws AWTException {
		// TODO Auto-generated method stub
	
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new  Select(loc);
		s.selectByValue("Brisbane");
		Select s1  = new Select(driver.findElement(By.id("hotels")));
		s1.selectByValue("Hotel Hervey");
		Select s2 = new Select(driver.findElement(By.id("room_type")));
		s2.selectByValue("Double");
		Robot r = new Robot();
		
		
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
	
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Test case 2done");
	}
	
	
	@Test
	public void Hotelselect1()  {
		// TODO Auto-generated method stub
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		System.out.println("Test case 3 done");
		
	}
	
	
	
	@Test
	public void BookingDeatils() {
		// TODO Auto-generated method stub
		
		driver.findElement(By.id("first_name")).sendKeys("Dorababu");
		driver.findElement(By.id("last_name")).sendKeys("Chodavarapu");
		driver.findElement(By.id("address")).sendKeys("Hyderabad");
		driver.findElement(By.id("cc_num")).sendKeys("12345678912345678");
		
		Select s1  = new Select(driver.findElement(By.id("cc_type")));
		s1.selectByValue("VISA");
		Select s2  = new Select(driver.findElement(By.id("cc_exp_month")));
		s1.selectByValue("3");
		Select s3  = new Select(driver.findElement(By.id("cc_exp_year")));
		s1.selectByValue("2013");
		driver.findElement(By.id("cc_cvv")).sendKeys("177");
		driver.findElement(By.id("book_now")).click();
		
		
		System.out.println("test case 4 done");
		
		
	}
	@Test
	
	public void Orderid() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
