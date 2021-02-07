package CGTraining.CGPracticeProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\MukeshHP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		String mainWindow=driver.getWindowHandle();
		
		//to handle all new opened windows
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			String childWindow=i1.next();
			if(!mainWindow.equalsIgnoreCase(childWindow)) 
			{//Switch to child window
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				//close child windows
				driver.close();
			}
			//Switch to parent/main window
			driver.switchTo().window(mainWindow);
		}
		
		

	}

}
