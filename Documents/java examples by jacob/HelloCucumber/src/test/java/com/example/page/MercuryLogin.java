package com.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryLogin {

	public static final String title="Login: Mercury Tours";
	
	@FindBy(xpath="//h3[text()='LoginSuccesfully']")
	public WebElement header;
	
	public WebElement signOffLink;
	
	public MercuryLogin(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}
}
