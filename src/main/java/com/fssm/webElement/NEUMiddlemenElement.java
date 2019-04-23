package com.fssm.webElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NEUMiddlemenElement {
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Eksport']")
    public WebElement eksportMenu;

    @FindBy(how = How.CSS, using = ".nav-item:nth-child(5) > .list-unstyled > .nav-item:nth-child(1) > .nav-link")
    public WebElement middlemenLink;

    @FindBy(how = How.XPATH, using = "//*[contains(class(),'form-control')]")
    public WebElement namaSyarikat;

    @FindBy(how = How.NAME, using = "country")
    public WebElement importingCountry;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='noOfworkers']")
    public WebElement numberOfWorkers;

    @FindBy(how = How.XPATH, using = "//button[@text='Add Workers']")
    public WebElement btnAddWorkers;

    @FindBy(how = How.NAME, using = "name")
    public WebElement name;

    @FindBy(how = How.NAME, using = "representativeIdentification_identificationType")
    public WebElement identityType;

    @FindBy(how = How.NAME, using = "representativeIdentification_identityNo")
    public WebElement identityNo;

    @FindBy(how = How.XPATH, using = "//*[@text='Simpan']")
    public WebElement btnSimpan;

    @FindBy(how = How.XPATH, using = "//*[@text()='Kembali']")
    public WebElement btnKembali;

    @FindBy(how = How.XPATH, using = "//*[@text='Add Supplier and Type of Raw Material']")
    public WebElement btnAddSupplierAndTypeOfRawMaterial;

    @FindBy(how = How.NAME, using = "chooseSupplier")
    public WebElement supplier;

    @FindBy(how = How.CSS, using = "")
    public WebElement tambahMaklumatPenyenaraianTab;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='regNo']")
    public WebElement registrationNo;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='farmName']")
    public WebElement farmName;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='ownerName']")
    public WebElement ownerName;

    @FindBy(how = How.ID, using = "contactInfo_address1_")
    public WebElement alamat1;

    @FindBy(how = How.ID, using = "contactInfo_address2_")
    public WebElement alamat2;

    @FindBy(how = How.ID, using = "contactInfo_address3_")
    public WebElement alamat3;

    @FindBy(how = How.ID, using = "contactInfo_postcode_")
    public WebElement poskod;

    @FindBy(how = How.ID, using = "contactInfo_city_")
    public WebElement bandar;

    @FindBy(how = How.ID, using = "contactInfo_state_")
    public WebElement negeri;

    @FindBy(how = How.ID, using = "contactInfo_district_")
    public WebElement daerah;

    @FindBy(how = How.ID, using = "contactInfo_mobilePhone_")
    public WebElement noTelefonBimbit;

    @FindBy(how = How.ID, using = "contactInfo_otherPhone_")
    public WebElement noTelefonPejabat;

    @FindBy(how = How.ID, using = "expiryDate")
    public WebElement expiryDate;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='saab']")
    public WebElement hasSAAB;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='splm']")
    public WebElement hasSPLM;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='dofStatus']")
    public WebElement DOFStatus;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='sps']")
    public WebElement hasSPS;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='remarks']")
    public WebElement remarks;

    @FindBy(how = How.XPATH, using = "//*[@text='Hantar']")
    public WebElement btnHantar;

    @FindBy(how = How.XPATH, using = "//*[@text='Set Semula']")
    public WebElement btnSetSemula;

    @FindBy(how = How.NAME, using = "selectedAquacultureFarm")
    public  WebElement selectedAquacultureFarmList;

    @FindBy(how = How.NAME, using = "rawMaterial")
    public WebElement typeOfRawMaterial;

    @FindBy(how = How.NAME, using = "typeContainer")
    public WebElement typeContainer;

    @FindBy(how = How.NAME, using = "usageIce")
    public WebElement usageIce;

    @FindBy(how = How.NAME, using = "nameImporter")
    public WebElement nameImporter;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='address1']")
    public WebElement address1_importer;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='address2']")
    public WebElement address2_importer;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='address3']")
    public WebElement address3_importer;

    @FindBy(how = How.ID, using = "postcode")
    public WebElement postcode_importer;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='country']")
    public WebElement country_importer;

    @FindBy(how = How.NAME, using = "rawMaterial")
    public WebElement typeOfRawMaterial_importer;

    @FindBy(how = How.NAME, using = "typeContainer")
    public WebElement typeOfContainerUsedToStoreFisheryRawMaterial;

    @FindBy(how = How.NAME, using = "usageIce")
    public WebElement usageOfIce_importer;

    @FindBy(how = How.XPATH, using = "//button[@text()='Add Fish Collection Centre']")
    public WebElement btnAddFishCollectionCentre;

    @FindBy(how = How.CSS, using = "")
    public WebElement permohonanBaruTab;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='regNo']")
    public WebElement registrationNo_fishLandingSite;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='fishSiteName']")
    public WebElement siteName_fishLandingSite;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='ownerName']")
    public WebElement ownerName_fishLandingSite;

    @FindBy(how = How.ID, using = "contactInfo_address1_")
    public WebElement alamat1_fishLandingSite;

    @FindBy(how = How.ID, using = "contactInfo_address2_")
    public WebElement alamat2_fishLandingSite;

    @FindBy(how = How.ID, using = "contactInfo_postcode_")
    public WebElement poskod_fishLandingSite;

    @FindBy(how = How.ID, using = "contactInfo_city_")
    public WebElement bandar_fishLandingSite;

    @FindBy(how = How.ID, using = "contactInfo_state_")
    public WebElement negeri_fishLandingSite;

    @FindBy(how = How.ID, using = "contactInfo_district_")
    public WebElement daerah_fishLandingSite;

    @FindBy(how = How.ID, using = "contactInfo_mobilePhone_")
    public WebElement noTelefonBimbit_fishLandingSite;

    @FindBy(how = How.ID, using = "contactInfo_otherPhone_")
    public WebElement notelefonPejabat_fishLandingSite;

    @FindBy(how = How.ID, using = "expiryDate")
    public WebElement expiryDate_fishLandingSite;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='lkimStatus']")
    public WebElement lkimStatus_fishLandingSite;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='remarks']")
    public WebElement remarks_fishLandingSite;

    @FindBy(how = How.NAME, using = "selectedFishLandingSite")
    public WebElement selectFishLandingSiteList;

    @FindBy(how = How.XPATH, using = "//button[@text()='Add Vehicle']")
    public WebElement btnAddVehicle;

    @FindBy(how = How.NAME, using = "typeVehicle")
    public WebElement typeOfTransportVehicle;

    @FindBy(how = How.NAME, using = "noTransportVehicle")
    public WebElement registrationNoTransportVehicle;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='verify']")
    public WebElement pengesahanCheckBox;
}
