package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.tests.PageComponents.HeaderLeft;
import com.trycloud.tests.base.HomePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class US_4_Test extends HomePage {
    Navigator talk = new Navigator();

    @BeforeMethod
    public void setUp() {
       setUpMethod();
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
        LoginUtil.Login(Driver.getDriver(), "userName4", "password");
        String userName = "User84";

        HeaderLeft.headerLeftMenu("spreed").click();

        BrowserUtils.sleep(2);
        talk.searchInputBox.sendKeys(userName);

        for (WebElement eachUser : talk.searchResult) {
            if(eachUser.getText().contains(userName)){
                eachUser.click();
            }
        }

        talk.messageBoxInput.sendKeys("Hello World");
        talk.messageSummitButton.click();

        List<String> actualMessage = new ArrayList<>();
        for (WebElement each : talk.conversationMessageBox)
            actualMessage.add(each.getText());

        for (String each : actualMessage) {
            Assert.assertTrue(each.contains("Hello World"), "Expected mesage not contains in the actual message list.Failed!!!");
        }
        LoginUtil.LogOut(driver);
    }

}
