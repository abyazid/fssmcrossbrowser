package com.fssm.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PendaftaranSyarikatPage
{
    private static WebDriver driver;

    // Constructor
    public PendaftaranSyarikatPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = ".fssm-icon.registration")
    public WebElement pendaftaranPermohonanMenu;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Pendaftaran')]")
    public WebElement pendaftaranMenu;

    @FindBy(how = How.CSS, using = "i.fa-list-ul")
    public WebElement listViewToggle;

    // Pendaftaran menu container (Syarikat, Premis, Daftar Agen)
    @FindBy(how = How.CSS, using = "div.module-container > ul > li")
    public WebElement menuContainer;

    // Syarikat Tab Container
    @FindBy(how = How.CSS, using = ".tab-container > ul.nav-tabs")
    public WebElement syarikatTabContainer;

    // Pendaftaran tab
    @FindBy(how = How.CSS, using = "ul.nav-tabs > li.nav-item:nth-child(2)")
    public WebElement pendaftaranTab;


    /**
     * Maklumat Syarikat web elements
     */

    // Pilihan Pendaftaran drop down menu
    @FindBy(how = How.NAME, using = "refRegistrationType")
    public WebElement pilihanPendaftaranDropDown;

    // No. Pendaftaran Syarikat web element
    @FindBy(how = How.ID, using = "compRegistrationNo")
    public WebElement compRegistrationNo;

    // Nama Syarikat web element
    @FindBy(how = How.ID, using = "compName")
    public WebElement compName;

    // Company address, postcode, city, state web elements
    @FindBy(how = How.NAME, using = "_address1_")
    public WebElement compContacts_address1;

    @FindBy(how = How.NAME, using = "_address2_")
    public WebElement compContacts_address2;

    @FindBy(how = How.NAME, using = "_address3_")
    public WebElement compContacts_address3;

    @FindBy(how = How.NAME, using = "_postcode_")
    public WebElement compContacts_postcode;

    @FindBy(how = How.NAME, using = "_city_")
    public WebElement compContacts_city;

    // State drop-down element
    @FindBy(how = How.NAME, using = "_state_")
    public WebElement compContacts_state;

    // District drop-down element
    @FindBy(how = How.NAME, using = "_district_")
    public WebElement compContacts_district;

    // Company email address, phone and fax web elements
    @FindBy(how = How.NAME, using = "_email_")
    public WebElement compContacts_email;

    @FindBy(how = How.NAME, using = "_otherPhone_")
    public WebElement compContacts_otherPhone;

    @FindBy(how = How.NAME, using = "_fax_")
    public WebElement compContacts_fax;

    @FindBy(how = How.ID, using = "fullNameOwner")
    public WebElement ownerName;

    @FindBy(how = How.ID, using = "_identificationType")
    public WebElement identificationType;

    @FindBy(how = How.ID, using = "_identityNo")
    public WebElement identificationNo;

    @FindBy(how = How.NAME, using = "emailOwner")
    public WebElement emailOwner;

    @FindBy(how = How.NAME, using = "confirmEmailOwner")
    public WebElement emailOwnerConfirm;

    @FindBy(how = How.NAME, using = "mobileNoOwner")
    public WebElement mobileNoOwner;

    @FindBy(how = How.NAME, using = "confirmMobileNoOwner")
    public WebElement confirmMobileNoOwner;

    //Maklumat Pengguna

    @FindBy(how = How.NAME, using = "fullName")
    public WebElement fullName;

    @FindBy(how = How.NAME, using = "contactInfo_identificationType")
    public WebElement contactInfo_identificationType;

    @FindBy(how = How.NAME, using = "contactInfo_identityNo")
    public WebElement contactInfo_identityNo;

    @FindBy(how = How.NAME, using = "email")
    public WebElement email;

    @FindBy(how = How.NAME, using = "confirmEmail")
    public WebElement confirmEmail;

    @FindBy(how = How.ID, using = "_mobilePhone_")
    public WebElement companyMobileNum;

    @FindBy(how = How.NAME, using = "mobileNo")
    public WebElement mobileNo;

    @FindBy(how = How.NAME, using = "confirmMobileNo")
    public WebElement confirmMobileNo;

    // Footer web element
    @FindBy(how = How.XPATH, using = "//*[@class='modal-content']//form[@class='ng-dirty ng-touched ng-valid']/child::div[@class='modal-footer']/child::button[2]")
    public WebElement modalContent;

    @FindBy(how = How.CSS, using = ".btn-secondary btn-back")
    public WebElement btnKembali;

    public static By btnSimpanPengguna = By.xpath("//button[@text='Simpan']");

    // Button Tambah Maklumat Pengguna
    @FindBy(how = How.CSS, using = ".btn-custom")
    public WebElement buttonAddUser;

    // Kategori Syarikat Checkbox
    @FindBy(how = How.NAME, using = "categories")
    public WebElement agenPenghantarCheckbox;

    @FindBy(how = How.CSS, using = ".sub-list-tree li:nth-child(2) .sub-checkbox")
    public WebElement konsultanCheckbox;

    @FindBy(how = How.CSS, using = ".sub-list-tree li:nth-child(3) .sub-checkbox")
    public WebElement lainlainCheckbox;

    @FindBy(how = How.CSS, using = ".sub-list-tree li:nth-child(4) .sub-checkbox")
    public WebElement middlemanCheckbox;

    @FindBy(how = How.CSS, using = ".sub-list-tree li:nth-child(5) .sub-checkbox")
    public WebElement pembekalCheckbox;

    @FindBy(how = How.CSS, using = ".sub-list-tree li:nth-child(6) .sub-checkbox")
    public WebElement pengedarCheckbox;

    @FindBy(how = How.CSS, using = ".sub-list-tree li:nth-child(7) .sub-checkbox")
    public WebElement pengeksportCheckbox;

    @FindBy(how = How.CSS, using = ".sub-list-tree li:nth-child(8) .sub-checkbox")
    public WebElement pengilangCheckbox;

    @FindBy(how = How.CSS, using = ".sub-list-tree li:nth-child(9) .sub-checkbox")
    public WebElement pengimportCheckbox;

    @FindBy(how = How.CSS, using = ".sub-list-tree li:nth-child(10) .sub-checkbox")
    public WebElement traderCheckbox;

    //    Muat Naik Dokumen
    @FindBy(how = How.ID, using = "file")
    public WebElement attachmentUpload;

    /**
     * Maklumat Pemilik Web Elements
     */
    @FindBy(how = How.ID, using = "compOwnerName")
    public WebElement compOwnerName;

    // Identity type drop-down web element
    @FindBy(how = How.ID, using = "compOwnerIdentity_identificationType")
    public WebElement compOwnerIdentity_identificationType;

    @FindBy(how = How.ID, using = "compOwnerIdentity_identityNo")
    public WebElement compOwnerIdentity_identityNo;

    @FindBy(how = How.ID, using = "compOwnerEmail")
    public WebElement compOwnerEmail;

    @FindBy(how = How.ID, using = "compOwnerEmailConfirm")
    public WebElement compOwnerEmailConfirm;

    @FindBy(how = How.ID, using = "compOwnerPhone")
    public WebElement compOwnerPhone;

    @FindBy(how = How.ID, using = "compOwnerPhoneConfirm")
    public WebElement compOwnerPhoneConfirm;

    /**
     * Maklumat Syarikat Pengesahan web elements
     */

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[1]//following-sibling::div[1]//following-sibling::p")
    public WebElement compRegNoValue;

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[1]//following-sibling::div[2]//following-sibling::p")
    public WebElement compNameValue;

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[1]//following-sibling::div[3]//following-sibling::p")
    public WebElement compAddressValue;

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[1]//following-sibling::div[4]//following-sibling::p")
    public WebElement compEmailValue;

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[1]//following-sibling::div[5]//following-sibling::p")
    public WebElement compPhoneNoValue;

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[1]//following-sibling::div[5]//following-sibling::p[2]")
    public WebElement compFaxNoValue;

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[2]//following-sibling::div[1]//following-sibling::p")
    public WebElement compOwnerNameValue;

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[2]//following-sibling::div[2]//following-sibling::p")
    public WebElement compOwnerIdentityValue;

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[2]//following-sibling::div[3]//following-sibling::p")
    public WebElement compOwnerEmailValue;

    @FindBy(how = How.XPATH, using = "//step[@title='Pengesahan']//descendant::fieldset[2]//following-sibling::div[4]//following-sibling::p")
    public WebElement compOwnerMobileNoValue;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='verify']")
    public WebElement pengesahanCheckBox;

    /**
     * Kategori Syarikat web elements
     */
    @FindBy(how = How.CSS, using = "ul.sub-list-tree")
    public WebElement compCategoryTree;


    /**
     * Public methods
     */
    public void selectPendaftaranTab() {
        syarikatTabContainer.findElement(By.cssSelector("li.nav-item:nth-child(2)"));
    }

    public void selectPilihanPendaftaran(String option) {
        Select regType = new Select(pilihanPendaftaranDropDown);
        regType.selectByVisibleText(option);
    }

    public void selectState(String stateName) {
        Select state = new Select(compContacts_state);
        state.selectByVisibleText(stateName);
    }

    public void selectDistrict(String districtName) {
        Select district = new Select(compContacts_district);
        district.selectByVisibleText(districtName);
    }

    public void selectKategoriSyarikat(String category) {
        WebElement chkbox = driver.findElement(By.xpath(
                "//input[@name='categories']/ancestor::span[@class='sub-checkbox']/child::*[contains(text(),'PENGILANG')]"
        ));
        chkbox.click();
    }


    // Static variables
    public static By syarikatLink = By.cssSelector("ul > li.nav-item:nth-child(1)");
    public static By premisLink = By.cssSelector("ul > li.nav-item:nth-child(2)");
    public static By daftarAgenLink = By.cssSelector("ul > li.nav-item:nth-child(3)");
    //public static By pendaftaranTab = By.cssSelector(".nav-item:nth-child(2)");
    public static By carianTab = By.cssSelector(".nav-item:nth-child(1)");
    public static By compCategoryCheckbox = By.cssSelector(".sub-checkbox > input");
    public static By catFactory = By.cssSelector("li:nth-child(1)");
    public static By catDistributor = By.cssSelector("li:nth-child(2)");
    public static By catExporter = By.cssSelector("li:nth-child(3)");
    public static By catImporter = By.cssSelector("li:nth-child(4)");
    public static By catAgentDist = By.cssSelector("li:nth-child(5)");
    public static By catConsultant = By.cssSelector("li:nth-child(6)");
    public static By catSupplier = By.cssSelector("li:nth-child(7)");
    public static By catMiddleman = By.cssSelector("li:nth-child(8)");
    public static By catTrader = By.cssSelector("li:nth-child(9)");
    public static By catOthers = By.cssSelector("li:nth-child(10)");
}
