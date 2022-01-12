package hw15selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContinuationOfSeleniumMethods {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "/Users/admin/eclipse-workspace/JavaSeleniumPractice/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.petco.com/shop/en/petcostore");
		Thread.sleep(4000);
		
	}
	
	@Test (enabled = true, priority = 1)
	public void sendKeysTestNavigation() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='header-search']")).sendKeys("Dog Food",Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().to("https://oldnavy.gap.com/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
	}
	
	@Test (enabled = true, priority = 2)
	public void clearTestFullScreenTestAndGetSizeTest() throws InterruptedException {
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lamps");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		System.out.println("The Size of the Window is:" + driver.manage().window().getSize());
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void tearup() {
		driver.quit();
	}
	
	

}
