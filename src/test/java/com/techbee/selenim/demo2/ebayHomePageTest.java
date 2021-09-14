package com.techbee.selenim.demo2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.Products;
import pageObject.Search;
import resources.Base;

public class ebayHomePageTest extends Base {

	
	
	//@BeforeEach
	// call initialize
	
	
	@Test
	public void launcheBayApp() throws FileNotFoundException {
		try {
			driver = init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(p.getProperty("url"));
		System.out.println("Launched eBay Home Page");
	    Search s = new Search(driver);
//	    driver.findElement(By.cssSelector("input#gh-ac.gh-tb.ui-autocomplete-input")).sendKeys("iphone");
//	    driver.findElement(By.id("gh-btn")).click();
	    s.getSearchItem("iphone");
	    s.getSearchButton().click();
		Products pr= new Products(driver);
		pr.saveItems();
		quit(driver);
	}
	
	@AfterEach
	public void quit(WebDriver driver){
		 driver.quit();

	}

	//driver.quit

	
	// @Test
	
	
	
	
	
}
