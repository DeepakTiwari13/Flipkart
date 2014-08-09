package Deepak.Flipkart.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Deepak.Utility.Flipkart.Constants;

public class TestBase {

	public static Properties OR = null;
	public static Properties CON = null;
	public static WebDriver driver = null;
	public static String isLoggegin = null;
	static Logger APPLICATION_Logs = Logger.getLogger("TestBase");

	public static void InitConf() throws IOException {

		APPLICATION_Logs.info("Reading properties file");

		if (CON == null) {
			OR = new Properties();
			FileInputStream ORReader = new FileInputStream(Constants.ORPath);
			OR.load(ORReader);

			CON = new Properties();
			FileInputStream ConReader = new FileInputStream(Constants.ConPath);
			CON.load(ConReader);
		}
	}

	public static void InitDriver() {
		APPLICATION_Logs.info("Reading driver configuration");
		if (driver == null) {

			if (CON.getProperty("Browser").equals("Chrome")) {
				System.setProperty(
						"webdriver.chrome.driver",
						"E:\\Automation\\EcPProjects1\\PageObjectModel\\src\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (CON.getProperty("Browser").equals("IE")) {
				System.setProperty(
						"webdriver.chrome.driver",
						"E:\\Automation\\EcPProjects1\\PageObjectModel\\src\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			APPLICATION_Logs.info("Maximizing browser");
			driver.manage().window().maximize();
			APPLICATION_Logs.info("Applying implicit wait");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			APPLICATION_Logs.info("Reading page load timeout");
			driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		}
	}

	public void QuitDriver() {
		APPLICATION_Logs.info("Closing browser");
		driver.quit();
		APPLICATION_Logs.info("Distroying driver object");
		driver = null;

	}

}
