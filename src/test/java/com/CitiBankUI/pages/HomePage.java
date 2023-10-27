package com.CitiBankUI.pages;

import com.CitiBankUI.utility.ConfigurationReader;
import com.CitiBankUI.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Menu']")
    public WebElement menuButton;


    @FindBy( xpath = "//a[href='https://www.citi.com/banking/bank-accounts']")
    public WebElement openAccountButton;












}
