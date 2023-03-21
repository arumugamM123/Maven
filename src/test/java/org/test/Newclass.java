package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newclass {
		public static void main(String[] args) throws InterruptedException, IOException{
			  
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://facebook.com/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  
			
			TakesScreenshot ss=(TakesScreenshot)driver;
			File qq=ss.getScreenshotAs(OutputType.FILE);
			File des= new File("D:\\janmaven\\src\\test\\resources\\image.png");
			FileUtils.copyFile(qq, des);
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
