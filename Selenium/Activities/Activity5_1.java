package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/selenium/dynamic-controls");
	String title = driver.getTitle();
	System.out.println("Title of the page: "+title);
	
	boolean checkbox= driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
	System.out.println("Is checkbox enabled" + checkbox);
	
	driver.findElement(By.id("toggleCheckbox")).click();
	 
    System.out.println("The checkbox Input is displayed: " + checkbox);

    //Close the browser
    driver.close();

}



}

