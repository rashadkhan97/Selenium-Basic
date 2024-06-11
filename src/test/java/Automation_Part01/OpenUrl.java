package Automation_Part01;

import org.testng.annotations.Test;

public class OpenUrl  extends BaseDriver{

    @Test
    public void open() throws InterruptedException {
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);

    }


}
