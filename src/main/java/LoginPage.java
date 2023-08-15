import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	    private WebDriver driver;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void navigateToLoginPage() {
	        driver.get("https://www.demoblaze.com/login.html");
	    }

	    public void enterUsernameAndPassword(String username, String password) {
	        driver.findElement(By.id("loginusername")).sendKeys(username);
	        driver.findElement(By.id("loginpassword")).sendKeys(password);
	    }

	    public void clickLoginButton() {
	        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	    }
	}

