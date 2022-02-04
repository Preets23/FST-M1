package SeleniumActivities;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions action=new Actions(driver);
        String pressedkeytext;
        driver.get("https://www.training-support.net/selenium/input-events");
        String title=driver.getTitle();
        System.out.println("Title of the page= "+title);
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        
        
        Action action1=action.sendKeys("P").build();
        action1.perform();
        System.out.println(pressedKey.getText());

        
        Action action2=action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        action2.perform();
        pressedkeytext=pressedKey.getText();
        System.out.println(pressedkeytext);
        driver.close();
	}
}