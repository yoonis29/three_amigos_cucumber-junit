package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetManagementPage {
    public FleetManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")

    public WebElement fleet_for_driver;

    @FindBy(xpath="//li[@class='dropdown dropdown-level-1'][1]")
    public  WebElement fleet_for_store_and_sales;

    @FindBy(xpath = "//span[@class='title title-level-2'][1]")
    public WebElement vehicles_for_driver;

    @FindBy(xpath="//span[@class='title title-level-2' and text()='Vehicles']")
    public WebElement vehicles_for_store_and_sales;

    @FindBy(xpath = "//div[@class='pull-left grid-toolbar-mass-actions']/div/div/div/a")
    public WebElement exportGrid;

    @FindBy(xpath="(//i[@class='fa-upload'])[1]")
    public
    WebElement exportGridBtn;

    @FindBy(xpath="(//ul[@class='dropdown-menu'])[3]")
    public
    WebElement exportGrid_dropdown_menu_for_driver;

    @FindBy(xpath="(//ul[@class='dropdown-menu'])[5]")
    public
    WebElement exportGrid_dropdown_menu_for_store_and_sales;

}
