package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement src=driver.findElement(By.id("draggable"));
		
		Actions act=new Actions(driver);
		
		//act.dragAndDropBy(src, 90, 150).perform();
		
		act.dragAndDropBy(src, 50, 50).pause(2000)
		.dragAndDropBy(src, 100, 100).pause(2000).dragAndDropBy(src, 140, 140).perform();
		
		


	}

}
