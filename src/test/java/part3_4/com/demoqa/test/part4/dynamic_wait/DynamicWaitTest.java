package part3_4.com.demoqa.test.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DynamicWaitTest extends BaseTest {
    
    @Test
    public void testVisibleAfterButtonText () {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText, "Actual and expected button text do not match");
    }
    
    @Test
    public  void testProgressBar(){
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue(); // The return of the method is string so we assign it to string
        String expectedValue = "100%";
        Assert.assertEquals(actualValue, expectedValue, "Actual and expected progress values do not match");
    }
}
