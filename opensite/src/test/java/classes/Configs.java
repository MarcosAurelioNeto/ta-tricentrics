package classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Configs {
	
	public static ChromeOptions options = new ChromeOptions().addArguments(
			"start-maximized","disable-extensions"
			,"--ignore-ssl-errors","--no-sandbox"
			,"--ignore-certificate-errors"
			,"--headless"
			);
	
	static ChromeDriver chromeBrowser =  new ChromeDriver(options);
	
	public static WebDriver getDriver() { return chromeBrowser; };
	
	public static void quitDriver() {
		chromeBrowser.close();
		chromeBrowser.quit();
	}
}
