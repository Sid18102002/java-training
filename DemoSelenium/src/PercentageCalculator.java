import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PercentageCalculator {
	public static void main(String[] args) {
		PageObjectsPercCalc page_objects_perc_calc = null;
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.calculator.net/");
		//using PageObjectsPercCalc library
		page_objects_perc_calc.link_math_calc(driver).click(); //clicking on math calculator
		page_objects_perc_calc.link_percentage_calc(driver).click(); //clicking on percentage calculator
		page_objects_perc_calc.link_num1(driver).click(); // clicking on num1
		page_objects_perc_calc.link_num1(driver).sendKeys("10"); // putting 10 on num1
		page_objects_perc_calc.link_num2(driver).click(); // clicking on num2
		page_objects_perc_calc.link_num2(driver).sendKeys("50"); // putting 50 on num2
		page_objects_perc_calc.link_claculate_button(driver).click(); // clicking on the calculate button
		String result = page_objects_perc_calc.link_result(driver).getText(); // Storing the result in result String
		if(result.equals("5")) {
			System.out.println("The reuslt is pass");
		}
		else {
			System.out.println("The result is fail");
		}
		driver.close();		
	}
}