package com.trycloud.tests.PageComponents;
import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppSettings extends TestBase {
    //public WebDriver driver;
    public static WebElement settings(){
        return driver.findElement(By.xpath("//*[@id='app-settings']"));
    }

}
