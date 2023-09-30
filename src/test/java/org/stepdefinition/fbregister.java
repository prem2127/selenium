package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbregister extends bassclass {
	
	SiginPojo s;
	
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To  launch url of application")
	public void to_launch_url_of_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To Click the create new Account button")
	public void to_Click_the_create_new_Account_button() {
	    s = new SiginPojo();
	    clickBtn(s.getCreateNewAcc());
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box() throws InterruptedException {
		Thread.sleep(3000);
		 s = new SiginPojo();
		 passText("prem", s.getFirsteNameTxtBox());
	}

	@When("To pass secondname in  secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		 s = new SiginPojo();
		 passText("john", s.getSecondNameTxtBox());
	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box() {
		 s = new SiginPojo();
		 passText("premjohn2021@gmail.com", s.getMobileorEmailTxtBox());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		 s = new SiginPojo();
		 passText("prem2120", s.getNewPassword());
		 }

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		//closeEntireBrowser();
	   
	}


}
