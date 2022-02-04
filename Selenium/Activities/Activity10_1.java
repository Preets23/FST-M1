
package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");
        String title=driver.getTitle();
        System.out.println("Title of the page= "+title);
        
        Actions action=new Actions(driver);
        
        WebElement cube= driver.findElement(By.xpath("//div[@id='wrapD3Cube']"));
        
        
        //Left click
        action.click(cube);
        
        WebElement value=driver.findElement(By.className("active"));
        System.out.println(value.getText());
        
        //Double click
        action.doubleClick(cube).perform();
        value=driver.findElement(By.className("active"));
        System.out.println(value.getText());
        
        //right click
        action.contextClick(cube).perform();
        value=driver.findElement(By.className("active"));
        System.out.println(value.getText());
        
        driver.close();
        
	
	}		
}