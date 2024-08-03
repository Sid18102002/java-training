import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class demo1 {

	public static void main(String[] args) {
		
		/*
		FirefoxDriver dr = new FirefoxDriver();
		//ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.google.com");
		//dr.manage().window().fullscreen();
		//dr.findElement(By.className("M6CB1c rr4y5c")).click();
		// we can find the element by id/class/CSS
		dr.findElement(By.id("APjFqb")).sendKeys("mobile");
		dr.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")).click();
		//dr.findElement(By.className("M6CB1c rr4y5c")).click();
		dr.findElement(By.xpath("/html/body/div[3]/div/div[12]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/span/a/h3")).click();
		dr.findElement(By.cssSelector(".zDPmFV")).click();
		dr.findElement(By.cssSelector(".zDPmFV")).sendKeys("shoes");
		dr.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click();
		*/
		
		
		FirefoxDriver dr = new FirefoxDriver();
		/*
		dr.get("https://demo.guru99.com/test/radio.html");
		//Radio Button--------------------------------------------------------------------
		WebElement radio1 = dr.findElement(By.id("vfb-7-1")); //first radio button
		WebElement radio2 = dr.findElement(By.id("vfb-7-2")); //second radio button
		radio1.click();
		System.out.println("Radio Button Option 1 Selected");
		radio2.click();
		System.out.println("Radio Button Option 2 Selected");
		
		//CheckBox------------------------------------------------------------------------
		WebElement check1 = dr.findElement(By.id("vfb-6-0")); //first checkbox button
		check1.click();
		System.out.println("Checkbox Button Option 1 Selected");
		
		//Check whether the Check box is toggled on---------------------------------------
		if (check1.isSelected())	{
			System.out.println("Checkbox is toggled on");
		}
		else {
			System.out.println("Checkbox is toggled off");
		}
		*/
		
		/*
		//Selecting Checkbox and using isSelected Method----------------------------------
		dr.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement chkFBPersist = dr.findElement(By.id("persist_box"));
		for (int i=0 ; i<2 ; i++) {
			chkFBPersist.click();
			System.out.println("Facebook Persists Checkbox status is - " + chkFBPersist.isSelected());
		}
		// driver.close();
		
		//Drop down button----------------------------------------------------------------
		dr.get("https://www.bstackdemo.com/");
		WebElement dropdown = dr.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[1]/div[1]/select/option[1]"));
		dropdown.selectByValue("lowestprice");
		*/
		
		
		/*
		//Implict wait--------------------------------------------------------------------
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String eTitle = "Selenium IDE Test";
		String aTitle = "";
		dr.get("https://demo.guru99.com/test/facebook.html");
		dr.manage().window().maximize();
		aTitle = dr.getTitle();
		if(aTitle.equals(eTitle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		*/
		
		/*
		//Explicit Wait-------------------------------------------------------------------
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
		dr.get("https://demo.guru99.com/test/guru99home");
		//dr.manage().window().maximize();
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/ul/li[2]/a")));
		ele.Wait<F>k();
		*/
	
		
		/*
		// Fluent Wait-------------------------------------------------------------------
		dr.get("https://demo.guru99.com/test/facebook.html");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(dr)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		WebElement clickseleniumlink = wait.until(
				new Function<WebDriver, WebElement>() {
					
					public WebElement apply(WebDriver driver) {
						return driver.findElement(
								By.xpath(null));
					}
				}
		*/
		
		//Actions-------------------------------------------------------------------------- 
		/*
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		dr.get(baseUrl);
		WebElement link_home = dr.findElement(By.linkText("Home"));
		WebElement td_Home = dr
				.findElement(By
						.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		Actions builder = new Actions(dr);
		Action mouseOverHome = builder
				.moveToElement(link_home)
				.build();
		
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		mouseOverHome.perform();
		
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor); 
		*/
		
		//Keys----------------------------------------------------------------------------
		
		String baseUrl = "https://www.facebook.com/";
		dr.get(baseUrl);
		WebElement txtUsername = dr.findElement(By.id("email"));
		
		Actions builder = new Actions(dr);
		Action SeriesOfActions = builder
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello")
				.keyUp(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "abc")
				.doubleClick(txtUsername)
				.contextClick()   // contextClick = right click
				.build();
		
		SeriesOfActions.perform();
	}

}
