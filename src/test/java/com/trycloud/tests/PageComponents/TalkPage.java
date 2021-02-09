package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage extends HomePage {

    public TalkPage(){

        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@class='app-navigation-search__input']")
    public WebElement talkSearchBox;

    @FindBy(xpath = "//button[@class='toggle has-tooltip']")
    public WebElement createGroupButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/button")
    public WebElement settingsButton;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement navigationToggleButton;






}
