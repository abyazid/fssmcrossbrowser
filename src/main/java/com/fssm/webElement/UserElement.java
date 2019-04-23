package com.fssm.webElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserElement {
    //    Find Element

    @FindBy(how = How.NAME, using = "fullName")
    public WebElement namaPengguna;

    @FindBy(how = How.ID, using = "mobileNoProfile")
    public WebElement noTelPengguna;

    @FindBy(how = How.ID, using = "_identificationType")
    public WebElement jenisIdPengguna;

    @FindBy(how = How.ID, using = "_identityNo")
    public WebElement noIdPengguna;

    @FindBy(how = How.ID, using = "_address1_")
    public WebElement alamat1;

    @FindBy(how = How.ID, using = "_address2_")
    public WebElement alamat2;

    @FindBy(how = How.ID, using = "_address3_")
    public WebElement alamat3;

    @FindBy(how = How.ID, using = "_postcode_")
    public WebElement poskod;

    @FindBy(how = How.ID, using = "_city_")
    public WebElement bandar;

    @FindBy(how = How.ID, using = "_state_")
    public WebElement negeri;

    @FindBy(how = How.ID, using = "_district_")
    public WebElement daerah;

    @FindBy(how = How.CSS, using = ".btn-custom:nth-child(2)")
    public WebElement kemaskiniPengguna;

    @FindBy(how = How.CSS, using = ".btn-success")
    public WebElement hantarKemaskiniPengguna;

    //    Static Variable

    //    Method
}
