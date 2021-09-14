package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Products {
    By items= By.className("s-item__title");
    By items_price= By.className("s-item__price");
    public WebDriver driver;
    public Products(WebDriver driver){
        this.driver= driver;
    }
    public void saveItems(){
        List<WebElement> element_title_List=driver.findElements(items);
        List<WebElement> element_price_List= driver.findElements(items_price);
        System.out.println(element_title_List.size());
        System.out.println(element_price_List.size());
        try{
            createFile(element_title_List,element_price_List);
        } catch(IOException e){
            System.out.println("UHHHHHHHHHHHOOOOOOOOOOOO");
            e.printStackTrace();
        }

    }
    public void createFile(List<WebElement> title, List<WebElement> price) throws IOException {
        FileWriter elementWriter = new FileWriter("products.txt");
        for(int i=0,k =0; (i< title.size())&& (k< price.size());++i, k++){
            elementWriter.write("Title: "+title.get(i).getText()+", Price: "+price.get(k).getText()+"\n");
        }
        elementWriter.close();
    }

}
