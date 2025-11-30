package TestCasesPOM;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.Dashboard;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTestCasePage_POMAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/books");
				driver.manage().window().maximize();
				
				HomePage home = new HomePage(driver);
				
				LoginPage login = new LoginPage(driver);
				
				Dashboard dashboard = new Dashboard(driver);
				
				//Click on Login button
				home.clickLogin();
				
				//Enter username & password
				login.enterUsername("anita");
				login.enterPassword("Anita@123");
				
				//Click on login button
				login.clickLogin();
				System.out.println("Login Succesful!!");
				Thread.sleep(5000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0, 100)");
		        
				TakesScreenshot ts = (TakesScreenshot) driver;
				File srcfile = ts.getScreenshotAs(OutputType.FILE);
				File destfile = new File("E:\\AfterLoginPage\\screenshot_login.jpg");
				FileUtils.copyFile(srcfile, destfile);
								
				//Click on Logout button
				dashboard.clickLogout();
                driver.quit();
			}
}
