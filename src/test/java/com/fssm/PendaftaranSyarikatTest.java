package com.fssm;

import com.fssm.webElement.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;

public class PendaftaranSyarikatTest {

    // Page Factory class
    MainPageElement mainPageElement;
    WebDriverWait wait;
    UAPLogin uapLogin;
    CommonElement common;
    Portal portal;
    PendaftaranSyarikatPage pendaftaranSyarikatPage;

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();

        uapLogin = PageFactory.initElements(driver, UAPLogin.class);
        mainPageElement = PageFactory.initElements(driver, MainPageElement.class);
        portal = PageFactory.initElements(driver, Portal.class);
        pendaftaranSyarikatPage = new PendaftaranSyarikatPage(driver);

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

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {

        return new Object[][] {{"fssmmobile_01@yopmail.com", "ZAQ!2wsx"}};

    }


    @Test
    public void daftarSyarikat() {
        /*
         Navigate to Pendaftaran Permohonan menu
         */
        portal.pendaftaranPermohonan.click();
        wait.until(ExpectedConditions
            .visibilityOf(portal.pendaftaranSyarikat));
        portal.viewAsList.click();
        portal.pendaftaranSyarikat.click();
        wait.until(ExpectedConditions
            .visibilityOf(pendaftaranSyarikatPage.pendaftaranTab));
        pendaftaranSyarikatPage.pendaftaranTab.click();

        /**
         * Maklumat Syarikat registration section
         */

        // Select Pilihan Pendaftaran
        pendaftaranSyarikatPage.selectPilihanPendaftaran("SSM");

        // Enter Company Registration number
        pendaftaranSyarikatPage.compRegistrationNo.sendKeys("");

        // Enter Nama Syarikat
        pendaftaranSyarikatPage.compName.sendKeys("Syarikat ABC");

        // Fill in Maklumat Untuk Dihubungi textboxes
        pendaftaranSyarikatPage.compContacts_address1.sendKeys("No 6");
        pendaftaranSyarikatPage.compContacts_address2.sendKeys("Jalan 14/50");
        pendaftaranSyarikatPage.compContacts_address3.sendKeys("PJ");
        pendaftaranSyarikatPage.compContacts_postcode.sendKeys("46100");
        pendaftaranSyarikatPage.compContacts_city.sendKeys("PETALING JAYA");

        // Select State and District
        pendaftaranSyarikatPage.selectState("JOHOR");
        pendaftaranSyarikatPage.selectDistrict("JOHOR BAHRU");

        // Enter email address
        pendaftaranSyarikatPage.compContacts_email.sendKeys("kerry@yopmail.com");

        // Enter company mobile number
        pendaftaranSyarikatPage.companyMobileNum.sendKeys(" 012 778 2008");

        // Enter company office phone number
        pendaftaranSyarikatPage.compContacts_otherPhone.sendKeys(" 06 787 72500");

        // Enter company office fax number
        pendaftaranSyarikatPage.compContacts_fax.sendKeys(" 06 787 72501");

        // Select Kategori Syarikat
        pendaftaranSyarikatPage.selectKategoriSyarikat("pengilang");




    }


}
