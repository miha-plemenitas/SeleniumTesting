package part3_4.com.demoqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {
    
    @Test
    public void testSelectingDate(){
        String day = "31";
        String month = "December";
        String monthNumber = "12";
        String year = "2034";
        
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);
        
        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "Actual and expected date do not match, Actual: " + actualDate + ", Expected: " + expectedDate);
    }
}
