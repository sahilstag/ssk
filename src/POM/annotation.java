package POM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {

	
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
		
	}	@Test
	public void test1() {
		System.out.println("test1 complted");
		
	}
	@Test
  public void test2() {
	System.out.println("test2 complted");
	
}	@BeforeTest
public void beforetest() {
	System.out.println("before test");
	
}
@AfterTest
public void aftertest() {
	System.out.println("after test");
	
}

	
}
