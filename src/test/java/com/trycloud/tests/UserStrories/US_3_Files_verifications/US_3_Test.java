package com.trycloud.tests.UserStrories.US_3_Files_verifications;

import com.trycloud.tests.PageComponents.HeaderLeft;
import com.trycloud.tests.PageComponents.HeaderRight;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class US_3_Test extends TestBase {
    
    @BeforeMethod
    public void setUpMethod() {
        super.setUpMethod();
    }
    
    @Test
    public void Test1(){
        LoginUtil.Login(driver, "userName1", "password");
        
        
        HeaderRight.headerRightMenu(driver,"Contacts menu").click();

    }
    
    
    @Test
    public void Test2() throws InterruptedException {
    
    /*
        Test case #10 - verify users see the app storage usage
            1. Login as a user
            2. Check the current storage usage
            3. Upload a file
            4. Refresh the page
            5. Verify the storage usage is increased
     */
        
            //TODO: Login as a user
           // LoginToWebsite.loginTrycloud();
        LoginUtil.Login(driver, "userName1", "password");

            //TODO: Click the File icon on the top modules
            WebElement fileIcon = driver.findElement(By.xpath("(//a[@href='/index.php/apps/files/'])[1]"));
            fileIcon.click();
         

            //TODO: Check the current storage usage
            WebElement beforeUploadStorage = driver.findElement(By.xpath("//a[@class='icon-quota svg']"));
       
            System.out.println("Storage usage, before upload a file: " + beforeUploadStorage.getText());
        

            //TODO: upload a file
           // String path = "/Users/abdulazizozden/Downloads/NextBase.xlsx";
            String path = "/Users/azadsadikhov/Desktop/SCREENSHOT/Screen Shot 2021-02-05 at 3.16.22 PM.png";
        
            WebElement chooseFile = driver.findElement(By.xpath("//a[@class='button new']"));
            chooseFile.click();
            
          Actions a =new Actions(driver);
          //  WebElement uploadButton =driver.findElement(By.xpath("//span[@class='svg icon icon-upload']"));
           // WebElement uploadButton =driver.findElement(By.xpath("//label[@for='file_upload_start']"));
            WebElement uploadButton =driver.findElement(By.xpath("//label[@data-action='upload']"));
        Thread.sleep(3000);
          a.moveToElement(uploadButton).sendKeys("/Users/azadsadikhov/Downloads/test.xlsx").perform();
    
        //  uploadButton.sendKeys("/Users/azadsadikhov/Desktop/SCREENSHOT/Screen Shot 2021-02-05 at 3.16.22 PM.png");
          
      //  uploadButton.click();
         
         //   BrowserUtils.sleep(1);
           //chooseFile.sendKeys(path);
         //   uploadButton.sendKeys(path);
            
            Thread.sleep(3);
            
            
          
          //  driver.switchTo().alert().accept();
            driver.navigate().refresh();
      
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

        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//input[@class='icon-confirm']"));

        BrowserUtils.sleep(1);

        String theatre = faker.gameOfThrones().quote();
        WebElement writeText = Driver.getDriver().findElement(By.xpath("(//p[@class='is-empty is-editor-empty'])[2]"));
        writeText.click();
        writeText.sendKeys(theatre);

        BrowserUtils.sleep(1);

        WebElement closeIcon = Driver.getDriver().findElement(By.xpath("//div[@class='icons-menu']"));
        closeIcon.click();

        BrowserUtils.sleep(1); */

            //TODO: Refresh the page
        //    driver.navigate().to(driver.getCurrentUrl());

           // BrowserUtils.sleep(1);

            //TODO: Verify the storage usage is increased
            String actualStorage = "";
            String expectStorage = "";

        //    Assert.assertEquals(actualStorage,expectStorage);

            
        
    }
    
    
 /*
    @AfterMethod
    public void tearDownMethod() {
        super.tearDownMethod();
    }
   
   
  */
    
    
}
