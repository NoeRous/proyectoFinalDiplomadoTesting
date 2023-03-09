package tasks;

import actions.Click;
import actions.VisibilityOfElementLocated;
import org.openqa.selenium.WebDriver;
import ui.SelectedRolePageUI;

public class RoleSelected {
    public static void role(WebDriver driver){
        VisibilityOfElementLocated.on(driver, SelectedRolePageUI.selectRoleButton);
        Click.on(driver, SelectedRolePageUI.selectRoleButton);
    }
}
