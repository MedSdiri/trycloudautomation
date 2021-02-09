package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class US_4_Navigator {
public WebDriver driver;
    @FindBy(how = How.XPATH, using = "//a[@aria-label='Talk'])[1]")
    public WebElement talksModule;

    public WebElement Navigator(String module){

        return talksModule;
    }




}
