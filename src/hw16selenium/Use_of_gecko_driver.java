package hw16selenium;

import javax.naming.directory.DirContext;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_gecko_driver {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/Users/admin/eclipse-workspace/HomeWorkOctober2021/driver/geckodriver");
		driver = new FirefoxDriver();
	}
	
	@Test(enabled = true, priority = 1)
	public void maximize() {
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	
	@Test(enabled = true, priority = 2)
	public void byIndexTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		Select select = new Select(dropdown);
		select.selectByIndex(7);
		Thread.sleep(3000);
	}
	
	@Test(enabled = true, priority = 3)
	public void byValue() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		Select select = new Select(dropdown);
		select.selectByValue("1");
		Thread.sleep(3000);
	}
	
	@Test(enabled = true, priority = 4)
	public void byVisibleText() throws InterruptedException {
	WebElement dropdown =	driver.findElement(By.xpath("//select[@class='gh-sb ']"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("Music");
	Thread.sleep(3000);
	
	}
	
	@Test(enabled = true, priority = 5)
	public void moveToElement() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		Actions action = new Actions(driver);
		WebElement services =driver.findElement(By.id("swm-link"));
		Thread.sleep(3000);
		action.moveToElement(services).build().perform();
		Thread.sleep(3000);
		System.out.println("The Text of the Web Element is: " + services.getText());
	}
	
	@Test(enabled = true, priority = 6)
	public void acceptAlertMethod() throws InterruptedException {
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("The alert is giving the following text: " + alert.getText());
		alert.accept();
	}
	
	@Test(enabled = true, priority = 7)
	public void dismissAlertMethod() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	@AfterTest
	public void tearUP() {
		driver.close();
	}
	

	

}
