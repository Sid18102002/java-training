package com.demo.DemoTestNG3;

import org.testng.annotations.Test;

public class logtest {
	@Test(priority=2)
	public void atest() {
		System.out.println("hello to test a");	}
	
	@Test(priority=1)
	public void btest() {
		System.out.println("hello to test b");	}
}
