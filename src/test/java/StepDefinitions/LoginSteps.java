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
		
		
		driver.navigate().refresh();

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


	@When("I click on {string} button")
	public void i_click_on_button(String string) {
	    driver.findElement(By.xpath("//a[@href='/banking/self/payment']")).click();
	}

	@Then("I get the available balance from the current account")
	public void i_get_the_available_balance_from_the_current_account() {
		WebElement AvailableBlc = driver.findElement(By.xpath("//label-value[2]//label[1]/following-sibling::*"));
        System.out.println("Available balance: " + AvailableBlc.getText());
	}

	@Then("I select the user details")
	public void i_select_the_user_details() {
	   driver.findElement(By.xpath("//input[@placeholder='Type to search']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("Ann's Café");
	   
	   driver.findElement(By.xpath("//*[@id='dropdown-menu-id_4']")).click();
	   
	   driver.findElement(By.xpath("//input[@id='id_3']")).sendKeys("100");
	   

	}

	@Then("I make a payment in the {string} field")
	public void i_make_a_payment_in_the_field(String string) {
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]/parent::*")).click();
        System.out.println("Next button clicked");

	}

	@Then("I click the payment confirmation mode")
	public void i_click_the_payment_confirmation_mode() {
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]/parent::*")).click();
        System.out.println("Next button clicked");

	 //   driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).click();
	       System.out.println("confirm button clicked");
	}


	@Then("I should see a confirmation message saying {string}")
	public void i_should_see_a_confirmation_message_saying(String string) {
	   driver.quit();
	}


	@When("I click on {string} button in the Banking")
	public void i_click_on_button_in_the_banking(String string) {
	   driver.findElement(By.xpath("(//div[normalize-space()='Payment to system'])[1]")).click();
	   
	}

	@Then("I make a payment in the {string} field in the banking")
	public void i_make_a_payment_in_the_field_in_the_banking(String string) {
		  driver.findElement(By.xpath("//input[@id='id_1' or 3]")).sendKeys("100");
	}
	@Then("I select the {string} feild")
	public void i_select_the_feild(String string) {
	    driver.findElement(By.xpath("//a[@id='menu_banking']")).click();
	}
	@Then("I get the limit Balance from the member account")
	public void i_get_the_limit_balance_from_the_member_account() {
		WebElement LimitBlc = driver.findElement(By.xpath("//div[normalize-space()='Negative limit']/following-sibling::*"));
        System.out.println("Available balance: " + LimitBlc.getText());
	}

	@Then("I download the details in the Banking Feild")
	public void i_download_the_details_in_the_banking_feild() {
		driver.findElement(By.xpath("//*[contains(text(),\"Download\")]")).click();
	   
	}
	@Then("I get the available balance from the current account in the Member Account")
	public void i_get_the_available_balance_from_the_current_account_in_the_member_account() {
	//	driver.findElement(By.xpath("(//*[contains(text(),\"Available balance\")]/parent::div/following-sibling::div)[1]"));
		
		WebElement AvailableBlcs = driver.findElement(By.xpath("(//*[contains(text(),'Available balance')]/parent::div/following-sibling::div)[1]"));
        System.out.println("Available balances: " + AvailableBlcs.getText());
	}





}
