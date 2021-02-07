package com.trycloud.tests.UserStrories.US_5_Contacts_accessibility;

import com.trycloud.tests.PageComponents.HeaderLeft;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.LoginUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Irina extends TestBase {

    @BeforeMethod
    public void setUpMethod() {
        super.setUpMethod();
    }

    @Test(priority = 1)
    public void ContactsModules() {
        LoginUtil.Login(driver, "userName1", "password");
        HeaderLeft.headerLeftMenu("contacts").click();
        BrowserUtils.sleep(2);
        String expectedTitle = "Contacts";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Test
    public void Test2() throws InterruptedException {
        LoginUtil.Login(driver, "userName2", "password");
        HeaderLeft.headerLeftMenu("contacts").click();
        WebElement newContactButton = driver.findElement(By.xpath("//button[@id='new-contact-button']"));
        newContactButton.click();
        BrowserUtils.faker();
        WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        BrowserUtils.sleep(2);
        name.clear();
        String fullname = BrowserUtils.faker().name().fullName();
        name.sendKeys(fullname);


        WebElement titleButton = driver.findElement(By.xpath("//input[@id='contact-title']"));
        titleButton.sendKeys(BrowserUtils.faker().job().title());

        WebElement companyButton = driver.findElement(By.id("contact-org"));
        companyButton.sendKeys(BrowserUtils.faker().company().name());

        WebElement phoneInput = driver.findElement(By.xpath("//input[@inputmode='tel']"));
        phoneInput.sendKeys(BrowserUtils.faker().phoneNumber().cellPhone());

        WebElement emailField = driver.findElement(By.xpath("//input[@inputmode='email']"));
        emailField.sendKeys(BrowserUtils.faker().internet().emailAddress());

        WebElement postField = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
        postField.sendKeys(BrowserUtils.faker().address().zipCode());

        WebElement addressField = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
        addressField.sendKeys(BrowserUtils.faker().address().streetAddress());

        WebElement extendedAddress = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
        extendedAddress.sendKeys(BrowserUtils.faker().address().streetAddress());

        WebElement postCode = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
        postCode.sendKeys(BrowserUtils.faker().address().zipCode());
        postCode.clear();

        WebElement cityField = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
        cityField.sendKeys(BrowserUtils.faker().address().cityName());
        cityField.clear();

        WebElement stateField = driver.findElement(By.xpath("(//input[@type='text'])[15]"));
        stateField.sendKeys(BrowserUtils.faker().address().state());
        stateField.clear();

        WebElement countryField = driver.findElement(By.xpath("(//input[@type='text'])[16]"));
        countryField.sendKeys(BrowserUtils.faker().address().countryCode());


        List<WebElement> listOfContacts = driver.findElements(By.xpath("//div[@id='contacts-list']"));
        for (WebElement eachContact : listOfContacts) {
            Assert.assertTrue(eachContact.getText().contains(fullname));
        }


    }


}










