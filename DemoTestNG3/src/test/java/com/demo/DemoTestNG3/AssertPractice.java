package com.demo.DemoTestNG3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPractice {
	
	@Test
	public void NormalAssert(){
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.ebay.com/");
		String exptitle = dr.getTitle();
		String acttitle = "Electronics, Cars, Fashion, Collectibles & More | ebay";
		String exptext = "Search";
		String acttext = dr.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
	
		//Comparing Titles
		System.out.println(exptitle);
		System.out.println(acttitle);
		System.out.println("Comparing titles...");
		Assert.assertEquals(exptitle, acttitle);
		
		//Comparign Element text
		System.out.println(exptext);
		System.out.println(acttext);
		System.out.println("Comparting text...");
		Assert.assertEquals(exptext, acttext);
	}

	@Test
	public void SoftAssertTest(){
		SoftAssert sa = new SoftAssert();
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("https://www.ebay.com/");
		String exptitle = dr.getTitle();
		String acttitle = "Electronics, Cars, Fashion, Collectibles & More | ebay";
		String exptext = "Search";
		String acttext = dr.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
	
		//Comparing Titles
		System.out.println(exptitle);
		System.out.println(acttitle);
		System.out.println("Comparing titles...");
		sa.assertEquals(exptitle, acttitle);
		
		//Comparign Element text
		System.out.println(exptext);
		System.out.println(acttext);
		System.out.println("Comparting text...");
		sa.assertEquals(exptext, acttext);
	}
}
