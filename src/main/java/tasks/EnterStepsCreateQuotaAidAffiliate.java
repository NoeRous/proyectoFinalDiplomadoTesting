package tasks;

import actions.Click;
import actions.VisibilityOfElementLocated;
import org.openqa.selenium.WebDriver;
import ui.IndexAffiliatesPageUI;
import ui.ShowAffiliatePageUI;
import ui.StartPageUI;

public class EnterStepsCreateQuotaAidAffiliate {
    public static void enter(WebDriver driver){
        VisibilityOfElementLocated.on(driver, ShowAffiliatePageUI.createQuotaAidButton);
        Click.on(driver, ShowAffiliatePageUI.createQuotaAidButton);
    }

}
