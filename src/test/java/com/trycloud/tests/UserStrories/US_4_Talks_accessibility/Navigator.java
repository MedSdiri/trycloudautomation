package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Navigator {

    WebDriver driver;

    public Navigator(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    @FindBys({
            @FindBy(how = How.XPATH, using = "//ul[@class='conversations']"),
            @FindBy(how = How.XPATH, using = "//ul[@class='contacts-list']")
    })
    List<WebElement> allUsersInSearchResult;


    @FindBy(how = How.XPATH, using = "//input[@class='app-navigation-search__input']")
    WebElement searchInputBox;

    @FindBy(how = How.XPATH, using = "//a[@aria-label='Talk'])[1]")
    WebElement talksModule;

    @FindBy(how = How.XPATH, using = "//div[@class='new-message-form__advancedinput']")
    WebElement messageBoxInput;

    @FindBy(how = How.XPATH, using = "(//div[@class='message-group'])[2]")
    List<WebElement> conversationMessageBox;

    //Get title on current page
    public String title() {
        return driver.getTitle();
    }

    //Search User from searchBox and select, then send message method
    public void sendMessage(String personName) {
        searchInputBox.sendKeys(personName);
        String message = BrowserUtils.faker().app().name();

        for (WebElement eachPerson : allUsersInSearchResult) {
            if (eachPerson.getText().equalsIgnoreCase(personName)) {
                eachPerson.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                messageBoxInput.sendKeys(message);
            } else {
                System.out.println("The person, you want to start conversation, is not found in list.FAILED!!!");
                driver.close();
            }
        }

        for (WebElement eachConversation : conversationMessageBox) {
            Assert.assertTrue(eachConversation.getText().equalsIgnoreCase(message));

        }
    }

}



