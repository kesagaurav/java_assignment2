
package com.example.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserLoginPage {

	private WebDriver driver;
	private WebElement header;
	private WebElement nameField;
	private WebElement passwordField;
	private WebElement submitButton;
	public UserLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		this.navigateTo();
		this.header = driver.findElement(By.tagName("h3"));
		this.nameField = driver.findElement(By.name("name"));
		this.passwordField = driver.findElement(By.name("password"));
		this.submitButton = driver.findElement(By.name("usersubmit"));
	}
	
	public void setVillainName(String name) {
		this.nameField.clear();
		this.passwordField.sendKeys(name);
	}
	public String getVillainName() {
		return this.nameField.getAttribute("value");
	}
	public void setPower(String power) {
		this.passwordField.clear();
		this.passwordField.sendKeys(power);
	}
	public String getPower() {
		return this.passwordField.getAttribute("value");
	}
	public String getHeader() {
		return this.header.getText();
	}
	public void submit() {
		this.submitButton.click();
	}
	
	
	
	public void navigateTo() {
		this.driver.get("http://localhost:9023/html/index.html");
	}
	
	
	
}
