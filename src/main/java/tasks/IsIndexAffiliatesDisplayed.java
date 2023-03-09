package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.IndexAffiliatesPageUI;

public class IsIndexAffiliatesDisplayed {
    public static boolean isTablePresent(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, IndexAffiliatesPageUI.indexTable);

    }
}
