package alertProgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDismiss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
		Thread.sleep(3000);
		
		//Dismissing/Canceling Alert
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.name("res")).click();
		
		

	}

}
