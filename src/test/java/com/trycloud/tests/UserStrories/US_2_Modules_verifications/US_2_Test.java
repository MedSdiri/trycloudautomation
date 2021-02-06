package com.trycloud.tests.UserStrories.US_2_Modules_verifications;

import com.trycloud.tests.base.HomePage;
import com.trycloud.utilities.LoginUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class US_2_Test extends HomePage {

    @BeforeMethod
    public void setUpMethod() {
        super.setUpMethod();

    }

    @Test
    public void test(){
       for (String eachUser: userNames) {
            LoginUtil.Login(driver, eachUser, "password");
           System.out.println(eachUser+" test is running: !!");
            for (String eachMenu: HomePage.listOfMenus) {
                System.out.println(eachMenu);
                Assert.assertTrue(getMenu(eachMenu).isDisplayed(), eachMenu+" was not found !!!!!!!!!!!!!!!!");
            }
            LoginUtil.LogOut(driver);
           System.err.println("Passed !!!!!!!!");
           System.out.println("++++++++++++++");
           
         
        }
    }
    @AfterMethod
    public void tearDownMethod() {
        super.tearDownMethod();
    }


}
