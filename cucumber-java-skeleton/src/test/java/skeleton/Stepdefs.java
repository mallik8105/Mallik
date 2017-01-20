package skeleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	
	
public class Stepdefs {
	
	WebDriver driver = null;
	
	//System.setProperty("webdriver.gecko.driver", "F:/cucumber testing/geckodriver.exe");
	
			
	@Given("^I am on the devotional web site$")
	public void shouldnavigatetoDevlotionalsite() throws Throwable {
		//driver = new FirefoxDriver();
		//WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "F:/cucumber testing/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/mallikarjun/Desktop/HTML%20Page/mallanna/mallannaswamy.html");
		//driver.navigate().to("https://www.facebook.com/login.php");
		
	}

	@When("^I went to visit us at page$")
	public void i_went_to_visit_us_at_page() throws Throwable {
		//WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "F:/cucumber testing/geckodriver.exe");
		//driver =new FirefoxDriver();
		//driver.findElement(By.name("email")).sendKeys("chinna_mallikarjun@yahoo.com");
		//driver.findElement(By.name("pass")).sendKeys("Mallik@9116");
		driver.findElement(By.id("visit")).click();
		//driver.findElement(By.;
	}

	@Then("^closed the page$")
	public void closed_the_page() throws Throwable {
	    // System.out.println("Quit the page");
		
		driver.quit();   
	     }
}
