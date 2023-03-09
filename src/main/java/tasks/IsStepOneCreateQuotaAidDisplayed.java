package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.ShowAffiliatePageUI;
import ui.StepOneCreateQuotaAidPageUI;

public class IsStepOneCreateQuotaAidDisplayed {
    public static boolean isSelectPresent(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, StepOneCreateQuotaAidPageUI.procedureTypeSelect);
    }
}
