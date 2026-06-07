package part5.com.wikipedia.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import part5.com.wikipedia.base.BaseTest;

public class SearchTest extends BaseTest {
    
    @Test
    public void testSearch() {
        String searchText = "Didier Drogba";
        var mainPage = homePage.goToSearchedPage(searchText);
        String actualText =  mainPage.getHeadingText();
        String expectedText = "Didier Drogba";
        Assert.assertEquals(actualText, expectedText, "Actual and expected heading texts do not match");
    }
}
