package com.trycloud.tests.PageComponents;
import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class HeaderRight extends TestBase {

    public static int headerRight(String menu) {
        int menuNumber = 0;
        if (menu.equalsIgnoreCase("search")) {
            menuNumber = 1;
        } else if (menu.equalsIgnoreCase("notifications")) {
            menuNumber = 2;
        } else if (menu.equalsIgnoreCase("contacts")) {
            menuNumber = 3;
        } else if (menu.equalsIgnoreCase("Settings")) {
            menuNumber = 4;
        }
        return menuNumber ;

    }

    public static WebElement headerRightMenu(WebDriver driver, String menu) {
        // 1. search
        // 2.Notifications
        // 3.Contacts
        // 4.Settings
        WebElement headerRight = driver.findElement(By.cssSelector("div[class='header-right']"));
        return headerRight.findElement(By.xpath("//div[@class='header-right']/div[" + headerRight(menu) + "]"));
    }

}
