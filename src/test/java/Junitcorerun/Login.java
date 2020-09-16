package Junitcorerun;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Login {
	
	public static WebDriver  driver;
	
	@BeforeClass
	public  static void Browserlunch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	///Invalid user and vailded password
	public void invalidlogin() {
		// TODO Auto-generated method stub
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("dorababu5424");
		String value = user.getAttribute("value");
		driver.findElement(By.id("password")).sendKeys("Dora@1997");
	
		Assert.assertTrue(value.contains("dorababu424"));
		driver.findElement(By.id("login")).click();
		
		System.out.println("Test case one");
	}
	@Test
	//vailddata
	public void vaildlogin() {
		driver.navigate().refresh();
		// TODO Auto-generated method stub
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("dorababu5424");
		String value = user.getAttribute("value");
		driver.findElement(By.id("password")).sendKeys("Dora@1997");
		
		Assert.assertTrue(value.contains("dorababu5424"));
		driver.findElement(By.id("login")).click();
		System.out.println("Test case two");
		
		
	}
	
	@Test
	public void hotelslect1() {
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new  Select(loc);
		List<WebElement> alloptions = s.getOptions();
		WebElement options = alloptions.get(3);
		String text = options.getText();
		Assert.assertEquals("Brisbane", text);
		
		
	}
	
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
	
	
	
	

}
