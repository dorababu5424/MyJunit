package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Fbjnit {
	public static WebDriver driver;
	@BeforeClass
	public static void lunchbowser() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Lunch Bowser fb");
	}  
	@AfterClass
	public static void CloseBowser() {
		// TODO Auto-generated method stub
		driver.quit();
		System.out.println("close the bowser");
	}
	@Before
	public void starttime() {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void Endtime() {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);	
	}
	@Test
	
	
	public void Invalidata() {
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dorababu");
		
		driver.findElement(By.id("pass")).sendKeys("dorababu");
		driver.findElement(By.id("//xpath[text()='Log In']")).click();	
		System.out.println("test case using invalid data");
	}
	@Test
	
	public void validata() {
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dorababu");
		
		driver.findElement(By.id("pass")).sendKeys("dorababu");
		driver.findElement(By.id("//xpath[text()='Log In']")).click();	
		System.out.println("test case using valid data");
	}
	
	
	
	
	

}
