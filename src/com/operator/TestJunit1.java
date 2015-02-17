package com.operator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import com.thoughtworks.selenium.Selenium;



public class TestJunit1 extends SeleneseTestCase{
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe", "http://www.weather.com/");
		selenium.start();
	}

	@Test
	public void testTC1() throws Exception {
		selenium.open("http://www.weather.com");
		selenium.type("name=search", "11230");
		selenium.click("//div[@id='wx-header']/div/div/div[2]/div/div[2]/div/div/section/div/div");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Brooklyn, NY (11230) Weather", selenium.getText("css=h1.ng-binding"));
	}
	@Test
	public void testTC2() throws Exception {
		selenium.open("/");
		selenium.type("name=search", "11230");
		selenium.click("//div[@id='wx-header']/div/div/div[2]/div/div[2]/div/div/section/div/div");
		selenium.waitForPageToLoad("30000");
		verifyEquals("Brooklyn, NY (11230) Weather", selenium.getText("css=h1.ng-binding"));
	}
	private void verifyEquals(String string, String text) {
		String str = "Brooklyn, NY (11230) Weather";
		String txt = "css=h1.ng-binding";
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}

