package POM;

import org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class keywordss {


	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
		
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
		
	}
	
	@BeforeMethod
	public void beforemethode() {
		System.out.println("before methode");
		
	}
	@AfterMethod
	public void aftermethode() {
		System.out.println("after methode");
		
	}
	
	@Test(enabled = false)
	public void tests() {
		System.out.println("test 5 is complt");
	}
	
	@Test(timeOut = 3000)//yeh test fail me jata he timeout vala
	public void testk() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("test 6 is cmplt");
	}
	
	@Test(dependsOnMethods = {"Tests"})//{}braket me nam dena padta he 
	public void testr() {
		System.out.println("login page");
	}
	
	@Test(priority = 1)
	public void testa() {
		System.out.println("test1 complted");
	}
d	
	@Test(priority = -1)
	public void testc() {
	System.out.println("test 3 is completed");
	}
	//seqvence =priority -1,deafult or zero priority, priority 1 	
	// alphabet wise run hoti a,b,c priority nahi ditoh
	
		@Test(invocationCount = 2)//multipal tym run karta
  public void test2() {
	System.out.println("test2 complted");
	
}	
	
	
}
