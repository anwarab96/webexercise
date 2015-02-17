package com.operator;



import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC2{
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception{
	driver = new FirefoxDriver();
	baseUrl = "http://www.weather.com/";
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void testTC2() throws Exception
	{
		driver.get(baseUrl + "/");
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys("11230");
		driver.findElement(By.xpath("//div[@id='wx-header']/div/div/div[2]/div/div[2]/div/div/section/div/div")).click();
		driver.findElement(By.cssSelector("section.overview")).click();
		
			
		
		
	

	}
	}

/*  
    driver.findElement(By.cssSelector("section.overview")).click();
    try {
      assertEquals("Brooklyn, NY (11230) Weather", driver.findElement(By.cssSelector("h1.ng-binding")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }*/


