package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Search {
	
	
	public WebDriver driver;
	public Search(WebDriver driver){
		this.driver= driver;
	}
	
//	create your css selectors or xpath for the elements
	By searchbox = By.cssSelector("input#gh-ac.gh-tb.ui-autocomplete-input");
	By searchbutton = By.id("gh-btn");

	
	public void getSearchItem(String item) {
		 driver.findElement(searchbox).sendKeys(item);
	}

	
	public WebElement getSearchButton() {
		  return driver.findElement(searchbutton);
	}




}
