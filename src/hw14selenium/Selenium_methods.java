package hw14selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	
	@Test(enabled = true, priority = 1)
	public void buttonTest() throws InterruptedException {
	boolean elementIsDisplayed = driver.findElement(By.xpath("//input[@id='gh-btn']")).isDisplayed();
	boolean elementIsEnabled = driver.findElement(By.xpath("//input[@id='gh-btn']")).isEnabled();
	
	System.out.println("Is the Search Button displayed?: " + elementIsDisplayed);
	System.out.println("Is the Search Button enabled?: " + elementIsEnabled);
	Thread.sleep(5000);

	}

	@Test(enabled = true, priority = 2)
	public void shopByCategoryTest() {
	boolean dropDown = driver.findElement(By.xpath("//button[@id='gh-shop-a']")).isSelected();
	System.out.println(" Is the Drop Down Menu selected?: " + dropDown);

	}

	@Test(enabled = true, priority = 3)
	public void getTitleTest() {
	System.out.println("The title of the website is: " + driver.getTitle());
	
	}


	@Test(enabled = true, priority = 4)

	public void getTextTest() {
	WebElement headerButton = driver.findElement(By.xpath("//a[text='Home & Garden']"));
	System.out.println("The text for this Web Element is: " + headerButton.getText());
	
	}
	
	@Test(enabled = true, priority = 5)
	public void sendKeysMethod() throws InterruptedException {
	driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Holiday Gifts");
	Thread.sleep(3000);
	
	}

	@Test(enabled = true, priority = 6)
	public void currentUrlTest() throws InterruptedException {
	driver.get("https://www.ebay.com/");
	driver.findElement(By.xpath("//a[text()='Sell']")).click();
	Thread.sleep(4000);
	System.out.println("The current Url is: " + driver.getCurrentUrl());
	
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

	
	

}
