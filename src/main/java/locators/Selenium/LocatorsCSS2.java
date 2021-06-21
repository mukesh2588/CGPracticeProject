package locators.Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCSS2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkspace\\ChromeDriverLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		/* CSS Selectors in Selenium are string patterns used to identify an element
		based on a combination of HTML tag, id, class, and attributes */
		
		//CSS Selector - Tag and ID......css=tag#id
		
		driver.findElement(By.cssSelector("input#calcSearchTerm")).sendKeys("Test");
		
		
		//CSS Selector - Tag and Class.. css=tag.class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Software Testing Material");
		
		driver.findElement(By.cssSelector("input.inlongest")).clear();
		
		
		//CSS Selector - Tag and Attribute:.. css=tag[attribute=value]
	
		driver.findElement(By.cssSelector("input[name='calcSearchTerm']")).sendKeys("Test2");;
		
		//CSS Selector - Tag, Class And Attribute::.. css=tag.class[attribute=value]		
		
		//driver.findElement(By.cssSelector("input.form-control[id='dateOfBirthInput']")).click();
		
		
		
		WebElement searchBox=driver.findElement(By.cssSelector("input.inlongest[name='calcSearchTerm']"));
		searchBox.clear();
		searchBox.sendKeys("Test3");
		
		
		
			
		
		
		
		

	}

}
