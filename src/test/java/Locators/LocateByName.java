package Locators;

import Automation_Part01.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocateByName extends BaseDriver {

    @BeforeClass
    public void openURL(){
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void LocateByName() throws InterruptedException {
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Md.Rashadul Islam Rabbi");
        Thread.sleep(5000);
    }
}
