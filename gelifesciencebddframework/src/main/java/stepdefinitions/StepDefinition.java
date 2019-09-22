package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {

	WebDriver driver;
	
	@Given("^user should open ge health life science home page$")
	public void user_should_open_ge_health_life_science_home_page() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.gelifesciences.com/en/in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  String title = driver.getTitle();
	  Assert.assertEquals("Research & Biopharmaceutical Manufacturing - GE Healthcare Life Sciences", title);
	}

	@Then("^user should click on Log In/Register button$")
	public void user_should_click_on_Log_In_Register_button() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Log In/Register']")).click();
	   
	}

	@Then("^user should enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_enter_and(String username, String password) throws Throwable {
		driver.findElement(By.id("loginPage:loginForm:userName")).sendKeys(username);
		driver.findElement(By.id("loginPage:loginForm:sfid-password")).sendKeys(password);
	   
	}

	@Then("^user should click on Login button$")
	public void user_should_click_on_Login_button() throws Throwable {
	    driver.findElement(By.name("loginPage:loginForm:login-submit")).click();
	}

	@Then("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		//System.out.println(driver.getTitle());
	  String titles = driver.getTitle();
	  Assert.assertEquals("GE Healthcare Life Sciences", titles);
	}
	@Then("^click on Applications tab$")
	public void click_on_Applications_tab() throws Throwable {
	   driver.findElement(By.xpath("//span[text()='Applications']/parent::a")).click();
	  
	}

	@Then("^click on Bioprocessing$")
	public void click_on_Bioprocessing() throws Throwable {
		 driver.findElement(By.xpath("//span[text()='Bioprocessing']")).click();
		   
	}

	@Then("^validate the page of Bioprocessing$")
	public void validate_the_page_of_Bioprocessing() throws Throwable {
		String bio = driver.getTitle();
		   Assert.assertEquals("Bioprocessing - GE Healthcare Life Sciences", bio);
	}


	@Then("^user should logout and browser will closes$")
	public void user_should_logout_and_browser_will_closes() throws Throwable {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	    driver.quit();
	    
	}
}
