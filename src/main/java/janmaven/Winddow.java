package janmaven;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Winddow {
	public static void main (String args[]) throws IOException, InterruptedException  {
		
	WebDriverManager.chromedriver().setup();
	WebDriver a=new ChromeDriver();
	a.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	a.manage().window().maximize();
	
	
	WebElement aa=a.findElement(By.xpath("//select[@id='second']"));
	Select a1=new Select(aa);
	boolean multiple=a1.isMultiple();
	System.out.println(multiple);
	
	a1.selectByIndex(0);
	a1.selectByIndex(1);
	a1.selectByIndex(2);
	a1.deselectByIndex(2);
	
	//WebElement asa=a1.getFirstSelectedOptions();

	
	List<WebElement>as=a1.getAllSelectedOptions();
	for (int i = 0; i <as.size(); i++) {
		WebElement aaq=as.get(i);
		//if(aaq.getText().equals("Yahoo")) {
		//	a1.selectByValue(aaq.getText());
		System.out.println(aaq.getText());
		}
		
	}
	
	
	

}

