package tasks;
import actions.Click;
import actions.VisibilityOfElementLocated;
import org.openqa.selenium.WebDriver;
import ui.LoginPageUI;
import actions.Enter;

public class CompletedFormLogin {
    public static void add(WebDriver driver, String username, String password){
        VisibilityOfElementLocated.on(driver, LoginPageUI.usernameInput);
        Enter.text(driver, LoginPageUI.usernameInput, username);
        Enter.text(driver, LoginPageUI.passwordInput, password);
        Click.on(driver, LoginPageUI.enterButton);
    }

}
