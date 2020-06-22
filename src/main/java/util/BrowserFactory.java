package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver startBrowser() {
		//Set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mandira\\selenium\\FinalPracticalExam\\Driver\\chromedriver.exe");
		//Connect with driver
		driver = new ChromeDriver();
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Delete cookies
		driver.manage().deleteAllCookies();
	    //Go to the site
	    driver.get(" http://techfios.com/test/101/");
		return driver;
		

	}

}
