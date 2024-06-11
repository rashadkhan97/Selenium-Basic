package Locators;

import Automation_Part01.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocateByLink extends BaseDriver {

    @BeforeClass
    public void openURL(){

        driver.get("https://www.facebook.com/");
    }

    @Test
    public void LocateByLink() throws InterruptedException {
        WebElement Forget_Password = driver.findElement(By.linkText("Forgotten password?"));
        Forget_Password.click();
        Thread.sleep(5000);
    }
}
