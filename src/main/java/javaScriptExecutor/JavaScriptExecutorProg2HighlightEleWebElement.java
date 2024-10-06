package javaScriptExecutor;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorProg2HighlightEleWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://ess.hgsbs.com/Login/Login");
		
		WebElement loginID=driver.findElement(By.id("txtLoginID"));
		
				
		//Finding element with WebDriver and performing highlight using Javascript

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		/*//Highlight with yellow background
		js.executeScript("document.getElementById(\"txtCompanyCode\").style.background='yellow'");

		//Highlight with Red border
		js.executeScript("document.getElementById(\"txtLoginID\").style.border='2px solid red'");
		
		//Highlight with Red border and Highlight with yellow background
		js.executeScript("document.getElementById('txtPassword').setAttribute('style','border:3px solid red; background:yellow')");*/
		
		//Highlighting element serched using WebDriver , Highlight with Red border and Highlight with yellow background
		js.executeScript("arguments[0].setAttribute('style','border:3px solid red; background:yellow')", loginID);

	}

}
