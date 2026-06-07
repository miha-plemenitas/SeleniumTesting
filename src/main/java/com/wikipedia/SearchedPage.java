package com.wikipedia;

import org.openqa.selenium.By;

public class SearchedPage extends HomePage {
    
    private By heading = By.xpath("//h1[@id='firstHeading']");
    
    public String getHeadingText() {
        return find(heading).getText();
    }
}
