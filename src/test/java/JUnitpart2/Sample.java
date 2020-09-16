package JUnitpart2;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Sample {

	
	public static WebDriver driver;
	
	@Test
	public void tc1() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		Assert.assertTrue(title.contains("Facebook"));
		
		driver.findElement(By.id("email")).sendKeys("dorababu5424@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("dora@5424");
	
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(3000);
		
		
		
		String title1 = driver.getCurrentUrl();
		Assert.assertTrue(title1.contains("login"));
		
		System.out.println("test case 1 done ");
	
	}
	
	@Test
	public void tc3() {
		// TODO Auto-generated method stub
		driver.quit();
		System.out.println("test case 3");
	}
	
	
	
	
}
