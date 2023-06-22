package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class LogInSteps extends LogInPage {
    WebDriver driver ;
    public LogInSteps(WebDriver driver1){

        driver= driver1;
    }
    public void signInBottom(){

        driver.findElement(signInBottom).click();
    }

    public void emailInput(String s){

        driver.findElement(emailField).sendKeys(s);
    }

    public  void passwordInput (String s){

        driver.findElement(passwordField).sendKeys(s);

    }
    public void logInBottom(){
        driver.findElement(loginBottom).click();

    }

public void signInSubmit(){

        driver.findElement(signInSubmit).click();
}

}
