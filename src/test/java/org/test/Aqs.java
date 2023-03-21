package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aqs {
	public static void main (String args[]) throws InterruptedException, AWTException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver a=new ChromeDriver();
	
	a.navigate().to("https://www.facebook.com");
	
	a.manage().window().maximize();
	a.switchTo().newWindow(WindowType.TAB);
	a.navigate().to("https://www.facebook.com");
	a.manage().window().maximize();


	
	WebElement aa=a.findElement(By.id("email"));
	
	aa.sendKeys("srehfhfjns");
	Actions a1=new Actions(a);
	
	a1.doubleClick(aa).build().perform();
	a1.contextClick(aa).build().perform();
	
	
	Robot a2= new Robot();
	for (int i = 0; i < 3; i++) {
		
		a2.keyPress(KeyEvent.VK_DOWN);
		a2.keyRelease(KeyEvent.VK_DOWN);
		
	}
	a2.keyPress(KeyEvent.VK_ENTER);
	a2.keyRelease(KeyEvent.VK_ENTER);
	
	a2.keyPress(KeyEvent.VK_TAB);
	a2.keyRelease(KeyEvent.VK_TAB);
	
	a2.keyPress(KeyEvent.VK_CONTROL);
	a2.keyPress(KeyEvent.VK_V);
	
	a2.keyRelease(KeyEvent.VK_CONTROL);
	a2.keyRelease(KeyEvent.VK_V);
	
	
	
	
	
	
	

	}
}
