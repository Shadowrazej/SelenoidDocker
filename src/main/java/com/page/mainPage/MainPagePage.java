package com.page.mainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPagePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[text()='Checkboxes']")
    private WebElement checkboxesLink;

    @FindBy(xpath = "//a[text()='Drag and Drop']")
    private WebElement dragAndDropLink;

    public MainPagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    private void clickOnLink(WebElement link) {
        link.click();
    }
    
    public void clickOnCheckboxesLink() {
        clickOnLink(checkboxesLink);
    }

    public void clickOnDragAndDropLink() {
        clickOnLink(dragAndDropLink);
    }
}
