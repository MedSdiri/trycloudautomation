package com.trycloud.tests.UserStrories.US_2_Modules_verifications;

import com.trycloud.tests.PageComponents.AppSettings;
import com.trycloud.tests.PageComponents.HeaderLeft;
import com.trycloud.tests.base.HomePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.LoginUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class US_2_Test extends HomePage {

    @BeforeMethod
    public void setUpMethod() {
        super.setUpMethod();
    }


    @Test
    public void test() {
         for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "password");
            System.out.println("***********************");
            System.out.println("Test using: " + ConfigurationReader.getProperty(eachUser) + " is running: !!");
            for (String eachMenu : HomePage.listOfMenus) {
                System.out.println("--- Looking for: "+eachMenu);
                System.out.println(eachMenu + " ---  Found");
                Assert.assertTrue(HeaderLeft.headerLeftMenu(eachMenu).isDisplayed(), eachMenu + " was not found !!!!!!!!!!!!!!!!");
            }
            LoginUtil.LogOut(driver);
            System.err.println("+++++++!! Pass !!++++++");
            System.out.println("***********************");
        }
        System.err.println("**** -Test Passed- **** ");

    }

    @Test
    public void findinBy(){

    }

    @AfterMethod
    public void tearDownMethod() {
        //super.tearDownMethod();
    }


}
