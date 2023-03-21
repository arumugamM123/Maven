
			 
package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


			
public class Axis {
public static void main (String args[]) throws InterruptedException {
						
						
					  // System.setProperty("webdriver.chrome.driver","D:\\janmaven\\src\\test\\resources\\chromedriver.exe");
						WebDriverManager.chromedriver().setup();
						WebDriver driver = new ChromeDriver();
						
						driver.get("https://www.facebook.com/");
						
						driver.manage().window().maximize();
						Thread.sleep(2000);
						//String aaaa=driver.getCurrentUrl();
						//System.out.println(aaaa);
						
						//String aa=driver.getTitle();
						//System.out.println(aa);
						
						driver.findElement(By.xpath("//a[text()='Create new account']")).click();
					
						 Thread.sleep(2000);
						 
						 driver.switchTo();
						 
						
						WebElement k1=driver.findElement(By.name("firstname"));
						if(k1.isDisplayed()) {
							k1.sendKeys("arumugam");
							System.out.println("first name is displayed");
						}
				        WebElement k2=driver.findElement(By.name("lastname"));
				        if(k2.isDisplayed()) {
							k2.sendKeys("ajith");
							System.out.println("last name is displayed");
						}
				        
				        WebElement k3=driver.findElement(By.xpath("//input[@name='reg_email__']"));
				        if(k3.isDisplayed()) {
							k3.sendKeys("arumugamajith06@gmail.com");
							System.out.println("email is displayed");
						}
				        
				       WebElement k4= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
				        if(k4.isDisplayed()) {
							k4.sendKeys("arumugamajith06@gmail.com");
							System.out.println("isdisplayed");
				        }
				        	
				        
				        WebElement k5=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
				        if(k5.isDisplayed()) {
							k5.sendKeys("arumugamagrhsdhs");
							System.out.println("confirm email is displayed");
						}
				        
				       WebElement k6= driver.findElement(By.xpath("//select[@id='day']"));
				        if(k6.isDisplayed()) {
				        	k6.sendKeys("13");
				        	System.out.println("displayed");
				        }
				        WebElement k7=driver.findElement(By.xpath("//select[@id='month']"));
				        if(k7.isDisplayed()) {
				        	 k7.sendKeys("Feb");
				        }
				        
				        WebElement k8=driver.findElement(By.xpath("//select[@id='year']"));
				        if(k8.isDisplayed()) {
				        	 k8.sendKeys("1997");
				        }
				   
				        WebElement k9=driver.findElement(By.xpath("//input[@name='sex']"));
				        if(k9.isSelected()) {
				        	k9.sendKeys("male");
				        	System.out.println("default select");
				        }
				        	
				        WebElement k11=driver.findElement(By.xpath("//button[text()='Sign Up']"));
				        k11.click();
				    }
						
						
						
						
						
						
						
						
						
			
			
			
			
			}

 


