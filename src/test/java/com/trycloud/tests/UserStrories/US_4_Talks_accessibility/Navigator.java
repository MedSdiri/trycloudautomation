package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Navigator {

    public WebDriver driver;

    public Navigator() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //ul[@class='contacts-list']

    @FindBy(xpath = "//ul[@class='app-navigation__list']")
    public List<WebElement> searchResult;

    @FindBy(xpath = "//ul[@class='conversations']")
    public List<WebElement> conversationList;

    @FindBy(how = How.XPATH, using = "//input[@class='app-navigation-search__input']")
    public WebElement searchInputBox;

    @FindBy(how = How.XPATH, using = "//div[@class='new-message-form__advancedinput']")
    public WebElement messageBoxInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement messageSummitButton;


    @FindBy(how = How.XPATH, using = "(//div[@class='message-group'])[2]")
    public List<WebElement> conversationMessageBox;

    //Search User from searchBox and select
    public void findPersonIn() {


    }
}


