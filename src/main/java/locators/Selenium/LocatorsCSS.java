package locators.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		/* CSS Selectors in Selenium are string patterns used to identify an element
		based on a combination of HTML tag, id, class, and attributes */
		
		//CSS Selector - Tag and ID......css=tag#id
		
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("TEST");
		
		
		//CSS Selector - Tag and Class.. css=tag.class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Software Testing Material");
		
		WebElement cssClass=driver.findElement(By.cssSelector(("input.form-control")));
		System.out.println(cssClass.getClass());
		
		List<WebElement> liCSSClass=driver.findElements(By.cssSelector(("input.form-control")));
		for (WebElement webElement : liCSSClass) 
		{
			System.out.println(webElement);
		}
		
		
		//CSS Selector - Tag and Attribute:.. css=tag[attribute=value]
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("MKtest");
		
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("test123@gmail.com");
		
		
		//CSS Selector - Tag, Class And Attribute::.. css=tag.class[attribute=value]		
		
		//driver.findElement(By.cssSelector("input.form-control[id='dateOfBirthInput']")).click();
		driver.findElement(By.cssSelector("input.form-control[id='dateOfBirthInput']")).sendKeys("28 May 2021");
		
			
		
		
		
		

	}

}
