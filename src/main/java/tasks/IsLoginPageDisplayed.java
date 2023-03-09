package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoginPageUI;

public class IsLoginPageDisplayed {

    public static boolean isbuttonPresent(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, LoginPageUI.enterButton);
    }
}


