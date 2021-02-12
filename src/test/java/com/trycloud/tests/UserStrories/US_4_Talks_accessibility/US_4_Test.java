package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.tests.PageComponents.HeaderLeft;
import com.trycloud.tests.base.HomePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_4_Test extends HomePage {


    @BeforeMethod
    public void setUpMethod() {
        super.setUpMethod();
    }

    @AfterMethod
    public void tearDown() {
        super.tearDownMethod();
    }

    @Test(description = "US4-Test case #1 - verify users can access to Talks module")
    public void US4_accessToTalkModule() {

        LoginUtil.Login(driver, "userName2", "password");   //login

        HeaderLeft.headerLeftMenu("spreed").click(); //go to talks module

        Assert.assertEquals(driver.getTitle(), "Talk - Trycloud QA", "Current page title is not match with expected result.FAILED!!!"); //verify the title
        LoginUtil.LogOut(driver); // close the driver

    }

    @Test(description = "US4-Test case #2 - verify users can send message")
    public void sendMessage_via_talks_module(){

// create String of userName and message
        String userName = "Mike India";
        String message = "Hello India";

        //login to page
        LoginUtil.Login(driver, "userName4", "password");
        Talks talk = new Talks();

//click to talks module
        HeaderLeft.headerLeftMenu("spreed").click();
        for (WebElement eachUser : talk.conversationList) {
            BrowserUtils.sleep(1);
            if(eachUser.getText().contains(userName)){
                eachUser.click();
            }else {

//click to create a new group conversation
        talk.plusButton.click();
        talk.conversationNameBox.sendKeys(userName);
        talk.participantsButton.click();
        talk.searchParticipantsBox.sendKeys(userName);
        for(WebElement eachResult: talk.users){
            if(eachResult.getText().equalsIgnoreCase(userName))
                eachResult.click();
        }
        talk.createConversationButton.click();
            }
        }

//send a message to user
        talk.messageBoxInput.sendKeys(message);
        BrowserUtils.sleep(1);
        talk.messageSummitButton.click();

//verify the message show on the conversation box
        for (WebElement each : talk.conversationMessageBox)
            Assert.assertTrue(each.getText().contains(message), "Expected message not contains in the actual message list.Failed!!!");

//safety logOut the page
        LoginUtil.LogOut(driver);


    }

}
