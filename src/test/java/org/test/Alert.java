package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Alert {
	
	public static void main(String args[]) {
		
		try {
		WebDriverManager.chromedriver().setup();
		WebDriver a=new ChromeDriver();
		a.navigate().to("https://demoqa.com/alerts");
		a.manage().window().maximize();
		
		
		a.findElement(By.id("alertButton")).click();
		org.openqa.selenium.Alert alert=a.switchTo().alert();
		alert.accept();
		
		a.findElement(By.id("confirmButton")).click();
		org.openqa.selenium.Alert aa=a.switchTo().alert();
		aa.accept();
		String a1="You selected Ok";
		WebElement a3=a.findElement(By.xpath("//span[@id='confirmResult']"));
		if(a1.equals(a3.getText())) {
			System.out.println("correct");
		}
		// JavascriptExecutor js=(JavascriptExecutor)a;
		 //js.executeScript("arugument[0].Scrolltoview()",a3);
		
		
		a.findElement(By.id("promtButton")).click();
		org.openqa.selenium.Alert a2=a.switchTo().alert();
		a2.sendKeys("ajith");
		a2.accept();
		 JavascriptExecutor jk=(JavascriptExecutor)a;
		 jk.executeScript("argument[0].scrollToView(true)",a2);
		
	String a4="ajith";
	WebElement a5=a.findElement(By.xpath("//span[@id='promptResult']"));
	if(a4.equals(a5.getText())) {
		System.out.println("correct");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
	catch  (Exception e) {
		
	}
}
}
