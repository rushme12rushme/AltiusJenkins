package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AltiusLogin {
	@Given("User is present in Altius Pro Login Page")
	public void user_is_present_in_altius_pro_login_page() {
	System.out.println("first method");
	}

	@When("User logs in with username and password")
	public void user_logs_in_with_username_and_password() {
		System.out.println("second method");

	}

	@Then("Altius HomePage is displayed")
	public void altius_home_page_is_displayed() {
		System.out.println("third method");

	}




}
