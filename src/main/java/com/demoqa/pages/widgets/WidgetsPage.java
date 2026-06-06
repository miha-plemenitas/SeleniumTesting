package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utilities.JavascriptUtility.clickJS;
import static utilities.JavascriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    
    private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']//span[text()='Progress Bar']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']//span[text()='Slider']");
    
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
    
    public ProgressBarPage clickProgressBar() {
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }
    
    public SliderPage clickSlider() {
        scrollToElementJS(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderPage();
    }
}
