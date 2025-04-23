package carbohydrate_calculator;

import java.time.Duration;
import org.junit.*; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCarbCalculator {
	WebDriver driver;

	@Test
	public void testLoadUrl() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/carbohydrate-calculator.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		boolean titleShown = driver.getTitle().contains("Carbohydrate Calculator");
		Assert.assertTrue(titleShown, "Failed to show page header");
	}
	
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
