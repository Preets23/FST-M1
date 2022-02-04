package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		String thirdheader= driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("Third Header is:  "+thirdheader);

		String fifthheader= driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
		System.out.println("Fifth Header's color  is:  "+fifthheader);
		
		String VioletButton= driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
		System.out.println("VioletButton's classes are:  "+VioletButton);
		
		String GreyButton= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println(" GreyButton text is:  "+GreyButton);
		
	}
}
