package com.demo.DemoTestNG3;
import org.testng.annotations.*;

public class demo2 {
	@BeforeTest
	public void start() {
		System.out.println("Test start");
	}
	
	@AfterTest
	public void end() {
		System.out.println("Test end");
	}
	
	@Test(priority=4, description="this is test a")
	public void atest() {
		System.out.println("Test a passed");
	}
	
	@Test(priority=2, description="this is test b", enabled=false)
	public void btest() {
		System.out.println("Test b passed");
	}
	
	@Test(priority=1, description="this is test c")
	public void ctest() {
		System.out.println("Test c passed");
	}
	
	@Test(priority=3, description="this is test d")
	public void dtest() {
		System.out.println("Test d passed");
	}
	
	@BeforeMethod
	public void DBConnected() {
		System.out.println("database connected...");
	}

	@AfterMethod
	public void DBDisconnected() {
		System.out.println("database disconnected...");
	}
}

