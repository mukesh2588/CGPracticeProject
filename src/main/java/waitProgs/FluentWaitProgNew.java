package waitProgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FluentWaitProgNew {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                WebElement element1 = driver.findElement(By.xpath(".//*[@id='demo']"));

                String value = element1.getAttribute("innerHTML");

                if (value.equalsIgnoreCase("WebDriver")) {
                    return element1;
                } else {
                    System.out.println("Text which is coming on screen is: "+value);
                    return null;
                }
            }
        });

        System.out.println("Element is displayed ?"+ element.isDisplayed());

    }
}
