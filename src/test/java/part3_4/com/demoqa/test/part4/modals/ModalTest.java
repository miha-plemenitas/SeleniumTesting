package part3_4.com.demoqa.test.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {
    
    @Test
    private void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogPage = afwPage.clickModelDialogs();
        modalDialogPage.clickSmallModalButton();
        String actualText = modalDialogPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"), "Actual text does not contain small modal");
        modalDialogPage.clickCloseButton();
    }
}
