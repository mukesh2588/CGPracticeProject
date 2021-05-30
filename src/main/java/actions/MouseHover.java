package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement linkHome=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		
		Actions builder=new Actions(driver);
	//	builder.moveToElement(linkHome).build().perform();
		builder.moveToElement(linkHome).perform(); // we can skip build since its single action
		
		
		
		
		

	}

}
