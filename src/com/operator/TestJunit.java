package com.operator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;

public class TestJunit extends SeleneseTestCase{

	@Before
	public void setUp() throws Exception {
		System.out.println("Before TC Running");
		selenium= new DefaultSelenium("localhost",4444,"*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","http://www.weather.com/" );
		selenium.start();
	}
	@Test
	public void test1() throws Exception {
		System.out.println("TC1 Running");
		selenium.open("http://www.weather.com/");
		selenium.type("name=search", "11230");
		selenium.click("css=div.dl-hotspot");
		Thread.sleep(5000);
		boolean vResult = selenium.isTextPresent("Brooklyn, NY (11230) Weather");
		if(vResult){
			System.out.println("pass");
			
		}else{
			System.out.println("Fail");
			fail("JUnit Result: Fail");
		}
		System.out.println("TCI Run complete");
		
	}
	@Test
	public void test2() throws Exception {
		System.out.println("TC2 Running");
		selenium.open("/");
		selenium.type("name=search", "11230");
		selenium.click("css=div.dl-hotspot");
		Thread.sleep(5000);
		boolean vResult = selenium.isTextPresent("Brooklyn, NY (11230) Weather");
		if(vResult){
			System.out.println("pass");
			
		}else{
			System.out.println("Fail");
			fail("JUnit Result: Fail");
		}
		System.out.println("TCI Run complete");
	}
	@After
	public void tearDown() throws Exception {
	}
}
