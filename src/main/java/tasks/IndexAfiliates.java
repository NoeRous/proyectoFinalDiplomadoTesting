package tasks;

import actions.Click;
import actions.VisibilityOfElementLocated;
import org.openqa.selenium.WebDriver;
import ui.SelectedRolePageUI;
import ui.StartPageUI;

public class IndexAfiliates {
    public static void index(WebDriver driver){
        VisibilityOfElementLocated.on(driver, StartPageUI.indexAfiliatesButton);
        Click.on(driver, StartPageUI.indexAfiliatesButton);
    }
}
