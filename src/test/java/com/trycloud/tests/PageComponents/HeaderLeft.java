package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderLeft extends TestBase {
   
    
    
    public static WebElement headerLeftMenu(WebDriver driver,String menu) {
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
        
        WebElement appMenu = driver.findElement(By.xpath("//ul[@id='appmenu']"));
        return appMenu.findElement(By.xpath("//li[@data-id='"+menu+"']"));
        
        
        
    }
    
}
