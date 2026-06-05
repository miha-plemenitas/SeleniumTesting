package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{
    
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='root']//h1[text()='Frames']");
    
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']//iframe");

    private void switchToBigBox() {
        switchToFrameString(iFrameBigBox);
    }
    
    private void switchToSmallBox() {
        // switchToFrameIndex(1); // switching frames using index
        switchToFrameElement(find(iFrameSmallBox)); // switching frames using WebElement
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big frame test: " + bigFrameText);
        switchToDefaultContent(); // to switch out of the iframe, in this case to get the header
        return bigFrameText;
    }
    
    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }
    
    public String getTextInSmallFrame() {
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small frame test: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
