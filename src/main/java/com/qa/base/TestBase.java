package com.qa.base;

import java.util.Properties;

import com.qa.util.CommonDriver;
import com.qa.util.Utils;

public class TestBase {

	private static String sPropertiesFile = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\qa\\config\\config.properties";
	public static Properties oDriverProperties;
	public static CommonDriver oDriver;
	

	public TestBase() {
		oDriver = new CommonDriver();
		oDriverProperties = Utils.getProperties(sPropertiesFile);
	}

	public static void initialize() {
		System.out.println(oDriver);
		String sBrowserType = oDriverProperties.getProperty("browser");
		String sUrl = oDriverProperties.getProperty("url");
		oDriver.openBrowser(sBrowserType, sUrl);

	}

}
