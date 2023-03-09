package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.ShowAffiliatePageUI;

public class IsShowAffiliateDisplayed {
    public static boolean isbuttonPresent(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, ShowAffiliatePageUI.recordButton);
    }
}
