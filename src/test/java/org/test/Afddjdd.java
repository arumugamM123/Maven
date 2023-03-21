package org.test;

import java.security.Key;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Afddjdd {
	public static void main (String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver a=new ChromeDriver();
		

		a.navigate().to("https://www.flipkart.com");
		
		a.manage().window().maximize();
		
		a.findElement(By.xpath("//button[text()='✕']")).click();
		
		a.findElement(By.name("q")).sendKeys("redmi mobiles",Keys.ENTER);
		 String parent=a.getWindowHandle();
		 a.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		 a.switchTo().window(parent);
		 a.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		 a.switchTo().window(parent);
		 a.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
		 a.switchTo().window(parent);
		 
		Set<String> child=a.getWindowHandles();
		
		for(String x: child) {
			if(!parent.equals(x)) {
			  a.switchTo().window(x);
			 String aa= a.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
			 System.out.println(aa);
			  System.out.println();
			}
			
		}
		 
		 
		
		
		
		
	}

}
