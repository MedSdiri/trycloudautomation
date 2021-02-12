package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.tests.base.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Talks extends HomePage {

    public Talks() {
        PageFactory.initElements(driver, this);
    }

    //ul[@class='contacts-list']

    @FindBy(xpath = "//div[@class='wrapper']")
    public WebElement plusButton;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement conversationNameBox;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    WebElement participantsButton;

    @FindBy(xpath = "//input[@class='set-contacts__input']")
    WebElement searchParticipantsBox;

    @FindBy(xpath = "//div[@class='participants-search-results scrollable']")
    public List<WebElement> users;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    WebElement createConversationButton;




    @FindBy(xpath = "//ul[@class='contacts-list']")
    public List<WebElement> searchResult;

    @FindBy(xpath = "//ul[@class='conversations']")
    public List<WebElement> conversationList;

    @FindBy(xpath = "//input[@type='text']")
    public  WebElement searchInputBox;

    @FindBy(xpath = "//div[@class='new-message-form__advancedinput']")
    public WebElement messageBoxInput;

    @FindBy(xpath = "//div//button[@type='submit']")
    public WebElement messageSummitButton;

    @FindBy(xpath = "//div[@class='scroller']")
    public List<WebElement> conversationMessageBox;

}


