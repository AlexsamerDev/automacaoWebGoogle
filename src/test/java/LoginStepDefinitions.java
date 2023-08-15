import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {
	private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
    }

    @When("the user enters valid credentials")
    
    public void userEntersValidCredentials() {
        loginPage.enterUsernameAndPassword("yourUsername", "yourPassword");
        loginPage.clickLoginButton();
    }

    @Then("the user is logged in")
    public void userIsLoggedIn() {
        // Verificaçao para confirmar que se o login foi bem sucedido
        driver.quit();
    }
}

