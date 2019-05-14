package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;

	@Given("^user is on Login page$")
	public void user_is_on_Login_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://snavnappimdm001:7001/bdd/\r\n");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	  @When("^title of the page is Informatica MDM Data Director$") public void
	  title_of_the_page_is_Informatica_MDM_Data_Director() throws Throwable {
	  String title = driver.getTitle(); System.out.println(title);
	  Assert.assertEquals("Informatica MDM Data Director", title);
	  
	  }
	 

	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		driver.findElement(By.name("user")).sendKeys("hchikalabettu");
		driver.findElement(By.name("password")).sendKeys("Haribhat@7");		
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", submitBtn);
	}

	
	  @Then("^user is on homepage$") public void user_is_on_homepage() throws
	  Throwable { String element = driver.findElement(By.
	  xpath("//span[@class='infa-left-nav-label' and contains(text(),'Home')]")).
	  getText(); System.out.println(element); Assert.assertEquals("Home", element);
	  
	  }
	 

}
