package CGTraining.CGPracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\MukeshHP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		driver.findElement(By.name("submit")).submit();
		
		//Switching to Alert
		Alert alert=driver.switchTo().alert();
		//Capturing ALert message
		String alertMessage=driver.switchTo().alert().getText();
		//Display ALert message
		System.out.println(alertMessage);
		Thread.sleep(5000);
		
		//Accepting alert
		alert.accept();
		
		
		
		
		
		
		
		
		

	}

}
