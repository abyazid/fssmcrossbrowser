package com.fssm.RegressionSuite;

import com.browserstack.BrowserStackTestNGTest;
import com.fssm.webElement.CommonElement;
import com.fssm.webElement.MainPageElement;
import com.fssm.webElement.Portal;
import com.fssm.webElement.UAPLogin;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.containsString;

public class FSSMLoginTest //extends BrowserStackTestNGTest
{
    MainPageElement mainPageElement;
    WebDriverWait wait;
    UAPLogin uapLogin;
    CommonElement common;
    Portal portal;

    WebDriver driver;
    private static int timeout = 60;

    @BeforeMethod
    public void setup() {

        driver = new PhantomJSDriver();

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

        /*
         Perform assertion
         */
        //Navigate to UAT Dashboard
        wait.until(ExpectedConditions
                .visibilityOf(portal.dashboardBtn));
        portal.dashboardBtn.click();
        Assert.assertThat(true, is(portal.dashboardPageTitle.isDisplayed()));
    }

    @Test
    public void logoutTest() {
        /*
         Wait for the login button to be displayed before click action
         */
        try {
            wait.until(ExpectedConditions.
                    visibilityOf(mainPageElement.userLoginBtn));
            mainPageElement.userLoginBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
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

        /*
         Navigate to dashboard and verify user land to dashboard
         */
        wait.until(ExpectedConditions
                .visibilityOf(portal.dashboardBtn));
        portal.dashboardBtn.click();
        Assert.assertThat(driver.getCurrentUrl(), containsString("/app/portal/home/i"));

        /*
         Logout action and validate user successfully logout
         */
        portal.userLogOut();
        try {
            wait.until(ExpectedConditions
                    .visibilityOf(mainPageElement.fssmLogoBrand));
            Assert.assertThat(driver.getCurrentUrl(), containsString("/fssm/public/logout"));
            Assert.assertThat(
                    driver.findElement(By.cssSelector("div.text-center > h1.font-weight-bold")).getText(),
                    is("Anda telah berjaya log keluar!"));
        } catch (Exception e) {
            Assert.fail("Fail to load FSSM logout page");
        }
    }

    @Test
    public void loginMissingInfoTest() {
        /*
         Wait for the login button to be displayed before click action
         */
        try {
            wait.until(ExpectedConditions.
                    visibilityOf(mainPageElement.userLoginBtn));
            mainPageElement.userLoginBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unable to find User Login Btn");
        }

        /*
         Wait for UAP password icon to be loaded
         */
        try {
            wait.until(ExpectedConditions
                    .visibilityOf(uapLogin.UAPUsingPasswordIcon));
            uapLogin.UAPUserLogin("aziera", "ZAQ!2wsx");
        } catch(Exception e) {
            Assert.fail("Unable to load page UAP login");
        }

        /*
         Perform Assertion
         */
        try {
            wait.until(ExpectedConditions
                    .visibilityOf(mainPageElement.fssmLogoBrand));
            // Get current URL
            String currURL = driver.getCurrentUrl();
            Assert.assertThat(currURL, containsString("/public/missing-info"));
        } catch (Exception e) {
            Assert.fail("Fail to load page");
            e.printStackTrace();
        }

        String text = driver.findElement(By.cssSelector("div.text-center > h1.font-weight-bold")).getText();
        Assert.assertThat("Rekod anda tiada dalam Aplikasi FSSM.", is(text));

    }

    @Test
    public void logMasukTidakAktif() {
        /*
         Wait for the login button to be displayed before click action
         */
        try {
            wait.until(ExpectedConditions.
                    visibilityOf(mainPageElement.userLoginBtn));
            mainPageElement.userLoginBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unable to find User Login Btn");
        }

        /*
         Wait for UAP password icon to be loaded
         */
        try {
            wait.until(ExpectedConditions
                    .visibilityOf(uapLogin.UAPUsingPasswordIcon));
            uapLogin.UAPUserLogin("fssmmobile_01@yopmail.com", "ZAQ!2wsx");
        } catch(Exception e) {
            Assert.fail("Unable to load page UAP login");
        }

        //Navigate to inactive account page
        //driver.get(CommonElement.inactiveURL);

        /*
         Perform Assertion
         */
        try {
            wait.until(ExpectedConditions
                    .visibilityOf(mainPageElement.fssmLogoBrand));
            // Get current URL
            String currURL = driver.getCurrentUrl();
            Assert.assertThat(currURL, containsString("/public/unactive"));
        } catch (Exception e) {
            Assert.fail("Fail to load page");
            e.printStackTrace();
        }

        String text = driver.findElement(By.cssSelector("div.text-center > h1.font-weight-bold")).getText();
        Assert.assertThat("Akaun anda tidak aktif.", is(text));

    }
}
