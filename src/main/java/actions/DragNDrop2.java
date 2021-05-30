package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragNDrop2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		new WebDriverWait(driver, 20).until(ExpectedConditions.titleIs("Droppable | jQuery UI"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));

		Actions act=new Actions(driver);

		//act.dragAndDrop(src, dest).build().perform();
		
		act.clickAndHold(src).pause(2000).
		moveToElement(dest).release().perform();

		String msgExpected="Dropped!";
		
		System.out.println(msgExpected.equalsIgnoreCase(driver.findElement(By.xpath("//p[text()='Dropped!']")).getText()));

		



	}

}
