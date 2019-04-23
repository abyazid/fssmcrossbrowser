package com.fssm.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UAPLogin {

    @FindBy(how = How.ID, using = "password-href")
    public WebElement UAPUsingPasswordIcon;

    @FindBy(how = How.ID, using = "userid")
    public WebElement UAPUserId;

    @FindBy(how = How.NAME, using = "fetchID")
    public WebElement userIdNextBtn;

    @FindBy(how = How.ID, using = "password")
    public WebElement passwordTxtBox;

    @FindBy(how = How.NAME, using = "login")
    public WebElement loginBtn;

    public static By UAPPasswordIcon = By.id("password-href");
    public static By UAPUserIdTxtBox = By.id("userid");
    public static By UAPNextBtn = By.name("fetchID");
    public static By UAPPasswordTxtBox = By.id("password");
    public static By UAPLoginBtn = By.name("login");

    public UAPLogin(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void UAPUserLogin(String username, String password)
    {
        UAPUsingPasswordIcon.click();
        UAPUserId.sendKeys(username);
        userIdNextBtn.click();
        passwordTxtBox.sendKeys(password);
        loginBtn.click();
    }

}
