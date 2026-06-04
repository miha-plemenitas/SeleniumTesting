package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utilities.JavascriptUtility.clickJS;
import static utilities.JavascriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    
    private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
    
    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenuItem);
        clickJS(selectMenuItem); // clickJS - because normal click is getting blocked by something
        return new SelectMenuPage();
    }
    
    public DatePickerMenuPage clickDatePicker(){
        scrollToElementJS(datePickerMenuItem);
        click(datePickerMenuItem);
        return new DatePickerMenuPage();
    }
}
