package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
	private static WebDriver driver;
	public static WebDriver getDriver() {
		if(driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
			switch(Config.getProperty("browser")) {
			case "firefox":
				System.setProperty("webdriver.gecko.driver", Config.getProperty("firefox"));
				driver = new FirefoxDriver();
				break;
			case "chrome":
				System.setProperty(Config.getProperty("webdriver"), Config.getProperty("driverPath"));
				 ChromeOptions option = new ChromeOptions();
				    option.addArguments("disable-infobars");
				    option.addArguments("start-fullscreen");
				    driver = new ChromeDriver(option);
				break;
			case "ie":
				System.setProperty("webdriver.gecko.driver", Config.getProperty("ie"));
				driver = new InternetExplorerDriver();
				break;
			case "safari":
					driver = new SafariDriver();
					break;
			default:
				System.setProperty(Config.getProperty("webdriver"), Config.getProperty("driverPath"));
				 ChromeOptions options = new ChromeOptions();
				 options.addArguments("disable-infobars");
				 options.addArguments("start-fullscreen");
				 driver = new ChromeDriver(options);
			}
		}
		return driver;
	}
	
		public static void closeDriver() {
			if (driver != null) {
				driver.quit();
			}

		}
}
