package stepDeff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDeff{
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable{
		System.out.println("User is on home page");
	}
	@When("^User enters credentials and click login$")
	public void User_enters_credentials_and_click_login() throws Throwable{
		System.out.println("User enters credentials and click login");
	}
	@Then("^Login page is displayed$")
	public void Login_page_is_displayed() throws Throwable{
		System.out.println("Login page is displayed");
	}
}