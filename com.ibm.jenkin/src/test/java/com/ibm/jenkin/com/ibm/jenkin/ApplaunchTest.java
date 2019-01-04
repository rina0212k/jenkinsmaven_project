package com.ibm.jenkin.com.ibm.jenkin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class ApplaunchTest{
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("Browser is launched");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\seleniumsetupfiles\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://retail.hommelle.com/");
	  String s = driver.getTitle();
	  String expected = "Retail";
	  assertEquals(s,expected);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
