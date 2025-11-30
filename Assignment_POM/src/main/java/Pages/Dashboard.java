package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	//Method to click on Logout button
	public void clickLogout() {
		driver.findElement(By.id("submit")).click();
	}
}

