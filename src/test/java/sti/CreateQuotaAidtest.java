package sti;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;

public class CreateQuotaAidtest extends BaseTest{

    String username = "admin";
    String password = "123456";

    @Test(priority = 1)
    public void selectedRoleTest (){
        CompletedFormLogin.add(webDriver,username,password);
        RoleSelected.role(webDriver);
        Assert.assertTrue(IsIntoStartPageDisplayed.isTexPresent(webDriver));
    }

    @Test(priority = 2)
    public void indexAffiliatesTest (){
        CompletedFormLogin.add(webDriver,username,password);
        RoleSelected.role(webDriver);
        IndexAfiliates.index(webDriver);
        Assert.assertTrue(IsIndexAffiliatesDisplayed.isTablePresent(webDriver));
    }

    @Test(priority = 3)
    public void showAffiliateTest (){
        CompletedFormLogin.add(webDriver,username,password);
        RoleSelected.role(webDriver);
        IndexAfiliates.index(webDriver);
        ShowAffiliate.show(webDriver);
        Assert.assertTrue(IsShowAffiliateDisplayed.isbuttonPresent(webDriver));
    }

    @Test(priority = 4)
    public void enterStepsCreateQuotaAidAffiliateTest (){
        CompletedFormLogin.add(webDriver,username,password);
        RoleSelected.role(webDriver);
        IndexAfiliates.index(webDriver);
        ShowAffiliate.show(webDriver);
        EnterStepsCreateQuotaAidAffiliate.enter(webDriver);
        Assert.assertTrue(IsStepOneCreateQuotaAidDisplayed.isSelectPresent(webDriver));
    }

    @Test(priority = 5)
    public void fillStepOneCreateQuotaAidAffiliateTest (){
        CompletedFormLogin.add(webDriver,username,password);
        RoleSelected.role(webDriver);
        IndexAfiliates.index(webDriver);
        ShowAffiliate.show(webDriver);
        EnterStepsCreateQuotaAidAffiliate.enter(webDriver);
        CompletedStepOneCreateQuotaAidAffiliate.add(webDriver);


        //Assert.assertTrue(IsStepOneCreateQuotaAidDisplayed.isSelectPresent(webDriver));
    }
}
