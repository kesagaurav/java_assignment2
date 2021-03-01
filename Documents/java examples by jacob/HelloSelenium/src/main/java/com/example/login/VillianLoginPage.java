package com.example.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VillianLoginPage {

	private WebDriver driver;
	private WebElement header;
	private WebElement villnameField;
	private WebElement powerField;
	private WebElement submitButton;
	public VillianLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		this.navigateTo();
		this.header = driver.findElement(By.tagName("h3"));
		this.villnameField = driver.findElement(By.name("villianname"));
		this.powerField = driver.findElement(By.name("superpower"));
		this.submitButton = driver.findElement(By.name("villiansubmit"));
	}
	
	public void setVillainName(String name) {
		this.villnameField.clear();
		this.villnameField.sendKeys(name);
	}
	public String getVillainName() {
		return this.villnameField.getAttribute("value");
	}
	public void setPower(String power) {
		this.powerField.clear();
		this.powerField.sendKeys(power);
	}
	public String getPower() {
		return this.powerField.getAttribute("value");
	}
	public String getHeader() {
		return this.header.getText();
	}
	public void submit() {
		this.submitButton.click();
	}
	
	
	
	public void navigateTo() {
		this.driver.get("http://localhost:9019/html/index.html");
	}
	
	

}
