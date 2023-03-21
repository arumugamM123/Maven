package janmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
public static void main(String args[]) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver a=new ChromeDriver();
		a.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		a.manage().window().maximize();
		
		a.switchTo().frame("frame1");
		a.switchTo().frame("frame3");

		a.findElement(By.xpath("//input[@id='a']")).click();
		a.switchTo().parentFrame();
		WebElement aa=a.findElement(By.xpath("//b[text()='Topic :']"));
		String text=aa.getText();
		System.out.println(text);
		a.switchTo().defaultContent();
		WebElement ee=a.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		String tesxtt=ee.getText();
		System.out.println(tesxtt);
		
		
		
		
		
		
		
		
		
		
	
}
}
