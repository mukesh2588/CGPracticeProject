package testNG.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest
{

	//String driverpath="C:\\\\Users\\\\mkhedkar\\\\eclipse-workspace\\\\ChromeDriver\\\\chromedriver.exe";
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	{
	//	System.setProperty("webdriver.chrome.driver", driverpath);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mkhedkar\\\\eclipse-workspace\\\\ChromeDriver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test(dataProvider="testData")
	public void loginApplication(String username,String password)
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/dashboard");

	}

	@DataProvider(name="testData")
	public Object[][] getData()
	{
		Object[][] loginData=new Object[3][2];

		loginData[0][0]="Admin";
		loginData[0][1]="admin1235";

		loginData[1][0]="Admin";
		loginData[1][1]="admin123";

		loginData[2][0]="Admin";
		loginData[2][1]="admin12322";

		return loginData;

	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	

}
