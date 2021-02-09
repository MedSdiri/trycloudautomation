package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.tests.PageComponents.HeaderLeft;
import com.trycloud.tests.base.HomePage;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

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

    }

    @Test(description = "US4-Test case #2 - verify users can send message")
    public void sendMessage() {
        LoginUtil.Login(driver, "userName4", "password");
        Navigator sendMessageFunction = new Navigator(driver);
        HeaderLeft.headerLeftMenu("spreed").click();

        sendMessageFunction.sendMessage("user97");

        String expectedMessage = "Test1234";
        sendMessageFunction.messageBoxInput.sendKeys(expectedMessage);
        sendMessageFunction.messageSummitButton.click();

        List<String> actualMessage = new ArrayList<>();
        for (WebElement each : sendMessageFunction.conversationMessageBox)
            actualMessage.add(each.getText());

        for (String each : actualMessage) {
            Assert.assertTrue(each.contains(expectedMessage), "Expected mesage not contains in the actual message list.Failed!!!");
        }
        LoginUtil.LogOut(driver);
    }

}
