package Deepak.Utility.Flipkart;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Deepak.Flipkart.Base.TestBase;

public class Utils extends TestBase {

	static Logger APPLICATION_Logs = Logger.getLogger("Util");

	public static void getScreenshot(String Testname) throws IOException {

		APPLICATION_Logs.info("Attempting to take screenshot");
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils
				.copyFile(
						scrFile,
						new File(
								"E:\\Automation\\EcPProjects1\\PageObjectModel\\src\\Deepak\\Flipkart\\Screenshots\\"
										+ Testname + ".jpg"));
		APPLICATION_Logs
				.info("Screenshot taken at "
						+ "E:\\Automation\\EcPProjects1\\PageObjectModel\\src\\Deepak\\Flipkart\\Screenshots\\"
						+ Testname + ".jpg");

	}

	public static boolean getServerResponse(String link) throws IOException {

		APPLICATION_Logs.info("Identifying Http server response code");
		URL url = new URL(link);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int Rcode = connection.getResponseCode();

		if (Rcode == 200) {
			APPLICATION_Logs.info("SERVER RESPONSE  "+Rcode+"  PAGE IS ALIVE");
			return true;
		} else {
			APPLICATION_Logs.info("SERVER RESPONSE  "+Rcode+"  PAGE IS DEAD");
			return false;
		}

	}

}
