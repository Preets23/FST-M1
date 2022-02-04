package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait=new WebDriverWait(driver,10);
 
        driver.get("https://www.training-support.net/selenium/javascript-alerts");    
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
    	
        wait.until(ExpectedConditions.alertIsPresent());
        
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Yes, you are!");
        alert.accept();
        //alert.dismiss();
        driver.close();
        
		}
}
