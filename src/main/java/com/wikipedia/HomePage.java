package com.wikipedia;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends BasePage {
    
    private By searchBar = By.id("searchInput");
    
    public SearchedPage goToSearchedPage(String searchText) {
        find(searchBar).sendKeys(searchText, Keys.ENTER);
        return new SearchedPage();
    }
}
