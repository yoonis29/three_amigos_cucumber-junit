package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesVyTrack {

    public VehiclesVyTrack(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='ui-multiselect ui-corner-all select-filter-widget']")
    public WebElement manageFilters;

    @FindBy(xpath = "//div[@class='pull-left grid-toolbar-mass-actions']/div/div/div/a")
    public WebElement exportGrid;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetBtn;

    @FindBy(xpath = "//button[@data-toggle='dropdown']")
    public WebElement dropDownRowsPerPage;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[3]")
    public WebElement dropDownRowsPerPage50;

    @FindBy(xpath = "//a[@title='Refresh']")
    public WebElement refreshBtn;

    @FindBy(xpath = "//a[@title='Reset']//following-sibling::div//a[@title='Grid Settings']")
    public WebElement gridSettings;

    @FindBy(xpath = "//span[@class='grid-header-cell__label' and text()='Location'][1]")
    public WebElement location;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement pageNumber;

    @FindBy(xpath = "//a[@data-grid-pagination-direction='next']")
    public WebElement nextPage;

}