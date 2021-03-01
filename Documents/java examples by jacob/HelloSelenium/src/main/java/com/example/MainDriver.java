package com.example;

import java.io.File;
import com.example.login.VillianLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.login.VillianLoginPage;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://google.com");
		
		//WebElement searchBar=driver.findElement(By.name("q"));
		//WebElement searchButton=driver.findElement(By.name("btnk"));
		
		VillianLoginPage page=new VillianLoginPage(driver);
		page.navigateTo();
		
	}

}
