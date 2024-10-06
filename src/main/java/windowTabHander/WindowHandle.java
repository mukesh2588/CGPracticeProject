package windowTabHander;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		
		//opening child windows
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		
		String parent=driver.getWindowHandle();
		System.out.println("Main window handle is "+parent);
		
		// To handle all new opened window
		Set<String> allWindows=driver.getWindowHandles();
		
		System.out.println("Child window handle is "+allWindows);
		
		Iterator<String> itr=allWindows.iterator();
		
		//Here we will check if child window has other child windows and when child window is the main window it will come out of loop.
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			if(!parent.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				
				driver.close();
				System.out.println("Child windows closed");
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		

	}

}
