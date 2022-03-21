package com.testscenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.utilities.CommonFunctions;

public class Toyato1 extends CommonFunctions {
	@Test
	public void testToyato() throws Exception {
		chromeBrowserLaunch();
		driver.get("https://forms.toyota.co.uk/brochure");
		clickByAnylocator(By.xpath("//a[@ class='tgbgdpr-cta-primary']"));
		clickByAnylocator(By.xpath("//a[@class='dropdown-toggle  ']"));
		Thread.sleep(3000);
		clickByAnylocator(By.xpath("//a[@data-value='Mrs']"));
		sendKeyByAnyLocator(By.name("firstname"), "wah");
		sendKeyByAnyLocator(By.name("surname"), "moh");
		sendKeyByAnyLocator(By.name("email"), "wah.moh@gmail.com");
		clickByAnylocator(By.id("submit-br"));
		takescreenshot();
		driver.quit();
	}

}
