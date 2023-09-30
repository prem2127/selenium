package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin extends bassclass {

	Fbpojo f;

	@Given("To launch the browser and maximise window")
	public void to_launch_the_browser_and_maximise_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("User has to pass the data {string}in email filed")
	public void user_has_to_pass_the_data_in_email_filed(String email) {
		f = new Fbpojo();
		passText(email, f.getEmail());
	}

	@When("User has to pass the data {string} in password filed")
	public void user_has_to_pass_the_data_in_password_filed(String pass) {
		f = new Fbpojo();
		passText(pass, f.getPassword());
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
		clickBtn(f.getloginbtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	}
}