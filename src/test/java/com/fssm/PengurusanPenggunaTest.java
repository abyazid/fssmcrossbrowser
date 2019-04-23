package com.fssm;

import com.fssm.webElement.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;

public class PengurusanPenggunaTest {

    // Page Factory class
    MainPageElement mainPageElement;
    WebDriverWait wait;
    UAPLogin uapLogin;
    CommonElement common;
    Portal portal;
    PengurusanPengunaPage pengunaPage;

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        uapLogin = PageFactory.initElements(driver, UAPLogin.class);
        mainPageElement = PageFactory.initElements(driver, MainPageElement.class);
        portal = PageFactory.initElements(driver, Portal.class);
        pengunaPage = PageFactory.initElements(driver, PengurusanPengunaPage.class);

        // Set wait time
        wait = new WebDriverWait(driver, 30, 100);

        // Navigate to FSSM URL
        driver.manage().window().maximize();
        try {
            driver.get(CommonElement.uatURL);
            wait.until(ExpectedConditions
                    .visibilityOf(mainPageElement.fssmLogoBrand));
        } catch (Exception e) {
            Assert.fail("Fail to load FSSM landing page");
        }

         /*
         Wait for the login button to be displayed before click action
         */
        try {
            wait.until(ExpectedConditions.
                    visibilityOf(mainPageElement.userLoginBtn));
            mainPageElement.userLoginBtn.click();
        } catch (Exception e) {
            Assert.fail("Unable to find User Login Btn");
        }

        /*
         Wait for UAP password icon to be loaded
         */
        try {
            wait.until(ExpectedConditions
                    .visibilityOf(uapLogin.UAPUsingPasswordIcon));
            uapLogin.UAPUserLogin("fssmtestuser", "ZAQ!2wsx");
        } catch(Exception e) {
            Assert.fail("Unable to load page UAP login");
        }

        /*
         Perform assertion
         */
        wait.until(ExpectedConditions
                .visibilityOf(portal.dashboardBtn));
        Assert.assertThat(true, is(portal.dashboardPageTitle.isDisplayed()));

    }

    //@AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void createUserRoleTest()
    {
        /*
         Navigate to Pendaftaran Pengguna page
         */
        wait.until(ExpectedConditions
            .visibilityOf(portal.userManagementBtn));
        portal.pendaftaranPenggunaPage();

        /*
         Navigate to Pendaftaran Penggguna section
         */
        pengunaPage.pendaftaranPenggunaTab.click();

    }

}
