package tasks;

import actions.Click;
import actions.VisibilityOfElementLocated;
import org.openqa.selenium.WebDriver;
import ui.IndexAffiliatesPageUI;

public class ShowAffiliate {
    public static void show(WebDriver driver){
        VisibilityOfElementLocated.on(driver, IndexAffiliatesPageUI.showAffiliateButton);
        Click.on(driver, IndexAffiliatesPageUI.showAffiliateButton);
    }
}
