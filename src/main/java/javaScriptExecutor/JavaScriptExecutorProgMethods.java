package javaScriptExecutor;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorProgMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://ess.hgsbs.com/Login/Login");
		
		//WebElement loginID=driver.findElement(By.id("txtLoginID"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Highlight with yellow background
		js.executeScript("document.getElementById(\"txtCompanyCode\").value='yellow'");
		js.executeScript("document.getElementById(\"btnFPassword\").click()");

		
		

	}

}
