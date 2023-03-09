package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveOverElement {
    public static void on (WebDriver driver, By locator){
        Actions actions = new Actions(driver);

        actions.clickAndHold().moveByOffset(0,5000).release().perform();
    }
}
