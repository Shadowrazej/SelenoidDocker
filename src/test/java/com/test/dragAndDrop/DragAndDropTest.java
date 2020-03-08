package com.test.dragAndDrop;

import com.test.basic.TestBase;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase {
    @Test
    public void dragAndDrop() {
        mainPagePage.clickOnDragAndDropLink();
        dragAndDropPage.dragAndDropItem();
    }
}
