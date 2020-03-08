package com.test.basic;

import com.page.checkboxes.CheckboxesPage;
import com.page.dragAndDrop.DragAndDropPage;
import com.page.mainPage.MainPagePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
    private WebDriver driver;
    private String url = "http://the-internet.herokuapp.com/";

    protected MainPagePage mainPagePage;
    protected CheckboxesPage checkboxesPage;
    protected DragAndDropPage dragAndDropPage;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        mainPagePage = new MainPagePage(driver);
        checkboxesPage = new CheckboxesPage(driver);
        dragAndDropPage = new DragAndDropPage(driver);
    }

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }

    @AfterSuite
    public void afterSuite() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
