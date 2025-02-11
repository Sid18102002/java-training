import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsPercCalc {
	private static WebElement ele = null;
	
	//Math Calculator
	public static WebElement link_math_calc(WebDriver driver) {
		ele = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a"));
		return ele;
	}
	
	//Percentage Calculator
	public static WebElement link_percentage_calc(WebDriver driver) {
		ele = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a"));
		return ele;
	}
	
	//Num 1
	public static WebElement link_num1(WebDriver driver) {
		ele = driver.findElement(By.xpath("//*[@id=\"cpar1\"]"));
		return ele;
	}
	
	//Num 2
	public static WebElement link_num2(WebDriver driver) {
		ele = driver.findElement(By.xpath("//*[@id=\"cpar2\"]"));
		return ele;
	}
	
	//Calculate button
	public static WebElement link_claculate_button(WebDriver driver) {
		ele = driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]"));
		return ele;
	}
	
	//Result
	public static WebElement link_result(WebDriver driver) {
		ele = driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b"));
		return ele;
	}

}
