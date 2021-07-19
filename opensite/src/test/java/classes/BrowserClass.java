package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BrowserClass {

	protected WebDriver driver;
	int time = 60;
	
	protected BrowserClass(WebDriver browser){
		driver = browser;
	}
	
	public void openSite(String url) {
		driver.get(url);
	}
	
	public void cleanElement(By locator) {

		WebElement element = (WebElement) new WebDriverWait(driver,time).
				until(ExpectedConditions.presenceOfElementLocated(locator));
		element.clear();
		
	}
	
	public void clickElement(By locator) {

		WebElement element = (WebElement) new WebDriverWait(driver,time).
				until(ExpectedConditions.elementToBeClickable(locator));
		element.click();

	}
	
	public void fillField(By locator,String keys) {

		WebElement element = (WebElement) new WebDriverWait(driver,time).
				until(ExpectedConditions.elementToBeClickable(locator));
		element.sendKeys(keys);

	}
	
	public void waitTextPresentInElement(By locator,String value) {
		new WebDriverWait(driver,time).until(ExpectedConditions.textToBePresentInElementLocated(locator,value));
		
	}
	
}
