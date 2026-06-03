package com.demoqa.pages;

import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='root']//h5[text()='Forms']");
    private By elementCard = By.xpath("//div[@id='root']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='root']//h5[text()='Widgets']");
    
    public FormsPage goToForms () {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    } 
    
    public ElementsPage goToElements () {
        scrollToElementJS(elementCard);
        click(elementCard);
        return new ElementsPage();
    }
    
    public WidgetsPage goToWidgets () {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }
}
