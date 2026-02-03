package annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotaionexample1 {
	
	@BeforeTest
	public void before() {
		System.out.println("before test running");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite running");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite running");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test running");
	}
	
		

	@Test
public void test() {
	System.out.println("test is running");
	
}

}