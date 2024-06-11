package Locators;

import Automation_Part01.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class LocateByTagName extends BaseDriver {

        @BeforeClass
        public void openURL() {
            driver.get("https://www.facebook.com/");
        }

        @Test
        public void LocateByTagName() throws InterruptedException {
            List<WebElement> tags = driver.findElements(By.tagName("a"));
            System.out.println("Size: "+tags.size());
            System.out.println(tags);
            Thread.sleep(5000);

    }
}

