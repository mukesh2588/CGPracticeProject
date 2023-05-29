package locators.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Dropdown")).click();
		
		Select drpDwn=new Select(driver.findElement(By.id("dropdown")));
		//drpDwn.selectByIndex(2);
		//drpDwn.selectByValue("1");
		drpDwn.selectByVisibleText("Option 2");
				
		
		
		
		
		

	}

}
