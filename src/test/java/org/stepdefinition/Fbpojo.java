package org.stepdefinition;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fbpojo {
public Fbpojo() {
	
}
@FindBy(id="email")
private WebElement email;


@FindBy(xpath = "input[@aria-label=\"Password\"]")
private WebElement Password;


@FindBy(name="login")
private WebElement loginbtn;

public WebElement getEmail() {
	return email;
}
	
	public WebElement getPassword() {
		return Password;
	}
	
public WebElement getloginbtn() {
		return loginbtn;
	}



	
}

	



