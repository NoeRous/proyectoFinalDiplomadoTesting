package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.StartPageUI;

public class IsIntoStartPageDisplayed {
    public static boolean isTexPresent(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, StartPageUI.roleText);
    }
}
