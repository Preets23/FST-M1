package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@id='single-select']")));
		dropdown.selectByVisibleText("Option 2");
		
		WebElement chosen = driver.findElement(By.id("single-value"));
		System.out.println(chosen.getText());
		
		dropdown.selectByIndex(3);
		System.out.println(chosen.getText());
		
		dropdown.selectByValue("4");
		System.out.println(chosen.getText());
		
		List<WebElement> options = dropdown.getOptions();
		for(WebElement option: options) {
			System.out.println(" Option : "+option.getText());
		}
		
		driver.close();
		
		
}
}
