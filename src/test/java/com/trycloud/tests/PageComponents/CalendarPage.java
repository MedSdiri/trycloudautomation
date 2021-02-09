package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends HomePage {

    public CalendarPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[class='app-navigation-toggle']")
    public WebElement appNavigation;

    //all webElements of app under Calendar menu
    @FindBy(css = "button[class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement datePicker;

    @FindBy(css = "button[aria-label= 'Previous month']")
    public WebElement previousMonth;

    @FindBy(css = "button[aria-label= 'Next month']")
    public WebElement nextMonth;

    @FindBy(css = "button[class= 'button primary new-event']")
    public WebElement newEventButton;

    @FindBy(css = "button[class= 'button today']")
    public WebElement todayButton;

    @FindBy(css = "button[class= 'icon action-item__menutoggle icon-view-module']")
    public WebElement actionMenuButton;

    @FindBy(xpath = "//div[@id='popover_uo6hw3u0wt']//li//button//span[text()='Day']")
    public WebElement day;

    @FindBy(xpath = "//div[@id='popover_uo6hw3u0wt']//li[2]//button//span[text()='Week']")
    public WebElement week;

    @FindBy(xpath = "//div[@id='popover_uo6hw3u0wt']//li[3]//button//span[text()='Month']")
    public WebElement month;

    @FindBy(xpath = "//div[@id='popover_uo6hw3u0wt']//li[4]//button//span[text()='List']")
    public WebElement list;

    //Personal
    @FindBy(xpath = "//*[@title='Personal']")
    public WebElement personalNavigation;

    @FindBy(css = "button[class='action-item action-item--single icon-share undefined undefined']")
    public WebElement personalShareButton;

    @FindBy(xpath = "//div[@class='sharing-section']//input[@class='multiselect__input']")
    public WebElement personalShareInputBox;

    @FindBy(css = "button[class='action-item action-item--single icon-share undefined undefined']")
    public WebElement personalShareMenu;

    @FindBy(xpath = "//*[@title='Share link']")
    public WebElement shareLink;

    @FindBy(xpath = "//*[text()='Publish calendar']")
    public WebElement publishCalendar;


    @FindBy(xpath = "//li[@class='app-navigation-entry draggable-calendar-list-item'][1]/div/div//button")
    public WebElement personalMenu;

    @FindBy(xpath = "//div[@id='popover_rfvhys1lm8']//ul/li[1]")
    public WebElement personalMenuEditName;

    @FindBy(xpath = "//div[@id='popover_rfvhys1lm8']//ul/li[2]")
    public WebElement personalMenuEditColor;

    @FindBy(xpath = "//div[@id='popover_rfvhys1lm8']//ul/li[3]")
    public WebElement personalMenuCopyPrivateLink;

    @FindBy(xpath = "//div[@id='popover_rfvhys1lm8']//ul/li[4]")
    public WebElement personalMenuEDownload;

    @FindBy(xpath = "//div[@id='popover_rfvhys1lm8']//ul/li[5]")
    public WebElement personalMenuDelete;



    //Contact birthdays
    @FindBy(xpath = "//*[@title='Contact birthdays']")
    public WebElement contactBirthdays;


    @FindBy(xpath = "//li[@class='app-navigation-entry draggable-calendar-list-item'][2]/div//button")
    public WebElement contactBirthdaysMenu;

    @FindBy(xpath = "//div[@id='popover_2xhaybv0t7']//ul/li[1]")
    public WebElement contactBirthdaysMenuEditName;

    @FindBy(xpath = "//div[@id='popover_2xhaybv0t7']//ul/li[2]")
    public WebElement contactBirthdaysMenuEditColor;

    @FindBy(xpath = "//div[@id='popover_2xhaybv0t7']//ul/li[3]")
    public WebElement contactBirthdaysMenuCopyPrivateLink;

    @FindBy(xpath = "//div[@id='popover_2xhaybv0t7']//ul/li[4]")
    public WebElement contactBirthdaysMenuEDownload;

    @FindBy(xpath = "//div[@id='popover_2xhaybv0t7']//ul/li[5]")
    public WebElement contactBirthdaysMenuDelete;



    //Deck: Personal
    @FindBy(xpath = "//*[@title='Deck: Personal']")
    public WebElement deckPersonal;


    @FindBy(xpath = "//li[@class='app-navigation-entry draggable-calendar-list-item'][3]/div//button")
    public WebElement deckPersonalMenu;

    @FindBy(xpath = "//div[@id='popover_wdiqithdqr']//ul/li[1]")
    public WebElement deckPersonalMenuEditName;

    @FindBy(xpath = "//div[@id='popover_wdiqithdqr']//ul/li[2]")
    public WebElement deckPersonalMenuEditColor;

    @FindBy(xpath = "//div[@id='popover_wdiqithdqr']//ul/li[3]")
    public WebElement deckPersonalMenuCopyPrivateLink;

    @FindBy(xpath = "//div[@id='popover_wdiqithdqr']//ul/li[4]")
    public WebElement deckPersonalMenuDownload;

    @FindBy(xpath = "//div[@id='popover_wdiqithdqr']//ul/li[5]")
    public WebElement deckPersonalMenuDelete;



    //New Calendar
    @FindBy(xpath = "//*[@title='+ New calendar']")
    public WebElement newCalendar;


    @FindBy(xpath = "//li[@class='app-navigation-entry app-navigation-entry-new-calendar']/div//button")
    public WebElement newCalendarMenu;

    @FindBy(xpath = "//div[@id='popover_0z5ksj0m1g']//ul/li[1]")
    public WebElement newCalendarMenuNewCalendar;

    @FindBy(xpath = "//div[@id='popover_0z5ksj0m1g']//ul/li[2]")
    public WebElement newCalendarMenuNewCalendarWithTaskList;

    @FindBy(xpath = "//div[@id='popover_0z5ksj0m1g']//ul/li[3]")
    public WebElement newCalendarMenuNewSubscriptionFromLink;

//    @FindBy( = "")
//    public WebElement ;

    //Main Data
    @FindBy(xpath = "//table[@class='fc-col-header ']//tbody//th[1]//a")
    public WebElement sun;

    @FindBy(xpath = "//table[@class='fc-col-header ']//tbody//th[2]//a")
    public WebElement mon;

    @FindBy(xpath = "//table[@class='fc-col-header ']//tbody//th[3]//a")
    public WebElement tue;

    @FindBy(xpath = "//table[@class='fc-col-header ']//tbody//th[4]//a")
    public WebElement wed;

    @FindBy(xpath = "//table[@class='fc-col-header ']//tbody//th[5]//a")
    public WebElement thu;

    @FindBy(xpath = "//table[@class='fc-col-header ']//tbody//th[6]//a")
    public WebElement fri;

    @FindBy(xpath = "//table[@class='fc-col-header ']//tbody//th[7]//a")
    public WebElement sat;





    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[1]/td[1]//a")
    public WebElement row1column1;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[1]/td[2]//a")
    public WebElement row1column2;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[1]/td[3]//a")
    public WebElement row1column3;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[1]/td[4]//a")
    public WebElement row1column4;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[1]/td[5]//a")
    public WebElement row1column5;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[1]/td[6]//a")
    public WebElement row1column6;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[1]/td[7]//a")
    public WebElement row1column7;




    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[2]/td[1]//a")
    public WebElement row2column1;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[2]/td[2]//a")
    public WebElement row2column2;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[2]/td[3]//a")
    public WebElement row2column3;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[2]/td[4]//a")
    public WebElement row2column4;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[2]/td[5]//a")
    public WebElement row2column5;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[2]/td[6]//a")
    public WebElement row2column6;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[2]/td[7]//a")
    public WebElement row2column7;



    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[3]/td[1]//a")
    public WebElement row3column1;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[3]/td[2]//a")
    public WebElement row3column2;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[3]/td[3]//a")
    public WebElement row3column3;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[3]/td[4]//a")
    public WebElement row3column4;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[3]/td[5]//a")
    public WebElement row3column5;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[3]/td[6]//a")
    public WebElement row3column6;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[3]/td[7]//a")
    public WebElement row3column7;




    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[4]/td[1]//a")
    public WebElement row4column1;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[4]/td[2]//a")
    public WebElement row4column2;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[4]/td[3]//a")
    public WebElement row4column3;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[4]/td[4]//a")
    public WebElement row4column4;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[4]/td[5]//a")
    public WebElement row4column5;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[4]/td[6]//a")
    public WebElement row4column6;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[4]/td[7]//a")
    public WebElement row4column7;



    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[5]/td[1]//a")
    public WebElement row5column1;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[5]/td[2]//a")
    public WebElement row5column2;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[5]/td[3]//a")
    public WebElement row5column3;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[5]/td[4]//a")
    public WebElement row5column4;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[5]/td[5]//a")
    public WebElement row5column5;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[5]/td[6]//a")
    public WebElement row5column6;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[5]/td[7]//a")
    public WebElement row5column7;



    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[6]/td[1]//a")
    public WebElement row6column1;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[6]/td[2]//a")
    public WebElement row6column2;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[6]/td[3]//a")
    public WebElement row6column3;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[6]/td[4]//a")
    public WebElement row6column4;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[6]/td[5]//a")
    public WebElement row6column5;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[6]/td[6]//a")
    public WebElement row6column6;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[6]/td[7]//a")
    public WebElement row6column7;




    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[7]/td[1]//a")
    public WebElement row7column1;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[7]/td[2]//a")
    public WebElement row7column2;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[7]/td[3]//a")
    public WebElement row7column3;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[7]/td[4]//a")
    public WebElement row7column4;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[7]/td[5]//a")
    public WebElement row7column5;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[7]/td[6]//a")
    public WebElement row7column6;

    @FindBy(xpath = "//table[@class='fc-scrollgrid-sync-table']/tbody/tr[7]/td[7]//a")
    public WebElement row7column7;

//    @FindBy( = "")
//    public WebElement ;

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsAndImportButton;

    @FindBy(xpath = "//div[@id='app-settings-content']//ul/li[1]")
    public WebElement importCalendar;

    @FindBy(xpath = "//div[@id='app-settings-content']//ul/li[2]")
    public WebElement enableBirthdayCalendar;

    @FindBy(xpath = "//div[@id='app-settings-content']//ul/li[3]")
    public WebElement showTaskInCalendar;

    @FindBy(xpath = "//div[@id='app-settings-content']//ul/li[4]")
    public WebElement enableSimplifiedEditor;

    @FindBy(xpath = "//div[@id='app-settings-content']//ul/li[5]")
    public WebElement limitVisibleEventsPerView;

    @FindBy(xpath = "//div[@id='app-settings-content']//ul/li[6]")
    public WebElement showWeekends;

    @FindBy(xpath = "//div[@id='app-settings-content']//ul/li[7]")
    public WebElement showWeekNumbers;

    @FindBy(xpath = "//ul/li[8]//div[@class='multiselect__tags']//span")
    public WebElement minutes30;

    @FindBy(xpath = "//ul/li[9]//div[@class='multiselect__tags']//span")
    public WebElement timeZone;

    @FindBy(xpath = "//p[text()='Copy primary CalDAV address']")
    public WebElement copyPrimaryCalDAVaddress;

    @FindBy(xpath = "//p[text()='Copy iOS/macOS CalDAV address']")
    public WebElement copyIOS_MacOS_CalDAVaddress;

    @FindBy(xpath = "//p[text()='Show keyboard shortcuts']")
    public WebElement showKeyboardShortcuts;



}
