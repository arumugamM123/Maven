package org.test;

	
	import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class MakeMyTripValidation {
	    public static void main(String[] args) throws IOException, InterruptedException {
           WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        driver.navigate().to("https://www.makemytrip.com/");

	        String Title1 = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
	        String Title2= driver.getTitle();
	        if (Title1.equals(Title2)) {
	            System.out.println("Title validate successful.");
	        } else {
	            System.out.println("Title validate failed.");
	        }
	        TakesScreenshot ss=(TakesScreenshot)driver;
			File qq=ss.getScreenshotAs(OutputType.FILE);
			File des= new File("D:\\janmaven\\src\\test\\resources\\makemytrip.png");
			FileUtils.copyFile(qq,des);
	        Thread.sleep(3000);
	        
	        driver.manage().window().maximize();
	        
			  driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
              JavascriptExecutor js=(JavascriptExecutor)driver;
	           
	     	  WebElement from = driver.findElement(By.xpath("//p[text()='Login or Create Account']"));
		       js.executeScript("arguments[0].click()",from);
		       driver.switchTo();
		       WebElement from1= driver.findElement(By.xpath("//input[@id='username']"));
		       //from1.sendKeys("asdbjsbjasvk@gmail.com");
		       js.executeScript("arguments[0].setAttribute('value','arumugamajith06@gmail.com')",from1);
	           Object ah1=js.executeScript("return arguments[0].getAttribute('value')",from1);
	           WebElement con = driver.findElement(By.xpath("//button[@type='button']"));
		       js.executeScript("arguments[0].click()",con);
		       driver.switchTo();
	           System.out.println(ah1);
		       Thread.sleep(2000);

		       String benga = "arumugamajith06@gmail.com";
	           Object ah121=js.executeScript("return arguments[0].getAttribute('value')",from1);
		     // String ah121=from1.getAttribute("value");
		       if (benga.equals(ah121)) {
		           System.out.println(" is correct");
		       } else {
		           System.out.println("is not correct");
		       }
		       
		       TakesScreenshot yy=(TakesScreenshot)driver;
				File y1=yy.getScreenshotAs(OutputType.FILE);
				File y2= new File("D:\\janmaven\\src\\test\\resources\\login.png");
				FileUtils.copyFile(y1,y2);
				Thread.sleep(2000);   
				WebElement contin=driver.findElement(By.xpath("//button[@type='button']"));
				js.executeScript("arguments[0].click()",contin);
				Thread.sleep(2000);
				 driver.switchTo();
             
		       
			  
	        String aa="Hotels";
	        WebElement a1=driver.findElement(By.xpath("//span[text()='Hotels']"));
	        if(aa.equals(a1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot a2=(TakesScreenshot)driver;
	        File aaak1=a2.getScreenshotAs(OutputType.FILE);
	        File aa2=new File("D:\\janmaven\\src\\test\\resources\\hotel.png");
	        FileUtils.copyFile(aaak1,aa2);
	        
	        String cc="Activities";
	        WebElement c1=driver.findElement(By.xpath("//span[text()='Activities']"));
	        if(cc.equals(c1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot c2=(TakesScreenshot)driver;
	        File cc1=c2.getScreenshotAs(OutputType.FILE);
	        File cc2=new File("D:\\janmaven\\src\\test\\resources\\Activities.png");
	        FileUtils.copyFile(cc1,cc2);
	        
	        String bb="Flights";
	        WebElement b1=driver.findElement(By.xpath("//span[text()='Flights']"));
	        if(bb.equals(b1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot b2=(TakesScreenshot)driver;
	        File bb1=b2.getScreenshotAs(OutputType.FILE);
	        File bb2=new File("D:\\janmaven\\src\\test\\resources\\flight.png");
	        FileUtils.copyFile(bb1,bb2);
	        
	        String dd="Homestays";
	        WebElement d1=driver.findElement(By.xpath("//span[text()='Homestays']"));
	        if(dd.equals(d1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot d2=(TakesScreenshot)driver;
	        File dd1=d1.getScreenshotAs(OutputType.FILE);
	        File dd2=new File("D:\\janmaven\\src\\test\\resources\\homestays.png");
	        FileUtils.copyFile(dd1,dd2);
	        
	        String ee="Holiday Packages";
	        WebElement e1=driver.findElement(By.xpath("//span[text()='Holiday Packages']"));
	        if(ee.equals(e1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot e2=(TakesScreenshot)driver;
	        File ee1=e1.getScreenshotAs(OutputType.FILE);
	        File ee2=new File("D:\\janmaven\\src\\test\\resources\\Holiday.png");
	        FileUtils.copyFile(ee1,ee2);
	        
	        String ff="Trains";
	        WebElement f1=driver.findElement(By.xpath("//span[text()='Trains']"));
	        if(ff.equals(f1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot f2=(TakesScreenshot)driver;
	        File ff1=f1.getScreenshotAs(OutputType.FILE);
	        File ff2=new File("D:\\janmaven\\src\\test\\resources\\Train.png");
	        FileUtils.copyFile(ff1,ff2);
	        
	        String gg="Buses";
	        WebElement g1=driver.findElement(By.xpath("//span[text()='Buses']"));
	        if(gg.equals(g1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot g2=(TakesScreenshot)driver;
	        File gg1=g1.getScreenshotAs(OutputType.FILE);
	        File gg2=new File("D:\\janmaven\\src\\test\\resources\\Buses.png");
	        FileUtils.copyFile(gg1,gg2);
	        
	        
	        String hh="Cabs";
	        WebElement h1=driver.findElement(By.xpath("//span[text()='Cabs']"));
	        if(hh.equals(h1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot h2=(TakesScreenshot)driver;
	        File hh1=h2.getScreenshotAs(OutputType.FILE);
	        File hh2=new File("D:\\janmaven\\src\\test\\resources\\Cabs.png");
	        FileUtils.copyFile(hh1,hh2);
	        
	        String ii="Forex";
	        WebElement i1=driver.findElement(By.xpath("//span[text()='Forex']"));
	        if(ii.equals(i1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot i2=(TakesScreenshot)driver;
	        File ii1=i2.getScreenshotAs(OutputType.FILE);
	        File ii2=new File("D:\\janmaven\\src\\test\\resources\\Forex.png");
	        FileUtils.copyFile(ii1,ii2);
	        
	        String jj="Charter Flights";
	        WebElement j1=driver.findElement(By.xpath("//span[text()='Charter Flights']"));
	        if(jj.equals(j1.getText())) {
	        	System.out.println("text verified");
	        }else {
	        	System.out.println("not verified");
	        }
	        TakesScreenshot j2=(TakesScreenshot)driver;
	        File jj1=j1.getScreenshotAs(OutputType.FILE);
	        File jj2=new File("D:\\janmaven\\src\\test\\resources\\Charter Flights.png");
	        FileUtils.copyFile(jj1,jj2);
	        
	        
	       
	    }
	}

	

