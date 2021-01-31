package com.trycloud.tests.UserStrories.US_1_Login_feature;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.*;



public class Main_Test extends TestBase {

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

    @Test (description="valid test")
    public void validTest() {

        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));
        String expectedUrl = "http://qa.trycloud.net/index.php/apps/files/";


        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "password");
            Assert.assertEquals(driver.getCurrentUrl(),expectedUrl );
            LoginUtil.LogOut(driver);
        }
    }

    @Test (description="inValid test")
    public void inValidTest() {
        ArrayList<String> userNames1 = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));
        // String expectedUrl = "http://qa.trycloud.net/index.php/login?clear=1";
        String expectedTitle = "Trycloud - QA";
        String expectedMessage = "Wrong username or password.";


        for (String eachUser : userNames1) {
            LoginUtil.Login(driver, eachUser, "invalidPassword");
            //String expectedUrl = "http://qa.trycloud.net/index.php/login?clear=" + ConfigurationReader.getProperty(eachUser);
            //Assert.assertEquals(expectedUrl, driver.getCurrentUrl());

            Assert.assertEquals(expectedMessage, driver.findElement(By.xpath("//p[@class='warning wrongPasswordMsg']")).getText());
            Assert.assertEquals(expectedTitle, driver.getTitle());
            LoginUtil.inputClear(driver);
        }
    }

    @Test
    public void tempTest() {
        LoginUtil.Login(driver, "userName1", "password");
    }

    @AfterMethod
    public void tearDownMethod() {
        super.tearDownMethod();
    }
}
