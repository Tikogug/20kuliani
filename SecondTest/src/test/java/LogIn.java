import StepObject.LogInSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;


import static DataObject.LogInData.*;


public class LogIn  extends ChromeRunner {

@Test
    public void logInWithIncorrectEmail() throws InterruptedException {



    LogInSteps step1 = new LogInSteps(driver);
    step1.signInBottom();
    step1.emailInput(incorrectEmailData);
    step1.logInBottom();
    Thread.sleep(5000);

}
@Test
  public void logInWithCorrectEmail() throws InterruptedException {


    LogInSteps step2= new LogInSteps(driver);
    step2.signInBottom();
    step2.emailInput(correctEmailData);
    step2.logInBottom();
    step2.passwordInput(incorrectPasswordData);
    step2.signInSubmit();
    Thread.sleep(5000);


}


}
