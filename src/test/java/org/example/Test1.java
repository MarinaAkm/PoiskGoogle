package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 extends WebdriverSettings {
    @Test
    public void Setup() {
        driver.get("https://google.com/");
        driver.findElement(By.cssSelector("[class=\"gLFyf gsfi\"]")).sendKeys( "Поиск \n" );
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until( ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"LC20lb DKV0Md\"]")));


    }


}
