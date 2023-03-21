package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qweed {
	public static void main(String[] args) throws InterruptedException{
	  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drag=driver.findElement(By.xpath("//*[text()=' BANK ']"));
		WebElement drop=driver.findElement(By.xpath("//*[@class='placeholder'][1]"));
		Actions aa=new Actions(driver);
		aa.dragAndDrop(drag, drop).build().perform();
		WebElement drag1=driver.findElement(By.xpath("//*[text()=' 5000 ']"));
		WebElement drop1=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		aa.dragAndDrop(drag1, drop1).build().perform();
		WebElement drag2=driver.findElement(By.xpath("//*[text()=' SALES ']"));
		WebElement drop2=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		aa.dragAndDrop(drag2, drop2).build().perform();
		WebElement drag3=driver.findElement(By.xpath("//*[text()=' 5000']"));
		WebElement drop3=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		aa.dragAndDrop(drag3, drop3).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
