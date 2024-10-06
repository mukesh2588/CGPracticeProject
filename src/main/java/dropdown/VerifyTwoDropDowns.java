package dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class VerifyTwoDropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/dropdowns");
		
		WebElement originalDropDown=driver.findElement(By.cssSelector("select#first"));
		Select original=new Select(originalDropDown);
		List<WebElement> originalListElements=original.getOptions();
		List<String> originalList=new ArrayList<String>();
		for (WebElement webElement : originalListElements) {
			
			originalList.add(webElement.getText());
		}
		
		WebElement targetDropdown=driver.findElement(By.id("order-same"));
		Select target=new Select(targetDropdown);
		List<WebElement> targetListElements=target.getOptions();
		List<String> targetList=new ArrayList<String>();
		for(WebElement webElement : targetListElements)
		{
			targetList.add(webElement.getText());
		}
		Assert.assertEquals(originalList, targetList);
		
		

	}

}
