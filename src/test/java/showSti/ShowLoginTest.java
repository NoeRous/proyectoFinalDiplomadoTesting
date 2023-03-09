package showSti;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.IsLoginPageDisplayed;

public class ShowLoginTest extends BaseTest {
    @Test ( priority = 1 )
    public void testSearchGoogle() {
        Assert.assertTrue(IsLoginPageDisplayed.isbuttonPresent(webDriver));
    }
}
