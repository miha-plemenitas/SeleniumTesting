package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import java.lang.invoke.StringConcatFactory;
import java.util.Set;
import static utilities.SwitchToUtility.*;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {

    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }
    
    public void switchToNewWindow() {
        // Get current window "main" window handle
        String currentHandle = driver.getWindowHandle(); // can also add to utils
        System.out.println("Main window ID: " + currentHandle);
        
        // Get all window handels
        Set<String> allHandles = driver.getWindowHandles(); // can also add to utils
        System.out.println("Number of open windows: " + allHandles.size());

        // Switch to the new window, using the window handle
        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st window ID: " + handle);
            } else {
                switchToWindow(handle);
                System.out.println("2nd window ID: " + handle);
            }
        }
    }
}
