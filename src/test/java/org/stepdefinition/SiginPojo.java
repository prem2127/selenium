package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiginPojo extends bassclass  {
	
 public SiginPojo() {
	 PageFactory.initElements(driver, this);
	 
}
 @FindBy(id = "email")
 private WebElement loginemail;
 
 @FindBy(id = "pass")
 private WebElement loginpassword;
 
 @FindBy(xpath="//a[text()='Create new account']")
private WebElement CreateNewAcc;
 
 @FindBy(xpath="(//input[@type='text'])[2]")
 private WebElement firsteNameTxtBox;
 
@FindBy(name = "lastname")
private WebElement SecondNameTxtBox;

@FindBy(name = "reg_email__")
private WebElement MobileorEmailTxtBox;

@FindBy(name = "reg_passwd__")
private WebElement newPassword;

public WebElement getCreateNewAcc() {
	return CreateNewAcc;
}

public WebElement getFirsteNameTxtBox() {
	return firsteNameTxtBox;
}

public WebElement getSecondNameTxtBox() {
	return SecondNameTxtBox;
}

public WebElement getMobileorEmailTxtBox() {
	return MobileorEmailTxtBox;
}

public WebElement getNewPassword() {
	return newPassword;
	
}

}

