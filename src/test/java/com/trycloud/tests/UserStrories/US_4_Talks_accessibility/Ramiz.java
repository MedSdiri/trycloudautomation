package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.trycloud.utilities.BrowserUtils;
import org.testng.asserts.SoftAssert;


public class Ramiz extends TestBase {

    @BeforeMethod
    public void setupMethod() {
        super.setUpMethod();
    }

    @Test(description = "US4-Test case #1 - verify users can access to Talks module")
    public void accessToTalksModule() {

        //1. Login as a user
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));
        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "password");

            //2. Click Talks module
            WebElement talkModule = driver.findElement(By.xpath("(//a[@aria-label='Talk'])[1]"));
            talkModule.click();

            //3. Verify the page tile is Talks module’s tile
            WebElement currentTile = driver.findElement(By.xpath("(//a[@aria-label='Talk'])[1]"));
            Assert.assertTrue(currentTile.isDisplayed());
            LoginUtil.LogOut(driver);
        }
    }

    @Test(description = "US4-Test case #2 - verify users can send message")
    public void sendMessage() {
        //1. Login as a user
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));
        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "password");

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            //2. Click Talks module
            WebElement talkModule = driver.findElement(By.xpath("(//a[@aria-label='Talk'])[1]"));
            talkModule.click();

            //3. Search a user from search box on the left
            WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search conversations or users']"));
            searchBox.sendKeys("employee100");
            WebElement employee100 = driver.findElement(By.xpath("(//span[@class='acli__content__line-one__title'])[1]"));
            employee100.click();

            //4. Write a message
            WebElement messageBox = driver.findElement(By.xpath("//div[@role='textbox']"));
            String message = "hello mello yellow";
            messageBox.sendKeys(message);
            BrowserUtils.sleep(3);
            //5. Click submit button
            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
            submitButton.click();
            BrowserUtils.sleep(5);
            //6. Verify the message is displayed on the conversation log
            String actualMessage = driver.findElement(By.xpath("(//div[@class='messages'])[2]")).getText();
            Assert.assertTrue(actualMessage.contains(message));
            LoginUtil.LogOut(driver);
        }
    }

    @Test(description = "US3-Test case #10 - verify users see the app storage usage")
    public void app_storage_usage() {
        //1. Login as a user
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));

        SoftAssert a = new SoftAssert();
        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "password");


            // 2.Check the current storage usage
            WebElement fileModule = driver.findElement(By.xpath("(//li[@data-id='files'])[1]"));
            fileModule.click();
            WebElement storageUsage = driver.findElement(By.id("quota"));
            String beforeUpload = storageUsage.getText();


            // Actions action = new Actions(driver);
            // 3.Upload a file
            WebElement uploadButton = driver.findElement(By.xpath("//span[@class='icon icon-add']"));
            uploadButton.click();

            String path = "C:\\Users\\ramizDesktop\\uploadFile.txt" ;

            WebElement uploadFile = driver.findElement(By.xpath("//label[@for='file_upload_start']"));
            uploadFile.sendKeys(path);
            BrowserUtils.sleep(10);

            // action.moveToElement(uploadButton1).sendKeys(path).perform();

            // 4.Refresh the page
            driver.navigate().refresh();

            // 5.Verify the storage usage is increased
            String afterUpload = driver.findElement(By.id("quota")).getText();

            a.assertFalse(beforeUpload.equals(afterUpload), "Driver can not upload the file. Before Upload: "+beforeUpload+"  After Upload: "+afterUpload+" FAILED!!!");


            LoginUtil.LogOut(driver);
        }
        a.assertAll();
    }

    @Test(description = "US3-Test case #9 - verify users can change the app Settings")
    public void setting_functionality() {
        // 1.Login as a user
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));
        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "password");

            //go to in File module
            WebElement fileModule = driver.findElement(By.xpath("(//li[@data-id='files'])[1]"));
            fileModule.click();


            // 2.Click Settings on the left bottom corner
            WebElement settingButton = driver.findElement(By.className("settings-button"));
            settingButton.click();


            // 3.Verify user can click any buttons.
            WebElement checkbox1 = driver.findElement(By.xpath("//label[@for='showRichWorkspacesToggle']"));
            WebElement checkbox2 = driver.findElement(By.xpath("//label[@for='recommendationsEnabledToggle']"));
            WebElement checkbox3 = driver.findElement(By.xpath("//label[@for='showhiddenfilesToggle']"));

            checkbox1.click();
            Assert.assertFalse(checkbox1.isSelected());
            BrowserUtils.sleep(1);


            checkbox2.click();
            Assert.assertFalse(checkbox2.isSelected());
            BrowserUtils.sleep(1);


            checkbox3.click();
            Assert.assertFalse(checkbox3.isSelected());
            BrowserUtils.sleep(1);


            Assert.assertTrue(checkbox1.isEnabled());
            Assert.assertTrue(checkbox2.isEnabled());
            Assert.assertTrue(checkbox3.isEnabled());


            LoginUtil.LogOut(driver);
        }

    }

    @Test(description = "US3-Test case #8b - verify users can write comments to files/folders.")
    public void commentToFilesOrFolder() {

        // 1.Login as a user
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));
        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "password");

            //go to in File module
            WebElement fileModule = driver.findElement(By.xpath("(//li[@data-id='files'])[1]"));
            fileModule.click();


            //2. Click action-icon from any file on the page

            WebElement actionIcon = driver.findElement(By.xpath("//a[@class='action action-menu permanent']"));
            actionIcon.click();
            //3. Click details
            WebElement detailsButton = driver.findElement(By.xpath("//div[@class='fileActionsMenu popovermenu bubble open menu']//li[4]"));
            detailsButton.click();
            //4. Write a comment inside to the input box

            WebElement commentButton = driver.findElement(By.id("commentsTabView"));
            commentButton.click();
            WebElement messageBox = driver.findElement(By.xpath("//div[@class='message']"));
            String message = "Dont forget to save your files!!!";
            messageBox.sendKeys(message);

            //5. Click the submit button to post it
            WebElement submitButton = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
            submitButton.click();
            BrowserUtils.sleep(5);

            //6. Verify the comment is displayed in the comment section.
            String actualComments = driver.findElement(By.xpath("//ul[@class='comments']")).getText();
            System.out.println("actualComments = " + actualComments);

            Assert.assertTrue(actualComments.contains(message), "Test fail message not displayed in comments box. FAILED!!!");

            //(Pre-condition: there should be at least 1 file/folder is uploaded inside files page


            LoginUtil.LogOut(driver);
        }
    }

    @Test(description = "US3-Test case #8a - verify users can delete a file/folder.")
    public void deleteFileOrFolder() {

        //1. Login as a user
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2", "userName3", "userName4"));
        for (String eachUser : userNames) {
            LoginUtil.Login(driver, eachUser, "password");
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            //go to in File module
            WebElement fileModule = driver.findElement(By.xpath("(//li[@data-id='files'])[1]"));
            fileModule.click();

            //2. Click action-icon from any file on the page
            WebElement actionIcon = driver.findElement(By.xpath("//a[@class='action action-menu permanent']"));
            actionIcon.click();

            //get test of file before delete.
            String fileName = driver.findElement(By.xpath("//span[@class='innernametext']")).getText();


            //3. Choose “delete files” option
            WebElement deleteButton = driver.findElement(By.xpath("//div[@class='fileActionsMenu popovermenu bubble open menu']//li[8]"));
            deleteButton.click();



            //4. Click deleted files on the left bottom corner
            WebElement deletedFilesButton = driver.findElement(By.xpath("//a[@class='nav-icon-trashbin svg']"));
            deletedFilesButton.click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            //5. Verify the deleted file is displayed no the page.
            List<WebElement> deletedElements = driver.findElements(By.xpath("//td[@class='filename']//span[@class='innernametext']"));

            List<String> deletedFileNames = new ArrayList<>();

            for (WebElement eachFile : deletedElements) {
                deletedFileNames.add(eachFile.getText());
            }

            // BrowserUtils.sleep(5);

            Assert.assertTrue(deletedFileNames.contains(fileName), "Deleted file is not find in deleted file page.FAILED!!!");

            LoginUtil.LogOut(driver);
        }
    }




    @AfterMethod
    public void tearDown() {
        super.tearDownMethod();
    }


}
