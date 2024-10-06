package alertProgs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertGetMessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
		Thread.sleep(3000);
		
		//Switching to ALert
		
		Alert alert=driver.switchTo().alert();
		
		String alertMsg=alert.getText();
		
		System.out.println(alertMsg);
		
		String alertmsgExpected="Do you really want to delete this Customer?";
		
		System.out.println(alertmsgExpected.equalsIgnoreCase(alertMsg));
	
		
		

	}

}
