package com.trycloud.tests.UserStrories.US_3_Files_verifications;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    public void Test1() {
        LoginUtil.Login(driver, "userName1", "password");
        driver.findElement(By.xpath("(//li[@data-id='files'])[1]")).click();
        String expectedTitle = "Files";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle),"Try again, it failed");
        
        
        
   /*
   Test case #1 - verify users can access to Files module
1. Login as a user
2. Verify the page tile is Files module’s tile
    
    
    Test case #2 - verify users can select all the uploaded files from the page
1. Login as a user
2. Click the top left checkbox of the table
3. Assert all the files are selected
(Pre-condition: there should be at least 2 files are uploaded the page)
    
    */
    }
    
    
    @Test
    public void Test2() {
       
            LoginUtil.Login(driver,"userName1" , "password");
            WebElement appMenu = driver.findElement(By.xpath("//ul[@id='appmenu']"));
            WebElement navigation = driver.findElement(By.xpath("//ul[@id='appmenu']"));
           
           // appMenu.findElement(By.xpath("//li[@data-id='photos']")).click();
            appMenu.findElement(By.xpath("//li[@data-id='activity']")).click();
            
           
            
          
      //li[@data-id='photos']
    }
    
    
    @AfterMethod
    public void tearDownMethod() {
        super.tearDownMethod();
    }
    //added notes
    
    
}
