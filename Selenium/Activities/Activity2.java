package SeleniumActivities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.training-support.net");
			System.out.println("Title of the page : "+driver.getTitle());
			WebElement aboutusbyid = driver.findElement(By.id("about-link"));
			System.out.println(aboutusbyid.getText());
			WebElement aboutusbyclass = driver.findElement(By.className("green"));
			System.out.println(aboutusbyclass.getText());
			WebElement aboutusbylink = driver.findElement(By.linkText("About Us"));
			System.out.println(aboutusbylink.getText());
			WebElement aboutusbycss = driver.findElement(By.cssSelector(".green"));
			System.out.println(aboutusbycss.getText());
			driver.close();
			
			}

		}


