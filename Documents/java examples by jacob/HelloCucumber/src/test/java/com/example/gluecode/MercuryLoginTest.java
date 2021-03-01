package com.example.gluecode;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.page.MercuryHome;
import com.example.page.MercuryLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MercuryLoginTest {

	public MercuryHome mh;
	public MercuryLogin ml;
	
	
	
	@Given("a user is at the homepage of Mercury tours")
	public void a_user_is_at_the_homepage_of_mercury_tours() {
		this.mh=new MercuryHome(MercuryDriverUtility.driver);
		assertEquals(MercuryHome.title,MercuryDriverUtility.driver.getTitle());
	
	}


	//Some other steps were also undefined:

	@When("a user inputs their {string}")
	public void a_user_inputs_their_username(String string) {
		this.mh.username.sendKeys(string);
		
	}
	@When("a user inputs  {string}")
	public void a_user_inputs_password(String string) {
	    this.mh.password.sendKeys(string);
	}
	@When("then submits the information")
	public void then_submits_the_information() {
		this.mh.submitButton.click();
	}
	@Then("the User is redirected to the successful login page")
	public void the_user_is_redirected_to_the_successful_login_page() {
WebDriverWait wait=new WebDriverWait(MercuryDriverUtility.driver,2);
wait.until(ExpectedConditions.titleContains("Login"));
this.ml=new MercuryLogin(MercuryDriverUtility.driver);

assertEquals(MercuryLogin.title,MercuryDriverUtility.driver.getTitle());
		
	}
	
}
