package carbohydrate_calculator;

import java.time.Duration;
import org.junit.*; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCarbCalculator {
	// This test opens the carbohydrate calculator page on the Chrome browser and 
	// validates if the page heading has appeared
	WebDriver driver;

	@Test
	public void testLoadUrl() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/carbohydrate-calculator.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		boolean titleShown = driver.getTitle().contains("Carbohydrate Calculator");
		// Chekc if "Carbohydrate Calculator" appears on the page title
		Assert.assertTrue(titleShown, "Failed to show page header");
	}
	
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
