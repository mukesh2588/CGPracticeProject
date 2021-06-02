package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorProg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/");

		JavascriptExecutor js=(JavascriptExecutor) driver;

		String pageTitle= js.executeScript("return document.title").toString();

		System.out.println(pageTitle);

		String domainName=  js.executeScript("return document.domain;").toString();
		System.out.println(domainName);
		
		//Refresh Browser
		js.executeScript("history.go(0)");
		//js.executeScript("alert('hello world');");
		

	}

}
