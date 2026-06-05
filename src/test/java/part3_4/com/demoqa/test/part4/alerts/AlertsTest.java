package part3_4.com.demoqa.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;
import static utilities.SwitchToUtility.dismissAlert;
import static utilities.SwitchToUtility.setAlertText;

@Test
public class AlertsTest extends BaseTest {
    
    public void testInformationAlert() {
        String expectedAlertTest = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlets();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertTest, "Actual and expected alerts are not equal");
        acceptAlert(); // To perform an action after the alert you need to accept the alert
    }
    
    public void testConfirmationAlert() {
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlets();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        String expectedAlertTest = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult, expectedAlertTest, "You did not select cancel");
    }
    
    public void testPromptAlert() {
        String alertText = "Selenium with Java";
        String expectedResult = "You entered " + alertText;
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlets();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.getPromptAlertResult();
        Assert.assertEquals(actualResult, expectedResult, "Actual and expected results do not match");
    }
}
