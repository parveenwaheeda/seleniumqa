package com.testscenarios;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class Popup extends CommonFunctions {
	@BeforeClass
	public void setup() {
		chromeBrowserLaunch();
	}

	@Test
	public void f() throws InterruptedException {
		chromeBrowserLaunch();
		driver.get("https://demoqa.com/browser-windows");
		String PWindow = driver.getWindowHandle();
		System.out.println(PWindow);

		clickByAnylocator(By.id("windowButton"));
		Set<String> string = driver.getWindowHandles();

		for (String CWindow : string) {
			System.out.println(CWindow);

			if (!CWindow.equals(PWindow)) {
				driver.switchTo().window(CWindow);
				WebElement ele = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
				String s = ele.getText();
				System.out.println(s);
				driver.close();

			}

		}
		driver.switchTo().window(PWindow);
		clickByAnylocator(By.xpath("//button[@id='tabButton']"));

		switchToNewTab();
		
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		WebElement ele1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String s1 = ele1.getText();
		System.out.println(s1);
		driver.close();
		
		driver.switchTo().window(PWindow);
	

		//switchAndCloseNewTab();
		
		//driver.switchTo().window(PWindow);
	

		//driver.quit();

	}

}
