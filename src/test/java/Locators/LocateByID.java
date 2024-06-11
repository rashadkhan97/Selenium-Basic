package Locators;

import Automation_Part01.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocateByID extends BaseDriver {


    @BeforeClass
    public void openURL(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
    }

    @Test
    public void LocateByID() throws InterruptedException {
        WebElement Login_email = driver.findElement(By.id("email"));
        Login_email.sendKeys("rsrashad99@gmail.com");
        Thread.sleep(5000);
    }

    @Test
    public void LocateByPasswordId() throws InterruptedException {
        WebElement Id_password = driver.findElement(By.id("password"));
        Id_password.sendKeys("rsrashad99@gmail.com");
        Thread.sleep(5000);
    }

}
