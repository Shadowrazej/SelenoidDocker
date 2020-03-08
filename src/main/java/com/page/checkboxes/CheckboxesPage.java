package com.page.checkboxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.*;

public class CheckboxesPage {
    private WebDriver driver;

    @FindBy(xpath = "//input")
    private WebElement firstCheckbox;

    @FindBy(xpath = "//input[2]")
    private WebElement secondCheckbox;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    private void clickCheckbox(WebElement checkbox) {
        checkbox.click();
    }

    public void clickFirstCheckbox() {
        clickCheckbox(firstCheckbox);
    }

    public void clickSecondCheckbox() {
        clickCheckbox(secondCheckbox);
    }
}
