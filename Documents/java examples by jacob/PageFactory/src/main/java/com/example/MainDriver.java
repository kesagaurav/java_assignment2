package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.page.HeroListPage;

public class MainDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String filePath="src/main/resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",filePath);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:4200");
		HeroListPage heroPage=new HeroListPage(driver); 
		heroPage.enterHeroName("Saitama");
		TimeUnit.SECONDS.sleep(5);
		heroPage.clickWelcomeLink();
		
	}

}
