package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.LoginUtil;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class LoginFunctionalities extends TestBase{

    /*
    Test case #1 - verify user login successfully
1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
2. Enter valid username
3. Enter valid password
4. Click login button
5. Verify the URL is showed to homepage’s url
(Put this test case in testBase class with an annotation so it runs for all the test case)

     */
    @BeforeMethod
    public void setUpMethod() {
        super.setUpMethod();
    }

    @Test
    public void Test1() {

        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));
        String expectedUrl = "http://qa.trycloud.net/index.php/apps/files/";


        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser);
            Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
            LoginUtil.LogOut(driver);
        }

    }

    @AfterMethod
    public void tearDownMethod(){
        super.tearDownMethod();
    }
}
