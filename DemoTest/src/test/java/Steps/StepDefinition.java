package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class StepDefinition extends Base {
    @Given("I am on Login page")
    public void i_am_on_login_page() {

    }

    @And("^I enter the username (.*)$")
    public void i_enter_the_username_user_name(String username) {
        loginPage.enterUsername(username);
    }

    @And("^I enter password (.*)$")
    public void i_enter_password_pass(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","image");
        }
    }

    @After
    public void closeBrowser(){
        driver.quit();

    }
}
