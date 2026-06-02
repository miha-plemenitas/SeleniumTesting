package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {
    
    private By productsHeader = By.xpath("//span[text()='Products']");
    
    public boolean getProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}    