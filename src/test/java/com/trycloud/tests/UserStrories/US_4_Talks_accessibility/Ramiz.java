package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ramiz extends TestBase {

    @BeforeMethod
    public void setupMethod(){
        super.setUpMethod();
    }


    @Test(description="Test case #1 - verify users can access to Talks module")
    public void accessToTalksModule(){

        //1. Login as a user
        LoginUtil.Login(driver,"userName1","password");

        //2. Click Talks module
        WebElement talkModule = driver.findElement(By.xpath("(//a[@aria-label='Talk'])[1]"));
        talkModule.click();

        //3. Verify the page tile is Talks module’s tile
        WebElement currentTile = driver.findElement(By.xpath("(//a[@aria-label='Talk'])[1]"));
        Assert.assertTrue(currentTile.isDisplayed());
    }

    @Test
    public void sendMessage(){
        //1. Login as a user
        LoginUtil.Login(driver,"userName1","password");

        //2. Click Talks module
        WebElement talkModule = driver.findElement(By.xpath("(//a[@aria-label='Talk'])[1]"));
        talkModule.click();

        //3. Search a user from search box on the left

        //4. Write a message
        //5. Click submit button
        //6. Verify the message is displayed on the conversation log
    }


    @AfterMethod
    public void tearDown(){
        super.tearDownMethod();
    }


}
