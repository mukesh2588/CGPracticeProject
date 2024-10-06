package locators.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
			
		Select drpDwn=new Select(driver.findElement(By.id("fruits")));
		drpDwn.selectByIndex(2);
		drpDwn.selectByValue("apple");
		drpDwn.selectByVisibleText("Grape");
		
		
		
		
		
		

	}

}
