package com.page.dragAndDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@id='column-a']")
    private WebElement aColumn;

    @FindBy(xpath = "//div[@id='column-b']")
    private WebElement bColumn;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void dragAndDropItem() {
        dragAndDrop(aColumn, bColumn);
    }

    private void dragAndDrop(WebElement a, WebElement b) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(a, b).build().perform();
    }
}
