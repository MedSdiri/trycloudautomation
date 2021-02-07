package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderLeft extends TestBase {
/*
    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[1]")
    public WebElement dashboard;

    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[2]")
    public WebElement files;

    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[3]")
    public WebElement photos;

    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[4]")
    public WebElement activity;

    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[5]")
    public WebElement spreed;

    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[6]")
    public WebElement mail;

    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[7]")
    public WebElement contacts;

    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[8]")
    public WebElement circles;

    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[9]")
    public WebElement calendar;

    @FindBy(how = How.XPATH, using = "//*[@id='appmenu']/li[10]")
    public WebElement deck;

 */
    
    public static WebElement headerLeftMenu(String menu) {
      // search Keys
      /*
      // 1. dashboard
      // 2. files
      // 3. photos
      // 4. activity
      // 5. spreed
      // 6. mail
      // 7. contacts
      // 8. circles
      // 9. calendar
      // 10. deck

       */
        
        WebElement appMenu = driver.findElement(By.xpath("//ul[@id='appmenu']"));
        return appMenu.findElement(By.xpath("//li[@data-id='"+menu+"']"));
    }
    
}
