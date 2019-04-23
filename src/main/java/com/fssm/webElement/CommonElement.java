package com.fssm.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonElement
{
    @FindBy(how = How.CSS, using = "sidebar-toggler")
    public WebElement sideBarToggleBtn;

    // Footer web element
    @FindBy(how = How.CSS, using = "div.card-footer")
    public WebElement footer;

    /*
     form registration element
     */
    @FindBy(how = How.NAME, using = "fullName")
    public WebElement fullNameInput;

    @FindBy(how = How.NAME, using = "_identificationType")
    public WebElement identificationDropDown;

    @FindBy(how = How.NAME, using = "_identityNo")
    public WebElement identityNumber;

    @FindBy(how = How.ID, using = "email")
    public WebElement emailInput;



    // Static variables
    public static By simpanSementaraBtn = By.xpath("//*[text()='SIMPAN SEMENTARA']");
    public static By seterusnyaBtn = By.xpath("//button[contains(text(), 'SETERUSNYA')]");
    public static By hantarBtn = By.xpath("//*[text()='HANTAR']");


    public static String fssmURL = "https://10.1.6.189/fssm/public/home";
    public static String uatURL = "https://fssmuat.mimos.local/fssm/public/home";
    public static String dashboardURL = "https://fssmuat.mimos.local/fssmapp/app/portal/home/i";
    public static String inactiveURL = "https://fssmuat.mimos.local/fssm/public/unactive";

    public static List<WebElement> expandButton(WebDriver driver)
    {
        return driver.findElements(Portal.expandBtn);
    }
    public static List<WebElement> getTableColumn(WebElement table)
    {
        return table.findElements(By.tagName("th"));
    }
    public static List<WebElement> getTableRow(WebElement table)
    {
        return table.findElements(By.tagName("tr"));
    }
    public static List<WebElement> getCell(WebElement row)
    {
        return row.findElements(By.tagName("td"));
    }

    public CommonElement(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
