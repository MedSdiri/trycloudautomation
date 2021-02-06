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
    public void Test1() {
        LoginUtil.Login(driver, "userName1", "password");
        
        
        HeaderRight.headerRightMenu(driver, "Contacts menu").click();
    
    }
    
    
}