package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderRight extends TestBase {
    public static int headerRight(String menu) {
        int menuNumber = 0;
        if (menu.equalsIgnoreCase("Magnify icon")) {
            menuNumber = 1;
        } else if (menu.equalsIgnoreCase("Notifications")) {
            menuNumber = 2;
        } else if (menu.equalsIgnoreCase("Contacts menu")) {
            menuNumber = 3;
        } else if (menu.equalsIgnoreCase("Settings menu")) {
            menuNumber = 4;
        }
        return menuNumber;
    }
    
    
    public static WebElement headerRightMenu(WebDriver driver,String menu) {
        // 1.Magnify icon
        // 2.Notifications
        // 3.Contacts menu
        // 4.Settings menu
        
        
        WebElement headerRight = driver.findElement(By.cssSelector("div[class='header-right']"));
        return headerRight.findElement(By.xpath("//div[@class='header-right']/div[" + headerRight(menu)+ "]"));
       
        
        
    }
    
}
