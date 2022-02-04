package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String title=driver.getTitle();
		System.out.println(title);
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		Firstname.sendKeys("Name1");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		Lastname.sendKeys("Name2");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("abc@com");
		
		WebElement contact = driver.findElement(By.xpath("//input[@id='number']"));
		contact.sendKeys("999999999");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Form filled");
		driver.close();
	
	}

}
