package com.trycloud.tests.base;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    public static WebDriver driver;
    //List of Users
    //public static ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));

    public void setUpMethod(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.get(ConfigurationReader.getProperty("environment"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //driver close
    public void tearDownMethod(){
        BrowserUtils.sleep(3);
        driver.close();
    }


    
}
