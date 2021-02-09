package com.trycloud.tests.PageComponents;

import com.trycloud.tests.base.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CirclesPage extends HomePage {


    public CirclesPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "circles_new_name")
    public WebElement createANewCircleButton;

    @FindBy(id = "circles_new_type")
    public WebElement selectACircleTypeButton;

    @FindBy(id = "circles_new_submit")
    public WebElement circleNewSummit;

    @FindBy(id = "circles_list")
    public List<WebElement> circleList;

    @FindBy(xpath = "(//div[@circle-type])[1]")
    public WebElement personalCircle;

    @FindBy(xpath = "(//div[@circle-type])[2]")
    public WebElement publicCircle;

    @FindBy(xpath = "(//div[@circle-type])[3]")
    public WebElement closedCircle;

    @FindBy(xpath = "(//div[@circle-type])[4]")
    public WebElement secretCircle;

    @FindBy(xpath = "(//div[@circle-type])[5]")
    public WebElement allCircle;

    @FindBy(xpath = "(//option[@value])[2]")
    public WebElement personalCircleType;

    @FindBy(xpath = "(//option[@value])[3]")
    public WebElement publicCircleType;

    @FindBy(xpath = "(//option[@value])[4]")
    public WebElement closeCircleType;

    @FindBy(xpath = "(//option[@value])[5]")
    public WebElement secretCircleType;

    @FindBy(id="circles_search")
    public WebElement circleSearchBox;

    @FindBy(id = "circles_filters")
    public  WebElement circlesFilterBox;

    @FindBy(id="joincircle")
    public WebElement joinCircleButton;

    @FindBy(id="circle-actions-return")
    public WebElement iconCloseButton;


}




