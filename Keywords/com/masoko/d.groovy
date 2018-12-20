package com.masoko
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.sun.org.apache.xpath.internal.operations.String

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class d {

	@Keyword
	def OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","//usr//local//bin//chromedrive");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("–no-sandbox");
		options.addArguments("–disable-dev-shm-usage");
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(options);
		DriverFactory.changeWebDriver(driver);
	}
}