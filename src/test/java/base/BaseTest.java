package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected WebDriver webDriver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("https://pvtbeprueba.muserpol.gob.bo/");
    }

   /* @AfterMethod
    public void tearDown(){
        if(webDriver != null)
          webDriver.quit();
    }*/
}
