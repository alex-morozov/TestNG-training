package ru.trainings.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.trainings.common.TestBase;


public class TestClass extends TestBase{	 
		 	  
	@Test ( groups = ("positive"))
	public static void LoginOK (){
		    TestBase.driver.findElement(By.linkText("Войти")).click();
		    TestBase.driver.findElement(By.name("loginuser")).clear();
		    TestBase.driver.findElement(By.name("loginuser")).sendKeys("SeleniumBass");
		    TestBase.driver.findElement(By.name("loginpassword")).clear();
		    TestBase.driver.findElement(By.name("loginpassword")).sendKeys("elena1989");
		    TestBase.driver.findElement(By.name("btnlogin")).click();		   
	}
	
	@Test ( groups = ("negative"))
	public static void LoginWrong (){
		    TestBase.driver.findElement(By.linkText("Войти")).click();
		    TestBase.driver.findElement(By.name("loginuser")).clear();
		    TestBase.driver.findElement(By.name("loginuser")).sendKeys("Wrong");
		    TestBase.driver.findElement(By.name("loginpassword")).clear();
		    TestBase.driver.findElement(By.name("loginpassword")).sendKeys("elena1989");
		    TestBase.driver.findElement(By.name("btnlogin")).click();		   
	}
	
	@Test ( groups = ("positive"))
	public static void showButton (){
		TestBase.driver.findElement(By.linkText("бас-гитары")).click();
		TestBase.driver.findElement(By.cssSelector("input[type=\"button\"]"));		
	}
	
}
