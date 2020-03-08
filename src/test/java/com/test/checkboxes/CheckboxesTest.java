package com.test.checkboxes;

import com.test.basic.TestBase;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase {
    @Test
    public void markFirstCheckbox() {
        mainPagePage.clickOnCheckboxesLink();
        checkboxesPage.clickFirstCheckbox();
    }

    @Test
    public void markSecondCheckbox() {
        mainPagePage.clickOnCheckboxesLink();
        checkboxesPage.clickSecondCheckbox();
    }
}
