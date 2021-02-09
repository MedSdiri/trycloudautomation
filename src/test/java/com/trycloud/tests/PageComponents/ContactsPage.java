package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class ContactsPage extends HomePage {

    public ContactsPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "new-contact-button")
    public WebElement newContactTab;

    @FindBy(xpath = "//*[@id='everyone']/a")
    public WebElement allContacts;

    @FindBy(xpath = "//*[@id='notgrouped']/a/span")
    public WebElement notGrouped;

    @FindBy(xpath = "//*[@id='newgroup']/a/span")
    public WebElement newGroup;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[1]/div/div/input")
    public WebElement homePhoneInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[1]/div/div/input")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[3]/div/div[2]/input")
    public WebElement postOfficeBoxInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[3]/div/div[3]/input")
    public WebElement addressInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[3]/div/div[4]/input")
    public WebElement extendedAddressInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[3]/div/div[5]/input")
    public WebElement postalCodeInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[3]/div/div[6]/input")
    public WebElement cityInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[3]/div/div[7]/input")
    public WebElement stateOrProvinceInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[3]/div/div[8]/input")
    public WebElement countryInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[4]/div/div[2]/div[2]/span")
    public WebElement addressBookInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[5]/div/div[2]/div[2]/input")
    public WebElement groupsInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[6]/div/div[2]/div[2]/input")
    public WebElement addNewPropertyInput;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[1]/div/div/button")
    public WebElement homePhoneInputDeleteButton;

    @FindBy(xpath = "//*[@id='app-content-wrapper']/div[2]/section/div[2]/div/div/button")
    public WebElement emailDeleteButton;


}
