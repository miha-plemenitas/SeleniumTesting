package part3_4.com.demoqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {
    
    @Test
    public void testWebTable(){
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit("alden@example.com");
        webTablePage.setAge("34");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge("alden@example.com");
        String expectedAge = "34";
        Assert.assertEquals(actualAge, expectedAge, "Actual and expected age do not match");
    }
    
}
