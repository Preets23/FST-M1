package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity6_1 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

       
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement RemoveCheckBox = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        RemoveCheckBox.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        RemoveCheckBox.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        driver.close();

    }

}