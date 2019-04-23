package com.fssm.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PendaftaranElement {

    @FindBy(how = How.ID, using = "fullname")
    private WebElement namaPenuhTextBox;

    @FindBy(how = How.ID, using = "_identificationType")
    private WebElement identityType;

    public static By namaPenuhTxtBox = By.name("fullname");
    public static By identityElement = By.id("_identificationType");
    public static By identityNumTxtBox = By.id("identityNo");
    public static By emailTxtBox = By.id("email");
    public static By mobileNumTxtBox = By.id("mobileNo");
    public static By nextBtn = By.cssSelector(".col-12 > .btn-primary.pull-right");

    public PendaftaranElement(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
