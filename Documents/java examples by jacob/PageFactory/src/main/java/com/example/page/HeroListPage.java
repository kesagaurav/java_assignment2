package com.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroListPage {

	WebDriver driver;
	@FindBy(xpath="//*[@type='text']")
	WebElement input;
	@FindBy(xpath="//*[@routerLink='/welcome']")
	WebElement welcomeLink;
	
	public HeroListPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterHeroName(String name) {
		input.sendKeys(name);
	}
	
	public void clickWelcomeLink() {
		welcomeLink.click();
	}
}
