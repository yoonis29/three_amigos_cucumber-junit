package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.google.common.io.ByteArrayDataInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HNTruckDriverGridPage extends LoginPage {

    public HNTruckDriverGridPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//span[@class='title title-level-1'][1]")
    public WebElement fleet;

@FindBy(xpath = "(//span[@class='title title-level-2'])[5]")
    public WebElement vehicleFuelLog;

@FindBy(xpath = "//div[@class='column-manager dropdown']")
    public WebElement gridSettingsbtn;



@FindBy(xpath = "//div[@class='column-manager-title']")
public WebElement gridSet;


}
