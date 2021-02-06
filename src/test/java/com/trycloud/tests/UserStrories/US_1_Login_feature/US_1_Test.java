package com.trycloud.tests.UserStrories.US_1_Login_feature;

import com.trycloud.tests.base.HomePage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.*;



public class US_1_Test extends HomePage {

    /*
    Test case #1 - verify user login successfully
1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
2. Enter valid username
3. Enter valid password
4. Click login button
5. Verify the URL is showed to homepage’s url
(Put this test case in testBase class with an annotation so it runs for all the test case)
 hello
     */
    @BeforeMethod
    public void setUpMethod() {
        super.setUpMethod();
    }


    @Test (description="valid test")
    public void validTest() {

        String expectedUrl = "http://qa3.trycloud.net/index.php/apps/dashboard/";


        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "password");
            BrowserUtils.sleep(2);
            Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
            LoginUtil.LogOut(driver);
        }
    }

    @Test (description="inValid test")
    public void inValidTest() {

        String expectedTitle = "Trycloud QA";
        String expectedMessage = "Wrong username or password.";


        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "invalidPassword");

            Assert.assertEquals(expectedMessage, driver.findElement(By.xpath("//p[@class='warning wrongPasswordMsg']")).getText());
            Assert.assertEquals(driver.getTitle(), expectedTitle);
            LoginUtil.inputClear(driver);
        }
    }

     @AfterMethod
    public void tearDownMethod() {
        super.tearDownMethod();
    }


}
