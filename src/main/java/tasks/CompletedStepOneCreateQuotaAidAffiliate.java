package tasks;

import actions.*;
import org.openqa.selenium.WebDriver;
import ui.LoginPageUI;
import ui.StepOneCreateQuotaAidPageUI;

public class CompletedStepOneCreateQuotaAidAffiliate {
    public static void add(WebDriver driver){
        Selected.on(driver,StepOneCreateQuotaAidPageUI.procedureTypeSelect,"Pago Auxilio Mortuorio");
        Selected.on(driver,StepOneCreateQuotaAidPageUI.modalitySelect,"Fallecimiento del (la) titular");

        VisibilityOfElementLocated.on(driver, StepOneCreateQuotaAidPageUI.requirementOneButton);
        Click.on(driver, StepOneCreateQuotaAidPageUI.requirementOneButton);
        VisibilityOfElementLocated.on(driver, StepOneCreateQuotaAidPageUI.requirementTwoButton);
        Click.on(driver, StepOneCreateQuotaAidPageUI.requirementTwoButton);
        MoveToElement.on(driver,StepOneCreateQuotaAidPageUI.requirementThreeButton);
        //VisibilityOfElementLocated.on(driver, StepOneCreateQuotaAidPageUI.requirementThreeButton);
        Click.on(driver, StepOneCreateQuotaAidPageUI.requirementThreeButton);

       /* VisibilityOfElementLocated.on(driver, StepOneCreateQuotaAidPageUI.requirementFourButton);
        Click.on(driver, StepOneCreateQuotaAidPageUI.requirementFourButton);
        VisibilityOfElementLocated.on(driver, StepOneCreateQuotaAidPageUI.requirementFiveButton);
        Click.on(driver, StepOneCreateQuotaAidPageUI.requirementFiveButton);
        VisibilityOfElementLocated.on(driver, StepOneCreateQuotaAidPageUI.requirementSixButton);
        Click.on(driver, StepOneCreateQuotaAidPageUI.requirementSixButton);
        VisibilityOfElementLocated.on(driver, StepOneCreateQuotaAidPageUI.requirementSevenButton);
        Click.on(driver, StepOneCreateQuotaAidPageUI.requirementSevenButton);*/

    }
}
