package com.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryHome {

	public static final String title="Welcome: Mercury Tours";
	@FindBy(xpath="//input[@name='userName']")
	public WebElement username;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(xpath="//input[@type='submit'] [@name='submit']")
	public WebElement submitButton;
	@FindBy(linkText="Home")
	public WebElement homeLink;
	@FindBy(xpath="//a[text()='SIGN-ON']")
	public WebElement signOnLink;
	
	public MercuryHome(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void loginToMercuryTours(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.submitButton.click();
	}
	
	public void goToSignON() {
		signOnLink.click();
	}
	
	
	public void gotoHome() {
		this.homeLink.click();
	}
	
	
	
	
	
}
