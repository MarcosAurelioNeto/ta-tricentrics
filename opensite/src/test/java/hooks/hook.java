package hooks;

import static classes.Configs.quitDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
public class hook {
	
	@Before
	public void setup() {
		String os= System.getProperty("os.name");

			if(os.contains("Lin")) {
				System.setProperty("webdriver.chrome.driver","src/drivers/linux/chromedriver");
			}else if(os.contains("Win")) {
				System.setProperty("webdriver.chrome.driver","src/drivers/windows/chromedriver.exe");
			}
		
	}
	
	
	@After
	public void tearDown() {
		quitDriver();
	}
	
}
