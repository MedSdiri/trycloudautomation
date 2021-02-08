package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.tests.PageComponents.HeaderLeft;
import com.trycloud.tests.base.HomePage;
import com.trycloud.utilities.LoginUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_4_Test extends HomePage {


    @BeforeMethod
    public void setUp() {
        super.setUpMethod();
    }

    @Test(description = "US4-Test case #1 - verify users can access to Talks module")
    public void US4_accessToTalkModule() {


        LoginUtil.Login(driver, "userName2", "password");   //login

        HeaderLeft.headerLeftMenu("spreed").click(); //go to talks module

        Assert.assertEquals(driver.getTitle(), "Talk - Trycloud QA", "Current page title is not match with expected result.FAILED!!!"); //verify the title
        LoginUtil.LogOut(driver); // close the driver

 /*
      LoginUtil.Login(driver,"userName2","password");
        Navigator talkModuleVerification = new Navigator(driver);
        talkModuleVerification.talksModule.click();

       String expectedTitle ="Talk - Trycloud QA";
        Assert.assertEquals(talkModuleVerification.title(),expectedTitle,"Current page title is not match with expected result.FAILED!!!");
        LoginUtil.LogOut(driver);
      */
    }

    @Test(description = "US4-Test case #2 - verify users can send message")
    public void sendMessage() {
        LoginUtil.Login(driver, "userName3", "password");
        Navigator sendMessageFunction = new Navigator(driver);
        HeaderLeft.headerLeftMenu("spreed").click();

        sendMessageFunction.sendMessage("Employee100");

    }

}
