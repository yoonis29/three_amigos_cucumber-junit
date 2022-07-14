package com.cydeo.pages;


import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.WeakHashMap;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this   );

    }
     @FindBy( id = "prependedInput")
    public WebElement loginInput;

    @FindBy (id = "prependedInput2")
    public WebElement passwordInput;


    @FindBy ( id = "_submit")
    public WebElement submitBtn;

    public void login(String username , String password){
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitBtn.click();
    }

    public void loginAsDriver(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        loginInput.sendKeys(ConfigurationReader.getProperty("driver_username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("driver_password"));
        submitBtn.click();

    }
}
