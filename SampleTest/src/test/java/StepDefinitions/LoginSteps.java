package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class LoginSteps {

	WebDriver driver = null;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		System.setProperty("webDriver.chrome.driver", "C:/Users/10669/OneDrive - Expleo France/Desktop/SampleTest/src/test/resources/drivers/chromedriver_proxy.exe");
		driver= new ChromeDriver();
		//driver = new EdgeDriver();
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/home");
		System.out.print("homepage");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.print(".........");

		driver.findElement(By.xpath("//*[text()=' Login ']/parent::*")).click();

		System.out.print("click login");


		//throw new io.cucumber.java.PendingException();
	}

	@When("user enterusername and password")
	public void user_enterusername_and_password() {

		driver.findElement(By.xpath("//*[@placeholder='User']")).sendKeys("demo");
		System.out.print("demo");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("1234");
		System.out.print("1234");

		driver.findElement(By.xpath("//*[text()='Submit']/parent::button")).click();
		System.out.print("Submit");
	}

	@And("Verify Dashboard page")
	public void verify_Dashboard_page() {
		driver.findElement(By.xpath("//div[text()='Dashboard']")).click();
		System.out.print("True");
	//	throw new io.cucumber.java.PendingException();
	}

	@Then("close the website")
	public void close_the_website() {
		driver.quit();
	//	throw new io.cucumber.java.PendingException();
	}






}
