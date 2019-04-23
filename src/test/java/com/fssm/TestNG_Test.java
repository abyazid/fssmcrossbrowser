package com.fssm;

import com.browserstack.BrowserStackTestNGTest;
import com.fssm.webElement.CommonElement;
import com.fssm.webElement.MainPageElement;
import com.fssm.webElement.Portal;
import com.fssm.webElement.UAPLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.hamcrest.CoreMatchers.is;

public class TestNG_Test extends BrowserStackTestNGTest {

    MainPageElement mainPageElement;
    WebDriverWait wait;
    UAPLogin uapLogin;
    CommonElement common;
    Portal portal;

    //WebDriver driver;
    private static int timeout = 60;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        uapLogin = PageFactory.initElements(driver, UAPLogin.class);
        mainPageElement = PageFactory.initElements(driver, MainPageElement.class);
        portal = PageFactory.initElements(driver, Portal.class);

        // Set wait time
        wait = new WebDriverWait(driver, timeout, 100);

        // Navigate to FSSM URL
        driver.manage().window().maximize();
        try {
            driver.get(CommonElement.uatURL);
            wait.until(ExpectedConditions
                    .visibilityOf(mainPageElement.fssmLogoBrand));
        } catch (Exception e) {
            Assert.fail("Fail to load FSSM landing page");
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void fssmLoginTest() {
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
            uapLogin.UAPUserLogin("fssmmobile@yopmail.com", "ZAQ!2wsx");
        } catch(Exception e) {
            Assert.fail("Unable to load page UAP login");
        }

        /* Perform assertion */

        //Navigate to UAT Dashboard
        wait.until(ExpectedConditions
                .visibilityOf(portal.dashboardBtn));
        portal.dashboardBtn.click();
        Assert.assertThat(true, is(portal.dashboardPageTitle.isDisplayed()));
    }


}
