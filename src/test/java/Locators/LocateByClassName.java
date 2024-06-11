package Locators;

import Automation_Part01.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocateByClassName extends BaseDriver {

    @BeforeClass
    public void OpenUrl(){
        driver.get("https://www.daraz.com.bd/");
    }

    @Test
    public void LocateByClassName () throws InterruptedException {
        WebElement button = driver.findElement(By.className("bld-txt"));
        button.click();
        Thread.sleep(5000);
    }
}
