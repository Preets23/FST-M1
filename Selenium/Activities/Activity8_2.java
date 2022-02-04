package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		List<WebElement> columns=driver.findElements(By.xpath("//table[contains(@class,'celled')]/tbody/tr[1]/td"));
		System.out.println("Number of columns: "+columns.size());
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class,'celled')]/tbody/tr"));
		System.out.println("Number of rows: "+rows.size());
		
		WebElement secondrowsecondcol=driver.findElement(By.xpath("//table[contains(@class,'celled')]/tbody/tr[2]/td[2]"));
		System.out.println("secondrow second column cell value before sorting "+secondrowsecondcol.getText());
		
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
		WebElement secondrowsecondcol1=driver.findElement(By.xpath("//table[contains(@class,'celled')]/tbody/tr[2]/td[2]"));
		System.out.println("secondrow second column cell value after sorting "+secondrowsecondcol1.getText());
		WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Table footer values: " + footer.getText());
		
		driver.close();
}
}