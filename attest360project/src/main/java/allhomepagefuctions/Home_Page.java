package allhomepagefuctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home_Page {
	static WebDriver driver;
	@BeforeClass
	public void driver_start(){
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.attest360.org/");	
		String title = driver.getTitle();
		Assert.assertEquals("Background Verification Platform | Attest360", title);	
	}
	@BeforeMethod
	public void wait_Time(){
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(priority=0)
	public void features(){
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='Features']/following::a[1]"));
		action.moveToElement(driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='Features']"))).moveToElement(element).click().build().perform();
		WebElement overview = driver.findElement(By.xpath("//h1[@class='pageCustHeading']"));
		String st =overview.getText();
		Assert.assertEquals("Background Verification You Can Trust", st);
		
		//-----verifications----
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='Features']/following::a[2]"));
		actions.moveToElement(driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='Features']"))).moveToElement(element1).click().build().perform();
		WebElement verification = driver.findElement(By.xpath("//h1[@class='pageCustHeading']"));
		String st1 =verification.getText();
		Assert.assertEquals("Unparalleled Background Verification Experience", st1);
		
		//----Security-----
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Actions actions1 = new Actions(driver);
		WebElement element2 = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='Features']/following::a[3]"));
		actions1.moveToElement(driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='Features']"))).moveToElement(element2).click().build().perform();
		WebElement security = driver.findElement(By.xpath("//h1[@class='pageCustHeading']"));
		String st2 = security.getText();
		Assert.assertEquals("System Security At It’s Best", st2);
	}
	@Test(priority=1)
	public void solutions(){
		
		//-----Solutions----
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		Actions action1 = new Actions(driver);
		WebElement element3 = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='SOLUTIONS']/following::a[1]"));
		action1.moveToElement(driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='SOLUTIONS']"))).moveToElement(element3).click().build().perform();
		WebElement agency = driver.findElement(By.xpath("//h1[@class='pageCustHeading']"));
		String st3 = agency.getText();
		Assert.assertEquals("Background Verification Made Faster And Accurate", st3);
		
		//-----For Employers----
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Actions action11 = new Actions(driver);
		WebElement element4 = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='SOLUTIONS']/following::a[2]"));
		action11.moveToElement(driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='SOLUTIONS']"))).moveToElement(element4).click().build().perform();
		WebElement emp = driver.findElement(By.xpath("//h1[@class='pageCustHeading']"));
		String st4 = emp.getText();
		Assert.assertEquals("Background Verification For Everyone", st4);
	}
	@Test(priority=2)
	public void why_us(){
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement element5 = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='Why Us']"));
		act.moveToElement(element5).click().build().perform();
		WebElement whyus = driver.findElement(By.xpath("//h1[@class='pageCustHeading']"));
		String st5 = whyus.getText();
		Assert.assertEquals("Why Choose Attest360 For Background Verification", st5);
	}
	@Test(priority=3)
	public void contact_us(){
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Actions act1 = new Actions(driver);
		WebElement element6 = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='Contact Us']"));
		act1.moveToElement(element6).click().build().perform();
		WebElement us = driver.findElement(By.xpath("//h5[@class='heading']/child::span"));
		String st6 = us.getText();
		Assert.assertEquals("Contact Us", st6);
	}
	@Test(priority=4)
	public void more(){
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Actions action2 = new Actions(driver);
		WebElement element7 = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='More']/following::a[1]"));
		action2.moveToElement(driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='More']"))).moveToElement(element7).click().build().perform();
		WebElement about = driver.findElement(By.xpath("//h3[@class='heading']"));
		String st7 = about.getText();
		Assert.assertEquals("Our Story", st7);
		
		//---about us----
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Actions action3 = new Actions(driver);
		WebElement element8 = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='More']/following::a[2]"));
		action3.moveToElement(driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='More']"))).moveToElement(element8).click().build().perform();
		WebElement blog = driver.findElement(By.xpath("//h3[@class='heading']"));
		String st8 = blog.getText();
		Assert.assertEquals("OUR BLOG", st8);
		
		//-----faq-----
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Actions action4 = new Actions(driver);
		WebElement element9 = driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='More']/following::a[3]"));
		action4.moveToElement(driver.findElement(By.xpath("//nav[@class='nav nav-horizontal']/ul/li/a[text()='More']"))).moveToElement(element9).click().build().perform();
		WebElement faq = driver.findElement(By.xpath("//h3[@class='heading']"));
		String st9 = faq.getText();
		Assert.assertEquals("Frequently Asked Questions", st9);
	
	
	
	}
	
	
	
	
	@AfterClass
	public void tear_down(){
		driver.quit();
	}
}
