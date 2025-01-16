package com.demoqa.pages;

import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By alertsCard = By.xpath("//div[@id='app']//h5[text()='Alerts, Frame & Windows']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By interactionsCard = By.xpath("//div[@id='app']//h5[text()='Interactions']");
    private By bookstoreCard = By.xpath("//div[@id='app']//h5[text()='Book Store Application']");



    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();

    }

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();

    }
}
