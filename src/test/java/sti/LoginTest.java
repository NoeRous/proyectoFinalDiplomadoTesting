package sti;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;

public class LoginTest extends BaseTest {
    String username = "admin";
    String password = "123456";
    @Test(priority = 1)
    public void completedFormLogin (){
        CompletedFormLogin.add(webDriver,username,password);
        Assert.assertTrue(IsRolePageDisplayed.isTexPresent(webDriver));
    }
}
