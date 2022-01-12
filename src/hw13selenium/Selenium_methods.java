package hw13selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium_methods {
	WebDriver driver;
	
	@BeforeTest
	public void setUP() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/eclipse-workspace/JavaSeleniumPractice/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.uhc.com");
		Thread.sleep(800);
	}
	
	@Test
	public void searhFieldTest() throws InterruptedException{
		driver.findElement(By.id("search-desktop"));
		Thread.sleep(800);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

	
	

}
