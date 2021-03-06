package com.trycloud.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUtil {
    /*public static WebDriver driver;
    public static WebElement inputUsername = driver.findElement(By.cssSelector("input[id='user']"));
    public static WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
    public static WebElement loginButton = driver.findElement(By.cssSelector("input[id='submit-form']"));*/

    public static void Login(WebDriver driver, String key, String password) {
        WebElement inputUsername = driver.findElement(By.cssSelector("input[id='user']"));
        inputUsername.sendKeys(ConfigurationReader.getProperty(key));

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys(ConfigurationReader.getProperty(password));

        WebElement loginButton = driver.findElement(By.cssSelector("input[id='submit-form']"));
        loginButton.click();

    }


    public static void LogOut(WebDriver driver) {
        WebElement logOut = driver.findElement(By.xpath("//*[@id='expand']/div[1]"));
        logOut.click();

        driver.findElement(By.xpath("//*[@id='expanddiv']/ul/li[4]")).click();

        WebElement inputUsername = driver.findElement(By.cssSelector("input[id='user']"));
        inputUsername.clear();
    }

    public static void inputClear(WebDriver driver) {
        WebElement inputUsername = driver.findElement(By.cssSelector("input[id='user']"));
        inputUsername.clear();
    }


}
