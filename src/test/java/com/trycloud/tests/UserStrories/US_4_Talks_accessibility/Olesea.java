package com.trycloud.tests.UserStrories.US_4_Talks_accessibility;

import com.trycloud.tests.PageComponents.HeaderLeft;
import com.trycloud.tests.PageComponents.TalkPage;
import com.trycloud.tests.base.HomePage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.LoginUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Olesea extends HomePage {

  @BeforeMethod
  public  void setUpMethod(){

      super.setUpMethod();


  }

    @Test
    public  void accessToTalkModule(){
        LoginUtil.Login(driver,"userName1", "password");
        TalkPage talkPage = new TalkPage();

        HeaderLeft.headerLeftMenu("spreed").click();
        talkPage.talkSearchBox.sendKeys("employee17");


    }

       @Test
    public void createGroupButton(){
           LoginUtil.Login(driver,"userName1", "password");
           TalkPage talkPage = new TalkPage();

           HeaderLeft.headerLeftMenu("spreed").click();
           talkPage.createGroupButton.click();


       }

       @Test
    public void createSettingsButton(){

           LoginUtil.Login(driver,"userName1", "password");
           TalkPage talkPage = new TalkPage();

           HeaderLeft.headerLeftMenu("spreed").click();
           talkPage.createGroupButton.click();

       }

       @Test
    public void navigationToggleButton(){
           LoginUtil.Login(driver,"userName1", "password");
           TalkPage talkPage = new TalkPage();

           HeaderLeft.headerLeftMenu("spreed").click();
           talkPage.navigationToggleButton.click();

       }



}
