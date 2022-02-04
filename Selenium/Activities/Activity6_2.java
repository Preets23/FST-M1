package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity6_2 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Open the browser
        driver.get("https://www.training-support.net/selenium/ajax");
        String title= driver.getTitle();
        System.out.println("Title of the page: "+title);
       
        WebElement changecontent = driver.findElement(By.xpath("//button[@class='ui violet button']"));
        changecontent.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
        String HelloText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(HelloText);
       
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late"));
        String LateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(LateText);
        driver.close();
        

    }

}
