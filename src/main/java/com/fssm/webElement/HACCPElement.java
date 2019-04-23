package com.fssm.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HACCPElement {
    @FindBy(how = How.CSS, using = ".fssm-icon.registration")
    public WebElement pendaftaranPermohonanMenu;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Pensijilan')]")
    public WebElement pensijilanMenu;

    @FindBy(how = How.CSS, using = ".nav-item:nth-child(1) > .text-uppercase")
    public WebElement haccpLink;

    public static By pendaftaranTab = By.cssSelector(".tab-container > ul.nav-tabs > .nav-item:nth-child(2) > .nav-link > span");

    @FindBy(how = How.NAME, using = "premiseSubGroup")
    public WebElement namaPremisDropdown;

    @FindBy(how = How.NAME, using = "sameAddressWithPremise")
    public WebElement alamatPemprosesanRB;

    @FindBy(how = How.ID, using = "coordinator")
    public WebElement koordinator;

    @FindBy(how = How.ID, using = "position")
    public WebElement jawatan;

    @FindBy(how = How.ID, using = "email")
    public WebElement email;

    @FindBy(how = How.ID, using = "mobilePhone")
    public WebElement noTelefon;

    @FindBy(how = How.ID, using = "dateImplementHaccp")
    public WebElement tarikhPelaksanaanSistemHaccp;

    @FindBy(how = How.NAME, using = "isApplicationSirim")
    public WebElement aplikasiMelaluiSirim;

    @FindBy(how = How.NAME, using = "numberOfEmployee")
    public WebElement bilanganPekerja;

    @FindBy(how = How.NAME, using = "rangeIncome")
    public WebElement pulanganTahunanSyarikat;

    @FindBy(how = How.NAME, using = "reasonApplication")
    public WebElement reasonForApplication;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Tambah Produk')]")
    public  WebElement btnTambahProduk;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname ='premiseProduct']")
    public WebElement jenisProdukDropdown;

    @FindBy(how = How.NAME, using = "productName")
    public WebElement namaProduk;

    @FindBy(how = How.XPATH, using = "//*[@class='btn btn-secondary btn-add-field pull-left font-weight-bold btn-sm']")
    public WebElement btnTambahNamaProduk;

    @FindBy(how = How.NAME, using = "processingType")
    public WebElement jenisPemprosesanDropdown;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='productLabel']")
    public WebElement jenamaProduk;

    @FindBy(how = How.ID, using = "file")
    public WebElement cartaAlirPemprosesanProduk;

    @FindBy(how = How.XPATH, using = "//button[text()='Simpan']")
    public WebElement btnSimpanTambahProduk;

    @FindBy(how = How.XPATH, using = "//*[@class='modal-content']//form[@class='ng-dirty ng-touched ng-valid']/child::div[@class='modal-footer']/child::button[1]")
    public WebElement btnKembaliTambahProduk;

    @FindBy(how = How.XPATH, using = "//button[contains(class(),'btn btn-custom btn-info mb-q')]")
    public WebElement btnTambahOEM;

    @FindBy(how = How.NAME, using = "product")
    public WebElement produkDropdown;

    @FindBy(how = How.NAME, using = "companyName")
    public WebElement namaSyarikat;

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

    @FindBy(how = How.NAME, using = "productBrand")
    public WebElement jenamaProdukOEM;

    @FindBy(how = How.XPATH, using = "//*[@class='modal-content']//form[@class='ng-dirty ng-touched ng-valid']/child::div[@class='modal-footer']/child::button[2]")
    public WebElement btnSimpanTambahOEM;

    @FindBy(how = How.XPATH, using = "//*[@class='modal-content']//form[@class='ng-dirty ng-touched ng-valid']/child::div[@class='modal-footer']/child::button[1]")
    public WebElement btnKembaliTambahOem;

    @FindBy(how = How.ID, using = "document")
    public WebElement muatNaikDokumen;

    @FindBy(how = How.ID, using = "file")
    public WebElement muatNaikIcon;

    //    SEMAKAN KANDUNGAN MINIMUM MANUAL
    @FindBy(how = How.XPATH, using = "//*[@text='Company & Food Safety Policy']/following::input")
    public WebElement foodSafetyPolicy;

    @FindBy(how = How.XPATH, using = "//*[@text='Company Profile']/following::input")
    public WebElement companyProfile;

    @FindBy(how = How.XPATH, using = "//*[@text='Organisation Chart']/following::input")
    public WebElement organisationChart;

    @FindBy(how = How.XPATH, using = "//*[@text='Food Safety Management Policy']/following::input")
    public WebElement foodSafetyManagementPolicy;

    @FindBy(how = How.XPATH, using = "//*[@text='Plant Layout']/following::input")
    public WebElement plantLayout;

    @FindBy(how = How.XPATH, using = "//*[@text='HACCP Team & Responsibilities']/following::input")
    public WebElement haccpTeamResponsibility;

    @FindBy(how = How.XPATH, using = "//*[@text='Scope of HACCP Plan']/following::input")
    public WebElement scopeHaccpPlan;

    @FindBy(how = How.XPATH, using = "//*[@text='Food Safety Objective(s)']/following::input")
    public WebElement foodSafetyObjective;

    @FindBy(how = How.XPATH, using = "//*[@text='Product Description & Intended Consumer']/following::input")
    public WebElement productDescription;

    @FindBy(how = How.XPATH, using = "//*[@text='Process Flow Chart']/following::input")
    public WebElement processFlowChart;

    @FindBy(how = How.XPATH, using = "//*[@text='Hazard Analysis Worksheet']/following::input")
    public WebElement hazardAnalysisWorksheet;

    @FindBy(how = How.XPATH, using = "//*[@text='HACCP Plan Summary']/following::input")
    public WebElement haccpPlanSummary;

    @FindBy(how = How.XPATH, using = "//*[@text='Overall Verification Activities & Schedule']/following::input")
    public WebElement overallVerification;

    @FindBy(how = How.XPATH, using = "//*[@text='Summary of Pre-requisite Programmes']/following::input")
    public WebElement prerequisiteProgramSummary;

    @FindBy(how = How.XPATH, using = "//*[@text='Establishment: Design and Facilities']/following::input")
    public WebElement establishmentDesignFacilities;

    @FindBy(how = How.XPATH, using = "//*[@text='Location']/following::input")
    public WebElement location;

    @FindBy(how = How.XPATH, using = "//*[@text='Premises and rooms']/following::input")
    public WebElement premisesRooms;

    @FindBy(how = How.XPATH, using = "//*[@text='Equipment']/following::input")
    public WebElement equipment;

    @FindBy(how = How.XPATH, using = "//*[@text='Facilities']/following::input")
    public WebElement facilities;

    @FindBy(how = How.XPATH, using = "//*[@text='Control of Operation']/following::input")
    public WebElement controlOperation;

    @FindBy(how = How.XPATH, using = "//*[@text='Control of Food Hazards']/following::input")
    public WebElement controlFoodHazards;

    @FindBy(how = How.XPATH, using = "//*[@text='Key aspects of hygiene control systems']/following::input")
    public WebElement keyAspectHygieneControlSystem;

    @FindBy(how = How.XPATH, using = "//*[@text='Incoming Materials requirements']/following::input")
    public WebElement incomingMaterialRequirements;

    @FindBy(how = How.XPATH, using = "//*[@text='Recall procedures and traceability']/following::input")
    public WebElement recallProcedureTraceability;

    @FindBy(how = How.XPATH, using = "//*[@text='Packaging and storage']/following::input")
    public WebElement packagingStorage;

    @FindBy(how = How.XPATH, using = "//*[@text='Supplier assurance programme']/following::input")
    public WebElement supplierAssuranceProgramme;

    @FindBy(how = How.XPATH, using = "//*[@text='Water, steam and ice']/following::input")
    public WebElement waterSteamIce;

    @FindBy(how = How.XPATH, using = "//*[@text='Documentation and records']/following::input")
    public WebElement documentationsRecords;

    @FindBy(how = How.XPATH, using = "//*[@text='Customer feedback and complaints']/following::input")
    public WebElement customerFeedbackComplaints;

    @FindBy(how = How.XPATH, using = "//*[@text='Management and supervision']/following::input")
    public WebElement managementSupervision;

    @FindBy(how = How.XPATH, using = "//*[@text='Establishment : Maintenance and sanitation']/following::input")
    public WebElement maintenanceSanitation;

    @FindBy(how = How.XPATH, using = "//*[@text='Maintenance and cleaning']/following::input")
    public WebElement maintenanceCleaning;

    @FindBy(how = How.XPATH, using = "//*[@text='Cleaning programmes']/following::input")
    public WebElement cleaningProgrammes;

    @FindBy(how = How.XPATH, using = "//*[@text='Chemical control']/following::input")
    public WebElement chemicalControl;

    @FindBy(how = How.XPATH, using = "//*[@text='Waste Management']/following::input")
    public WebElement wasteMangement;

    @FindBy(how = How.XPATH, using = "//*[@text='Sanitation systems']/following::input")
    public WebElement sanitationSystem;

    @FindBy(how = How.XPATH, using = "//*[@text='Pest Control']/following::input")
    public WebElement pestControl;

    @FindBy(how = How.XPATH, using = "//*[@text='Establishment : Personal Hygiene']/following::input")
    public WebElement establishmentPersonalHygiene;

    @FindBy(how = How.XPATH, using = "//*[@text='Health Status']/following::input")
    public WebElement healthStatus;

    @FindBy(how = How.XPATH, using = "//*[@text='Illness and injuries']/following::input")
    public WebElement illnessInjuries;

    @FindBy(how = How.XPATH, using = "//*[@text='Personal cleanliness']/following::input")
    public WebElement personalCleanliness;

    @FindBy(how = How.XPATH, using = "//*[@text='Personal behaviour']/following::input")
    public WebElement personalBehaviour;

    @FindBy(how = How.XPATH, using = "//*[@text='Visitors and workmen']/following::input")
    public WebElement visitorsWorkmen;

    @FindBy(how = How.XPATH, using = "//*[@text='Transportation and Distribution']/following::input")
    public WebElement transportationDistribution;

    @FindBy(how = How.XPATH, using = "//*[@text='General']/following::input")
    public WebElement general;

    @FindBy(how = How.XPATH, using = "//*[@text='Requirements']/following::input")
    public WebElement requirement;

    @FindBy(how = How.XPATH, using = "//*[@text='Use and maintenance']/following::input")
    public WebElement useMaintenance;

    @FindBy(how = How.XPATH, using = "//*[@text='Product information and consumer awareness']/following::input")
    public WebElement productInformationConsumerAwareness;

    @FindBy(how = How.XPATH, using = "//*[@text='Batch Identification']/following::input")
    public WebElement batchIdentification;

    @FindBy(how = How.XPATH, using = "//*[@text='Product Information']/following::input")
    public WebElement productInformation;

    @FindBy(how = How.XPATH, using = "//*[@text='Labelling']/following::input")
    public WebElement labelling;

    @FindBy(how = How.XPATH, using = "//*[@text='Consumer Education']/following::input")
    public WebElement consumerEducation;

    @FindBy(how = How.XPATH, using = "//*[@text='Training']/following::input")
    public WebElement training;

    @FindBy(how = How.XPATH, using = "//*[@text='Awareness and responsibilities']/following::input")
    public WebElement awarenessResponsibility;

    @FindBy(how = How.XPATH, using = "//*[@text='Training programmes']/following::input")
    public WebElement trainingProgrammes;

    @FindBy(how = How.XPATH, using = "//*[@text='Industrion and supervision']/following::input")
    public WebElement industrionSupervision;

    @FindBy(how = How.XPATH, using = "//*[@text='Refresher training']/following::input")
    public WebElement refresherTraining;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='verify']")
    public WebElement pengesahanCheckBox;

}
