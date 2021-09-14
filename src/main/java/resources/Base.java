package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties p= new Properties();
	public WebDriver init() throws IOException {
		

		
		FileInputStream fis = new FileInputStream("/Users/betabbelihu/downloads/demo2/src/main/java/resources/testdata.properties");
		p.load(fis);
		p.getProperty("url");
		System.setProperty("webdriver.chrome.driver","/Users/betabbelihu/downloads/demo2/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}

}
