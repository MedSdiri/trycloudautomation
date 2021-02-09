package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Navigator {

    WebDriver driver;

    public Navigator(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//ul[@class='contacts-list']")
    public static List<WebElement> searchResult;

    @FindBy(xpath = "//ul[@class='conversations']")
    public List<WebElement> conversationList;

    @FindBy(how = How.XPATH, using = "//input[@class='app-navigation-search__input']")
    public static WebElement searchInputBox;

    @FindBy(how = How.XPATH, using = "//a[@aria-label='Talk'])[1]")
    WebElement talksModule;

    @FindBy(how = How.XPATH, using = "//div[@class='new-message-form__advancedinput']")
    WebElement messageBoxInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement messageSummitButton;


    @FindBy(how = How.XPATH, using = "(//div[@class='message-group'])[2]")
    List<WebElement> conversationMessageBox;

    //Use Faker to create random message
    public String autoMessage() {
        return BrowserUtils.faker().backToTheFuture().quote();
    }

    //Search User from searchBox and select
    public void sendMessage(String personName) {
        searchInputBox.sendKeys(personName);
        Actions action = new Actions(driver);
        for (WebElement eachResult : conversationList) {
            System.out.println(eachResult.getText());
            if (eachResult.getText().equalsIgnoreCase(personName))
                action.doubleClick(eachResult).perform();
              // eachResult.click();
            else {
                for (WebElement webElement : searchResult) {
                    System.out.println(webElement.getText());
                    if(webElement.getText().equalsIgnoreCase(personName))
                        action.doubleClick(eachResult).perform();
                       // webElement.click();
                    else
                        System.out.println("Person is not in list.Please try with available input. FAILED!!!");

                }
            }
        }


    }
}



/*
 for(int i =1; i<searchResult.size();i++){
           if(searchResult.get(i).getText().contains(personName)){
               searchResult.get(i).click();
               messageBoxInput.sendKeys(BrowserUtils.faker().name().title());
           }
       }
 */

