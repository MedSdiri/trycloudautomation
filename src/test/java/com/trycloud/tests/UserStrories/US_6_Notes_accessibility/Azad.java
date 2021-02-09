package com.trycloud.tests.UserStrories.US_6_Notes_accessibility;

import com.trycloud.tests.PageComponents.HeaderRight;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Azad extends TestBase {
    
    
    @BeforeMethod
    public void setUpMethod() {
        super.setUpMethod();
    }
    
    @Test
    public void Test1(){
        LoginUtil.Login(driver,"userName1","password");
        driver.findElement(By.xpath("//li[@data-id='notes']")).click(); // notes tab
        String expectedNotesTitle="Notes - Trycloud - QA";
        Assert.assertEquals(expectedNotesTitle,driver.getTitle());
    }
    
    @Test
    public void Test2() throws InterruptedException {
        LoginUtil.Login(driver,"userName1","password");
        HeaderRight.headerRight("");
        driver.findElement(By.xpath("//button[@id='notes_new_note']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='CodeMirror-cursors']")).sendKeys("Hello Hello Test");
    }
    
    
    @Test(description = "verify users see the app storage usage")
    public void storageUsage() throws InterruptedException, AWTException {
        
        //TODO: Login as a user
       // driver.get("http://qa.trycloud.net/index.php/apps/files/?dir=/&fileid=393");
        LoginUtil.Login(driver,"userName1","password");
    
        WebElement fileModule = driver.findElement(By.xpath("(//li[@data-id='files'])[1]"));
        fileModule.click();
        
        //TODO: Click the File icon on the top modules
        // 3.Upload a file
        driver.findElement(By.xpath("//span[@class='icon icon-add']")).click();
     
        
        //BrowserUtils.sleep(3);
        WebElement uploadFile = driver.findElement(By.xpath("//label[@for='file_upload_start']"));
        uploadFile.click();
        
        
        File file = new File("/Users/azadsadikhov/Desktop/Screen Shot 2021-02-05 at 7.04.14 PM.png");
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        //Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        // Cmd + Tab is needed since it launches a Java app and the browser looses focus
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);
        //Open Goto window
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
        robot.delay(500);
        //Paste the clipboard value
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(500);
        //Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     //   driver.navigate().refresh();
    
    
    
    
    
    
    
    
    
    
    
    
        /*Faker faker = new Faker();

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        chooseFile.click();

        BrowserUtils.sleep(1);

        WebElement newTextDocumentButton = Driver.getDriver().findElement(By.xpath("//span[@class='icon icon-filetype-text svg']"));
        newTextDocumentButton.click();

        BrowserUtils.sleep(1);

        WebElement fileName = Driver.getDriver().findElement(By.xpath("//input[@id='view13-input-file']"));
        String fileName2 = faker.name().name();
        fileName.sendKeys(fileName2 );

        BrowserUtils.sleep(1);

        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//input[@class='icon-confirm']"));
        submitButton.click();

        BrowserUtils.sleep(1);

        String theatre = faker.gameOfThrones().quote();
        WebElement writeText = Driver.getDriver().findElement(By.xpath("(//p[@class='is-empty is-editor-empty'])[2]"));
        writeText.click();
        writeText.sendKeys(theatre);

        BrowserUtils.sleep(1);

        WebElement closeIcon = Driver.getDriver().findElement(By.xpath("//div[@class='icons-menu']"));
        closeIcon.click();

        BrowserUtils.sleep(1); */
    /*
        //TODO: Refresh the page
        driver.navigate().to(driver.getCurrentUrl());
        
        BrowserUtils.sleep(1);
        
        //TODO: Verify the storage usage is increased
        String actualStorage = "";
        String expectStorage = "";
        
        Assert.assertEquals(actualStorage,expectStorage);
        
        BrowserUtils.sleep(3);
        //Driver.closeDriver();
        
     */
        
    }
    
    
    
    
}
