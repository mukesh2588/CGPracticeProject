package windowTabHander;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		//System.out.println(parent);
		
		Set<String> allWindows=driver.getWindowHandles();
		/*for (String string : allWindows) 
		{
			System.out.println(string);
		}*/
		
		//this will close all child windows/popups
		for (String child : allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				//driver.manage().window().maximize();
				
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//input[@class='sugInp' and @name='keyword']")).sendKeys("Testing");
		
		

	}

}
