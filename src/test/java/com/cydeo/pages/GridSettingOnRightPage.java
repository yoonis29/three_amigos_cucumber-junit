package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GridSettingOnRightPage {
    public GridSettingOnRightPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class = 'title title-level-1'])[1]")
    public WebElement fleetHover;

    @FindBy(xpath = "//li[@class='dropdown-menu-single-item first']//span")
    public WebElement vehicleTab;

    @FindBy(xpath = "//a[@title = 'Grid Settings']")
    public WebElement gridSettingBtN;
}
