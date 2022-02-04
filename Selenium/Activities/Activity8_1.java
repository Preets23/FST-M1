package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		List<WebElement> columns=driver.findElements(By.xpath("//table[contains(@class,'celled')]/tbody/tr[1]/td"));
		System.out.println("Number of columns: "+columns.size());
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class,'celled')]/tbody/tr"));
		System.out.println("Number of rows: "+rows.size());
		
		List<WebElement> thirdrowdata=driver.findElements(By.xpath("//table[contains(@class,'celled')]/tbody/tr[3]/td"));
		for(WebElement cellvalue:thirdrowdata) {
			System.out.println("Thirdrow value "+cellvalue.getText());
		}
		
		WebElement secondrowsecondcol=driver.findElement(By.xpath("//table[contains(@class,'celled')]/tbody/tr[2]/td[2]"));
		
			System.out.println("secondrow second column cell value "+secondrowsecondcol.getText());
			driver.close();
		}
}

