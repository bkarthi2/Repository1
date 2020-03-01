package com.ConfigurationFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

	public WebDriver driver = null;;
	public Properties prop;

	public WebDriver InvokingBrowser() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Bonamoni\\Interviewdemo\\src\\main\\java\\RunTime.Properties");
		prop.load(fis);

		System.out.println(prop.getProperty("browser"));
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
		System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxpath"));

		if (prop.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();

		} else if (prop.getProperty("browser").equals("firefox")) {

			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("Url"));

		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public Properties properties() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Bonamoni\\Interviewdemo\\src\\main\\java\\RunTime.Properties");
		prop.load(fis);
		return prop;

	}

}
