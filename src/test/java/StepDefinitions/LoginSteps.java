package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        System.out.println("Entered username: demo");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("1234");
        System.out.println("Entered password: 1234");

	
	}

	@And("Verify Dashboard page")
	public void verify_Dashboard_page() {
		driver.findElement(By.xpath("//div[text()='Dashboard']")).click();
        System.out.println("Verified Dashboard page visibility");
	
	}

	@When("I logged into the Homepage")
	public void i_logged_into_the_homepage() {
		driver.findElement(By.xpath("//*[text()='Submit']/parent::button")).click();
        System.out.println("Submit button clicked");
	}

	@When("I navigate to my {string} page")
	public void i_navigate_to_my_page(String string) {
		driver.findElement(By.xpath("//div[text()='Dashboard']")).click();
        System.out.println("Navigated to Dashboard");
		driver.findElement(By.xpath("//div[@class='personal-label']")).click();
        System.out.println("Navigated to ");

	}

	@When("I get my personal information \\(e.g., name, contact info)")
	public void i_get_my_personal_information_e_g_name_contact_info() {
		WebElement businessName = driver.findElement(By.xpath("//div[@class='d-flex label-value-value'][normalize-space()='Demo user']"));
        System.out.println("Business Name: " + businessName.getText());
        WebElement LoginName = driver.findElement(By.xpath("//div[contains(text(),'demo')]"));
        System.out.println("Login Name: " + LoginName.getText());
	}

	@Then("I logged out the page")
	public void i_logged_out_the_page() {
	    driver.findElement(By.xpath("//a[@id='logout-trigger']"));
	}

	@Then("Finally i close the browser")
	public void finally_i_close_the_browser() {
	   driver.quit();
	}









}
