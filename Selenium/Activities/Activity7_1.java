package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {
	 public static void main(String[] args) {

	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver, 10);

	        //Open the browser
	        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
	        String title= driver.getTitle();
	        System.out.println("Title of the page: "+title);
	        WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
	        WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
	    
	        userName.sendKeys("admin");
	        password.sendKeys("password");
	        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
	        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	        System.out.println("Login message: " + loginMessage);
	        driver.close();
	       }
}