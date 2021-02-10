package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MailPage extends HomePage {
    
    
    public MailPage(){
        PageFactory.initElements(driver,this);
    }
    
    
    @FindBy(xpath="//a[contains(text(),'Auto')]")
    public WebElement auto;
    
    @FindBy(xpath="auto-name")
    public WebElement name;
    
    
    @FindBy(id="auto-address")
    public WebElement mailAddress;
    
    @FindBy(id="auto-password")
    public WebElement password;
    
    
    
    
    
    
    
    
    
    @FindBy(xpath="//a[contains(text(),'Manual')]")
    public WebElement manual;
    
    
    @FindBy(xpath="//body/div[@id='content-vue']/div[@id='emptycontent']/form[@id='account-form']/div[1]/div[1]/section[2]/div[1]/label[1]")
    public WebElement noneButton1;
    
    @FindBy(xpath="//body/div[@id='content-vue']/div[@id='emptycontent']/form[@id='account-form']/div[1]/div[1]/section[2]/div[1]/label[2]")
    public WebElement ssltlsButton1;
    
    @FindBy(xpath="//body/div[@id='content-vue']/div[@id='emptycontent']/form[@id='account-form']/div[1]/div[1]/section[2]/div[1]/label[3]")
    public WebElement startTlcButton1;
    
    @FindBy(xpath="//input[@id='man-imap-port']")
    public WebElement imapPort;
    
    @FindBy(xpath="//input[@id='man-imap-user']")
    public WebElement imapUser;
    
    
    
    
    
    @FindBy(xpath="//body/div[@id='content-vue']")
    public WebElement smtphostSettings;
    
    @FindBy(xpath="//body/div[@id='content-vue']/div[@id='emptycontent']/form[@id='account-form']/div[1]/div[1]/section[2]/div[2]/label[2]")
    public WebElement ssltlc2;
    
    
    
    @FindBy(xpath="//input[@id='man-imap-password']")
    public WebElement SMTPPassword;
    
    @FindBy(xpath="//body/div[@id='content-vue']/div[@id='emptycontent']/form[@id='account-form']/input[1]")
    public WebElement connect;
}
