package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityPage extends HomePage {

    public ActivityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[1]/a/span")
    public WebElement allActivities;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[2]/a/span")
    public WebElement byYou;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[3]/a/span")
    public WebElement byOthers;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[4]/a/span")
    public WebElement circles;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[5]/a/span")
    public WebElement favorites;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[6]/a/span")
    public WebElement fileChanges;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[7]/a/span")
    public WebElement fileShares;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[8]/a/span")
    public WebElement calendar;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[9]/a/span")
    public WebElement todos;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[10]/a/span")
    public WebElement comments;

    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[11]/a/span")
    public WebElement deck;

    @FindBy(xpath = "//*[@id='app-settings-header']/button")
    public WebElement settings;

}
