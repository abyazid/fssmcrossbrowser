package com.fssm.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class MainPageElement
{

    @FindBy(how = How.CSS, using = ".navbar-nav > li a.icon-btn-login")
    public WebElement userLoginBtn;

    @FindBy(how = How.CSS, using = ".navbar-nav > li a.icon-btn-register")
    public WebElement registerBtn;

    @FindBy(how = How.CSS, using = ".nav-item > a > i.fa-caret-down")
    public WebElement username;

    @FindBy(how = How.CSS, using = "div.logo-brand > a.navbar-brand")
    public WebElement fssmLogoBrand;

    public static By loginBtn = By.cssSelector(".navbar-nav > li a.icon-btn-login");
    public static By daftarBtn = By.cssSelector(".navbar-nav > li a.icon-btn-register");
    public static By UAPPasswordIcon = By.cssSelector("");
    public static By UAPUserIdTxtBox = By.cssSelector("");
    public static By UAPNextBtn = By.cssSelector("");
    public static By UAPPasswordTxtBox = By.cssSelector("");
    public static By UAPLoginBtn = By.cssSelector("");
    public static By lamanUtamaLink = By.cssSelector("");
    public static By aksesAwamLink = By.cssSelector("");

    public MainPageElement(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
