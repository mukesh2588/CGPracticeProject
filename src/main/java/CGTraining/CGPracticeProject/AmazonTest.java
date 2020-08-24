package CGTraining.CGPracticeProject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Class-Selenium\\BrowserDriver\\ChromeDriver\\2020\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchProduct=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		searchProduct.sendKeys("Samsung mobiles");
		
		WebElement clkSearch=driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']"));
		clkSearch.click();
		
		List<WebElement>mobileList=driver.findElements(By.partialLinkText("Samsung Galaxy M31"));
		Iterator<WebElement> i=mobileList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().getText());
		}
		
		
				

	}

}
