package com.trycloud.tests.UserStrories.US_7_Item_search;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class US_7_Test extends TestBase {

    @BeforeMethod
    public void setUpMethod() {
        super.setUpMethod();
    }

    @Test
    public void Test() {

        Iterator<String> it = userNames.iterator();

        while(it.hasNext()){

            String eachUser = it.next();
            LoginUtil.Login(driver,eachUser,"password");

            WebElement magnifier = driver.findElement(By.xpath("//*[@id='header']/div[2]/div[1]/a"));
            magnifier.click();

            WebElement searchInputBox = driver.findElement(By.xpath("//input[@class='unified-search__form-input']"));
            searchInputBox.sendKeys("Talk");

            BrowserUtils.sleep(1);
            List<WebElement> allUnorderedListAfterSearch = driver.findElements(By.xpath("//div[@class='header-menu__content']//ul//li[1]//h3//span"));
            System.out.println(eachUser + " allUnorderedList.size() = " + allUnorderedListAfterSearch.size());

            Assert.assertTrue(allUnorderedListAfterSearch.size() > 0, "Unexpected result!!!");

            LoginUtil.LogOut(driver);
        }

    }

    @AfterMethod
    public void tearDown() {
        super.tearDownMethod();
    }

}
