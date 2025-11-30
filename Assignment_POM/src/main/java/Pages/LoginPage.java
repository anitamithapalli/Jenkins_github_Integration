package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
          this.driver = driver;
	}		
	//Method to enter username 
	public void enterUsername(String user) {
		driver.findElement(By.id("userName")).sendKeys(user);;
		}
	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}	
	//Method to click on Login button
	public void clickLogin() {
		WebElement loginBtn = driver.findElement(By.id("login"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginBtn);
		loginBtn.click();
	}
}