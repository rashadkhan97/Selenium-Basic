package Locators;

import Automation_Part01.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocateByCssSelector extends BaseDriver{

    @BeforeClass
    public void openURL() {
        driver.get("https://www.daraz.com.bd/");
    }

    @Test
    public void locateByCss() throws InterruptedException {
        WebElement button = driver.findElement(By.cssSelector("a.bld-txt"));
        button.click();
        Thread.sleep(5000);
    }


}