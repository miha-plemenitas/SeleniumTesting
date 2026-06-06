package part3_4.com.demoqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.logging.XMLFormatter;

public class SliderTest extends BaseTest {
    
    @Test
    public void testSlider() {
        int x = 300;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "88";
        Assert.assertEquals(actualValue, expectedValue, "Actual and expected slider values do not match");
    }
}
