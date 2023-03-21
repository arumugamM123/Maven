package org.test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String args[]) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver a=new ChromeDriver();
		
		a.navigate().to("https://www.flipkart.com");
		
		a.manage().window().maximize();
		
		a.findElement(By.xpath("//button[text()='✕']")).click();
		
		a.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi mobiles",Keys.ENTER);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("(//div[@class='_4rR01T'][1])", "(//div[@class=\"_30jeq3 _1_WHN1\"][1])");
		map.put("(//div[@class='_4rR01T'][1])", "(//div[@class=\"_30jeq3 _1_WHN1\"][1])");


		Set<Entry<String,String>> entrya=map.entrySet();
		for (Entry<String,String> entry: entrya ) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	}

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * WebElement aa=a.findElement(By.xpath("//div[text()='Grocery']"));
		 * 
		 * Actions b=new Actions(a);
		 * 
		 * b.moveToElement(aa).perform(); Thread.sleep(2000);
		 * 
		 * WebElement a1=a.findElement(By.xpath("//div[text()='Fashion']"));
		 * 
		 * Actions b1=new Actions(a);
		 * 
		 * b1.moveToElement(a1).perform(); Thread.sleep(2000);
		 * 
		 * a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * WebElement a3=a.findElement(By.xpath("//div[text()='Home']"));
		 * 
		 * Actions b2=new Actions(a);
		 * 
		 * b2.moveToElement(a3).perform(); Thread.sleep(2000);
		 * 
		 * WebElement a4=a.findElement(By.xpath("//div[text()='Travel']"));
		 * 
		 * Actions b3=new Actions(a);
		 * 
		 * b2.moveToElement(a4).perform(); Thread.sleep(2000);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


