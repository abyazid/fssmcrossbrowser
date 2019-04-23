package com.fssm.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Portal
{
    private WebDriverWait wait;
    private static int TIMEOUT = 30;

    public Portal(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    @FindBy(how = How.XPATH, using = "//*[contains(text(), 'Dashboard')]")
    public WebElement dashboardPageTitle;

    @FindBy(how = How.CSS, using = "a.nav-link > i.dashboard ")
    public WebElement dashboardBtn;

    @FindBy(how = How.CSS, using = ".nav-item > a > i.fa-caret-down")
    public WebElement userNameEl;

    @FindBy(how = How.CSS, using = "div.dropdown-menu > a > i.fa-lock")
    public WebElement logOutBtn;

    @FindBy(how = How.CSS, using = ".nav-item > a i.profile")
    public WebElement userProfile;

    @FindBy(how = How.CSS, using = "i.fssm-icon.user-management")
    public WebElement userManagementBtn;

    @FindBy(how = How.XPATH, using = "//a[@href='/fssmapp/app/portal/admin/usermanagement/user']")
    public WebElement pendaftaranPenggunanBtn;

    @FindBy(how = How.CSS, using = "div.card.user-management.card-internal > div.card-footer > button.btn-secondary")
    public WebElement internalUserNextBtn;

    /*
     Button to change view of pendaftaran & permohonan menu
     */
    @FindBy(how = How.CSS, using = "i.fa-list-ul")
    public WebElement viewAsList;

    @FindBy(how = How.XPATH, using = "//a[@href='/fssmapp/app/portal/registration']")
    public WebElement pendaftaranPermohonan;

    @FindBy(how = How.XPATH, using = "//li[@class='nav-item']/following::a[contains(text(), 'Syarikat')]")
    public WebElement pendaftaranSyarikat;


    //public static By userProfile = By.cssSelector(".nav-item > a i.profile");
    public static By pemeriksaan = By.cssSelector(".nav-item > a i.inspection");
    public static By pemeriksaanPremis = By.xpath("//span[text()='Pemeriksaan Premis']");
    public static By expandBtn = By.cssSelector(".accordion-toggle > div i.fa-chevron-right");
    public static By sideBarToggle = By.cssSelector(".nav-item > a.sidebar-toggler");
    public static By modalContainer = By.xpath("//div[@class='modal-header']");
    public static By modalElement = By.cssSelector(".modal-header > h4.text-uppercase");
    /**
     * Text field elements
     */
    public static By noPemeriksaanTxtField = By.id("InspectionNo_search-filter");
    public static By noPendaftaranPremis = By.id("premNoI_search-filter");
    public static By namaPremisTxtField = By.id("premNameI_search-filter");
    /**
     * Button elements
     */
    public static By setSemulaBtn = By. xpath("//button[text()='Set Semula']");
    public static By cariBtn = By.cssSelector(".btn-primary > i.fa-search");
    /**
     * Table elements
     */
    public static By inspectionSearchTable = By.xpath("//*[@id='InspectionSearchTable']");

    /**
     * Methods
     */
    public void userLogOut() {
        wait.until(ExpectedConditions
            .visibilityOf(dashboardPageTitle));
        userNameEl.click();
        logOutBtn.click();
    }

    /*
     Navigate to Pendaftaran Pengguna
     */
    public void pendaftaranPenggunaPage()
    {
        userManagementBtn.click();
        pendaftaranPenggunanBtn.click();
        wait.until(ExpectedConditions
            .visibilityOf(internalUserNextBtn));
        internalUserNextBtn.click();
    }
}
