package locators.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.calculator.net/mass-calculator.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//By class
		
		driver.findElement(By.className("clearbtn")).click();
		
		//tagname
		WebElement tagEx=driver.findElement(By.tagName("form"));
		System.out.println(tagEx);
		
		//link text
		
		driver.findElement(By.linkText("density calculator")).click();
		
		//partialLinktext
		
		driver.findElement(By.partialLinkText("Password")).click();
		
		
		
		

	}

}
