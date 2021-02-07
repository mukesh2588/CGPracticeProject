package CGTraining.CGPracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\MukeshHP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.navigate().to("https://timesofindia.indiatimes.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  //js.executeScript("window.scrollBy(0,250)", "");
		  js.executeScript("window.scrollBy(0,1000)");
		 
		
		driver.navigate().refresh();
		
		/*
		 * driver.navigate().back();
		 * 
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * 
		 * driver.navigate().forward();
		 * 
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * 
		 */
		
		

	}

}
