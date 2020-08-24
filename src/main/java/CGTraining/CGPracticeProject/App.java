package CGTraining.CGPracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         System.setProperty("webdriver.chrome.driver", "G:\\Class-Selenium\\BrowserDriver\\ChromeDriver\\2020\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();  
         driver.get("http://maven.apache.org");
         driver.manage().window().maximize();
         
         WebElement getSources=driver.findElement(By.xpath("//div[@id='breadcrumbs']//a[@href='scm.html']"));
         System.out.println(getSources);
      //   getSources.click();
         
         
         WebElement publishDate=driver.findElement(By.id("publishDate"));
         System.out.println(publishDate);
         
         WebElement titleTest=driver.findElement(By.name("What is Maven?"));
         System.out.println(titleTest);
         
         WebElement likTextTest=driver.findElement(By.linkText("What is Maven?"));
         System.out.println(likTextTest);
        
    }
}
