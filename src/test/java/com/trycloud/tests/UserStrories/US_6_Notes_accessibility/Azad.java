package com.trycloud.tests.UserStrories.US_6_Notes_accessibility;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        driver.findElement(By.xpath("//li[@data-id='notes']")).click(); // notes tab
        driver.findElement(By.xpath("//button[@id='notes_new_note']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='CodeMirror-cursors']")).sendKeys("Hello Hello Test");
    }
    
}
