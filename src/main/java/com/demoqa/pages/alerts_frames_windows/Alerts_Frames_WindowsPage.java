package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {
    
    private By modelDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");
    
    
    public ModelDialogsPage clickModelDialogs () {
        scrollToElementJS(modelDialogsMenuItem);
        click(modelDialogsMenuItem);
        return new ModelDialogsPage();
    }
    
    public AlertsPage clickAlets() {
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }
    
    public FramesPage clickFrames() {
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }
}
