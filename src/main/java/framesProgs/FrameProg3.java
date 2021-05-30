package framesProgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameProg3 {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
				
		//find frame By Name or Id
				
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		
	}

}
