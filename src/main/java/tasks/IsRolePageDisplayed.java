package tasks;

import actions.Selected;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoginPageUI;
import ui.SelectedRolePageUI;

public class IsRolePageDisplayed {
    public static boolean isTexPresent(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, SelectedRolePageUI.welcomeText);
    }
}
