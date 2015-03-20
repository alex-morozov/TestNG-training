package ru.trainings.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public static WebDriver driver = new FirefoxDriver();
	public static String baseURL = "http://www.musicforums.ru/";
		
	@BeforeTest
	  public void init (){
	  driver.get(baseURL);
	  }
	
	@AfterTest
	public void stop (){
		driver.quit();
	}
}