package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {
    
    private By modelDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    
    public ModelDialogsPage clickModelDialogs () {
        scrollToElementJS(modelDialogsMenuItem);
        click(modelDialogsMenuItem);
        return new ModelDialogsPage();
    }
}
