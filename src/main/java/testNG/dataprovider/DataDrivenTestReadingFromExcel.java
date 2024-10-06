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

import excelLib.ExcelDataConfig;

public class DataDrivenTestReadingFromExcel
{

	//String driverpath="src/main/resources/drivers/chromedriver.exe";
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	{
	//	System.setProperty("webdriver.chrome.driver", driverpath);
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test(dataProvider="testData")
	public void loginApplication(String username,String password)
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.name("txtUsername")).sendKeys(username);
//		driver.findElement(By.name("txtPassword")).sendKeys(password);
//		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

//		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

	}

	@DataProvider(name="testData")
	public Object[][] getData()
	{
		
		ExcelDataConfig excelConf=new ExcelDataConfig("C:\\Users\\mkhedkar\\eclipse-workspace\\CGPracticeProject\\src\\main\\java\\testNG\\dataprovider\\TestData.xlsx");
		
		int rows=excelConf.getRowCount(0);
		Object[][] loginData=new Object[rows+1][2];
		
		for (int i = 0; i <rows+1; i++)
		{
			loginData[i][0]=excelConf.getExcelData(0, i, 0);
			loginData[i][1]=excelConf.getExcelData(0, i, 1);
			
		}
		
		

		/*loginData[0][0]="Admin";
		loginData[0][1]="admin1235";
		loginData[1][0]="Admin";
		loginData[1][1]="admin123";
		loginData[2][0]="Admin";
		loginData[2][1]="admin12322";*/
		
		

		return loginData;

	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	

}
