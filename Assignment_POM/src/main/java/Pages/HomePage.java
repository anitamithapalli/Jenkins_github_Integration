package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
		WebDriver driver;
		
		//Constructor that will be automatically called as soon as the object of the class is created
		public HomePage(WebDriver driver) {
			this.driver=driver;
		}
	
		//Method to click login button
		public void clickLogin() {
			driver.findElement(By.id("login")).click();
		}
	}
