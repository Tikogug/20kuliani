import StepsObject.LogInSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;
public class LogIn  {
    @Test

    public void logInWithIncorrectEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        LogInSteps step1 = new LogInSteps(driver);
        step1.signInBottom();
        step1.emailInput(incorrectEmailData);
        step1.logInBottom();
      Thread.sleep(5000);
      driver.close();


    }
    @Test
    public void logInWithCorrectEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        LogInSteps step2 = new LogInSteps(driver);
        step2.signInBottom();
        step2.emailInput(correctEmailData);
        step2.logInBottom();
        step2.passwordInput(incorrectPasswordData);
        step2.signInSubmit();
        Thread.sleep(5000);
        driver.close();
    }






}
