package com.fssm.webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PengurusanPengunaPage {

    private WebDriverWait wait;
    private static int TIMEOUT = 30;

    public PengurusanPengunaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    /*
     Tab in Pendaftaran Pengguna Page
     */
    @FindBy(how = How.CSS, using = ".tab-container > ul.nav.nav-tabs > li:nth-child(2)")
    public WebElement pendaftaranPenggunaTab;
}