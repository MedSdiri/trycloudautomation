package com.trycloud.tests.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;


public class LoginFunctionalities extends TestBase {
    Properties properties = new Properties();
    
    /*
    Test case #1 - verify user login successfully
1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
2. Enter valid username
3. Enter valid password
4. Click login button
5. Verify the URL is chawed to homepage’s url
(Put this test case in testBase class with an annotation so it runs for all the test case)

     */
    @Test
    public void reading_properties_file() throws IOException {
        //#1- Create Properties class object
        //#2- Open the file in JVM Memory and pass the path of the file
        //#3- Load the opened file into the Properties object.
        
        Properties properties = new Properties();
        String path = "configuration.properties";
        
        FileInputStream file = new FileInputStream(path);
        
        properties.load(file);
        
        driver.get(properties.getProperty("environment"));
        
        
    }
    
    @Test
    public void Test1() {
        properties.getProperty("password");
        WebElement inputUsername = driver.findElement(By.cssSelector("input[id='user']"));
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
    
        ArrayList<String>UserNames=new ArrayList<>(Arrays.asList(
                (properties.getProperty("userName1")),
                (properties.getProperty("userName2")),
                (properties.getProperty("userName3")),
                (properties.getProperty("userName4"))));
    
    
        System.out.println(UserNames);
    
    
    }
    
    
}
