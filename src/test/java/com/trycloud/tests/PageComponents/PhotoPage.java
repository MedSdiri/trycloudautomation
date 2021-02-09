package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotoPage extends HomePage {


    public PhotoPage(){
        PageFactory.initElements(driver,this);


    }

   @FindBy(xpath = "//*[@id='appmenu']/li[3]/a/svg/image")
    public WebElement photoButton;


    @FindBy(xpath = "//*[@id='app-navigation-vue']/ul/li[1]/a/span")
     public WebElement yourPhotosButton;

    @FindBy(xpath = "//*[@id='app-navigation-vue']/ul/li[2]/a/span")
     public WebElement yourVideosButton;

    @FindBy(xpath = "//*[@id='app-navigation-vue']/ul/li[3]/a/span")
     public  WebElement favoritesButton;

    @FindBy(xpath = "//*[@id='app-navigation-vue']/ul/li[4]/a/span")
    public WebElement yourFoldersButton;

    @FindBy(xpath = "//*[@id='app-navigation-vue']/ul/li[5]/a/span")
    public WebElement sharedWithYouButton;

    @FindBy(xpath = "//*[@id='app-navigation-vue']/ul/li[6]/a/span")
   public WebElement taggedPhotosButtons;

    @FindBy(xpath = "//*[@id='app-settings-header']/button")
    public WebElement settingsButton;

    @FindBy(xpath = "//*[@id=app-navigation-vue]/a")
    public WebElement  smallButton;

    @FindBy(xpath = "//*[@id='app-content-vue']/div/div/div/div/div[2]/a/span/img")
    public  WebElement  pictureButton;


}
