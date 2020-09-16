package Junitcorerun;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Selectinghotel  {
	
	public static WebDriver driver;

	@Test
	public void Hotelselect() throws AWTException {
		// TODO Auto-generated method stub
		driver.navigate().refresh();
	
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
		
		System.out.println("Test case 2 done in seleted class");
	}
	
	
}
