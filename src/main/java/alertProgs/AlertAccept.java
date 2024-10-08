package alertProgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAccept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
		Thread.sleep(3000);
		
		//Switching to Alert
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
					
		

	}

}
