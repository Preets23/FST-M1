package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        
       
        WebElement userName = driver.findElement(By.xpath("//input[contains(@class, 'username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        
        
        userName.sendKeys("NewUser");
        password.sendKeys("Password");
        confirmPassword.sendKeys("Password");
        email.sendKeys("123@xyz.com");
   
        WebElement signup=driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
        		signup.click();
        
        Thread.sleep(3000);
        WebElement loginMessage = driver.findElement(By.id("action-confirmation"));
        System.out.println("Login message: " + loginMessage);
        System.out.println(loginMessage.getText());
        
        
        //Close browser
        driver.close();

    }
}