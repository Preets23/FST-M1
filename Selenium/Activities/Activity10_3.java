package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {
	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait=new WebDriverWait(driver,10);
        
        driver.get("https://training-support.net/selenium/drag-drop");
        String title=driver.getTitle();
        System.out.println("Title of the page= "+title);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
        
        WebElement ball=driver.findElement(By.xpath("//img[@id='draggable']"));
        WebElement drop1=driver.findElement(By.xpath("//div[@id='droppable']"));
        WebElement drop2=driver.findElement(By.xpath("//div[@id='dropzone2']"));
        
        Actions draganddrop=new Actions(driver);
        draganddrop.dragAndDrop(ball, drop1).build().perform();
        
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1,"background-color"));
        System.out.println("Now in DropZone1");
        
       
        draganddrop.dragAndDrop(ball,drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1,"background-color"));
        System.out.println("Now in DropZone2");
        driver.close();
}
}