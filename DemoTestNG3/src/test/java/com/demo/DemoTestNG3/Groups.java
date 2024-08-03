package com.demo.DemoTestNG3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups {
	public void start() {
		System.out.println("Test start");
	}
	
	@AfterTest
	public void end() {
		System.out.println("Test end");
	}
	
	@Test(priority=1, description="this is test a1", groups="a")
	public void a1test() {
		System.out.println("Test a1 passed");
	}
	
	@Test(priority=2, description="this is test a2", groups="a")
	public void a2test() {
		System.out.println("Test a2 passed");
	}
	
	@Test(priority=3, description="this is test a3", groups="a")
	public void a3test() {
		System.out.println("Test a3 passed");
	}
	
	@Test(priority=1, description="this is test b1", groups="b")
	public void b1test() {
		System.out.println("Test b1 passed");
	}
	
	@Test(priority=2, description="this is test b2", groups="b")
	public void b2test() {
		System.out.println("Test b2 passed");
	}

	@Test(priority=2, description="this is test b3", groups="b")
	public void b3test() {
		System.out.println("Test b3 passed");
	}
	
	@BeforeMethod
	public void DBConnected() {
		System.out.println("database connected...");
	}

	@AfterMethod
	public void DBDisconnected() {
		System.out.println("database disconnected...");
	}}
