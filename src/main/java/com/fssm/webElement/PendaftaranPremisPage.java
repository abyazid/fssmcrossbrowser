package com.fssm.webElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PendaftaranPremisPage {

    @FindBy(how = How.XPATH, using = "//*[@text()='P0-PREMIS TIDAK RASMI']/following::input")
    public WebElement p0;
    @FindBy(how = How.XPATH, using = "//*[@text()='BAZAR RAMADHAN']/following::input")
    public WebElement bazarRamadhan;
    @FindBy(how = How.XPATH, using = "//*[@text()='COLDSTORAGE']/following::input")
    public WebElement coldStorage;
    @FindBy(how = How.XPATH, using = "//*[@text()='GUDANG']/following::input")
    public WebElement gudang;
    @FindBy(how = How.XPATH, using = "//*[@text()='GUDANG BERAS, GULA, TEPUNG(SELAIN GUDANG DI KILANG MAKANAN)']/following::input")
    public WebElement gudangBerasGulaTepung;
    @FindBy(how = How.XPATH, using = "//*[@text()='HYPERMARKET']/following::input")
    public WebElement hypermarket;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI ATAU GERAI BUAH']/following::input")
    public WebElement kedaiataugeraibuah;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI ATAU GERAI JUALAN DAGING SEGAR/SEJUK BEKU']/following::input")
    public WebElement kedaiataugeraidaging;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI ATAU GERAI MENJUAL IKAN SEGAR/SEJUK BEKU']/following::input")
    public WebElement kedaiataugeraiikan;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI ATAU GERAI MENJUAL REMPAH']/following::input")
    public WebElement kedaiataugeraurempah;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI ATAU GERAI SAYUR']/following::input")
    public WebElement kedaiataugeraisayur;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI ATAU STOR STOKIS MAKANAN']/following::input")
    public WebElement kedaiataustorstokismakanan;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI KOPERASI']/following::input")
    public WebElement kedaikoperasi;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI PEMBORONG/PENGEDAR PRODUK MAKANAN']/following::input")
    public WebElement kedangpemborongpengedarprodukmakanan;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI RAKYAT 1MALAYSIA']/following::input")
    public WebElement kedairakyat1malaysia;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI RUNCIT']/following::input")
    public WebElement kedairuncit;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI STESEN MINYAK']/following::input")
    public WebElement kedaistesenminyak;
    @FindBy(how = How.XPATH, using = "//*[@text()='KIOSK(PREMIS YANG TIDAK MENYEDIAKAN MAKANAN/PAPAR DAN BUNGKUS MAKANAN SIAP)']/following::input")
    public WebElement kiosk;
    @FindBy(how = How.XPATH, using = "//*[@text()='LAIN-LAIN']/following::input")
    public WebElement lainlain;
    @FindBy(how = How.XPATH, using = "//*[@text()='PASAR BASAH']/following::input")
    public WebElement pasarbasah;
    @FindBy(how = How.XPATH, using = "//*[@text()='PASAR KERING']/following::input")
    public WebElement pasarkering;
    @FindBy(how = How.XPATH, using = "//*[@text()='PASAR TANI, PASAR TAMU, PASAR MINGGU']/following::input")
    public WebElement pasantanitamuminggu;
    @FindBy(how = How.XPATH, using = "//*[@text()='PERAYAAN BERMUSIM (HARI RAYA AIDILADHA)']/following::input")
    public WebElement perayaanharirayaaidiladha;
    @FindBy(how = How.XPATH, using = "//*[@text()='PERAYAAN BERMUSIM (HARI RAYA AIDILFITRI)']/following::input")
    public WebElement perayaanharirayaaidilfitri;
    @FindBy(how = How.XPATH, using = "//*[@text()='PERAYAAN BERMUSIM (KRISMAS)']/following::input")
    public WebElement perayaankrismas;
    @FindBy(how = How.XPATH, using = "//*[@text()='PERAYAAN BERMUSIM (LAIN-LAIN)']/following::input")
    public WebElement perayaanlainlain;
    @FindBy(how = How.XPATH, using = "//*[@text()='PERAYAAN BERMUSIM (TAHUN BARU CINA)']/following::input")
    public WebElement perayaantahunbarucina;
    @FindBy(how = How.XPATH, using = "//*[@text()='PERAYAAN BERMUSIM (THAIPUSAM)']/following::input")
    public WebElement perayaanthaipusam;
    @FindBy(how = How.XPATH, using = "//*[@text()='PREMIS IRADIASI MAKANAN (PEBASMIAN)']/following::input")
    public WebElement premisiradiasimakanan;
    @FindBy(how = How.XPATH, using = "//*[@text()='PUSAT PENGUMPULAN SAYUR/BUAH']/following::input")
    public WebElement pusatpengumpulansayurbuah;
    @FindBy(how = How.XPATH, using = "//*[@text()='PUSAT PENGUMPULAN SUSU (MCC)-SIMPAN SAHAJA-TRANSIT']/following::input")
    public WebElement pusatpengumpulansusu;
    @FindBy(how = How.XPATH, using = "//*[@text()='RUMAH SEMBELIH AYAM/ITIK']/following::input")
    public WebElement rumahsembelihayamitik;
    @FindBy(how = How.XPATH, using = "//*[@text()='RUMAH SEMBELIH BABI']/following::input")
    public WebElement rumahsembelihbabi;
    @FindBy(how = How.XPATH, using = "//*[@text()='RUMAH SEMBELIH LEMBU/KAMBING DLL']/following::input")
    public WebElement rumahsembelihlembu;
    @FindBy(how = How.XPATH, using = "//*[@text()='STOR ATAU WAREHOUSE SYARIKAT PENGIMPORT']/following::input")
    public WebElement storatauwarehousesyarikatpengimport;
    @FindBy(how = How.XPATH, using = "//*[@text()='SUPERMARKET/MINIMARKET']/following::input")
    public WebElement supermarketminimarket;
    @FindBy(how = How.XPATH, using = "//*[@text()='P1-PREMIS MAKANAN YANG TERLIBAT DALAM PENGILANGAN MAKANAN']/following::input")
    public WebElement p1;
    @FindBy(how = How.XPATH, using = "//*[@text()='PREMIS MAKANAN YANG TERLIBAT DALAM PENGILANGAN MAKANAN']/following::input")
    public WebElement premismakananyangterlibatdalampengilanganmakanan;
    @FindBy(how = How.XPATH, using = "//*[@text()='P2-PREMIS MAKANAN YANG TERLIBAT DALAM KATERING ATAU KATERING MAKANAN BESAR-BESARAN']/following::input")
    public WebElement p2;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR ASRAMA SEKOLAH DI BAWAH KPM']/following::input")
    public WebElement dapurasramasekolahbawahkpm;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR ASRAMA SEKOLAH SELAIN KPM']/following::input")
    public WebElement dapurasramasekolahluarkpm;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR HOSPITAL KERAJAAN']/following::input")
    public WebElement dapurhospitalkerajaan;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR HOSPITAL SWASTA']/following::input")
    public WebElement dapurhospitalswasta;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR INSTITUSI POLIS']/following::input")
    public WebElement dapurinstitusipolis;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR KEM PLKN']/following::input")
    public WebElement dapurkemplkn;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR KEM TENTERA']/following::input")
    public WebElement dapurkemtentera;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR KOLEJ DAN INSTITUSI KKM']/following::input")
    public WebElement dapurkolejdaninstitusikkm;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR KOLEJ/IPTA / IPTS']/following::input")
    public WebElement dapurkolejiptaipts;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR PRA-SEKOLAH KERAJAAN (KEMAS / TABIKA / TADIKA / TASKA)']/following::input")
    public WebElement dapurprasekolahkerajaan;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR PRA-SEKOLAH SWASTA (TABIKA / TADIKA / TASKA)']/following::input")
    public WebElement dapurprasekolahswasta;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR PUSAT / RUMAH KEBAJIKAN KERAJAAN/SWASTA (ANAK YATIM/ORANG TUA/LAIN-LAIN)']/following::input")
    public WebElement dapurpusatrumahrkebajikankerajaanswasta;
    @FindBy(how = How.XPATH, using = "//*[@text()='DAPUR PUSAT TAHANAN DAN PENJARA (SERENTI DLL.)']/following::input")
    public WebElement dapurpusattahanandanpenjara;
    @FindBy(how = How.XPATH, using = "//*[@text()='KANTIN SEKOLAH KERAJAAN']/following::input")
    public WebElement kantinsekolahkerajaan;
    @FindBy(how = How.XPATH, using = "//*[@text()='KANTIN SEKOLAH SWASTA']/following::input")
    public WebElement kantinsekolahswasta;
    @FindBy(how = How.XPATH, using = "//*[@text()='KATERING MAKANAN BESAR-BESARAN']/following::input")
    public WebElement kateringmakananbesarbesaran;
    @FindBy(how = How.XPATH, using = "//*[@text()='PERKHIDMATAN KATERING']/following::input")
    public WebElement perkhidmatankatering;
    @FindBy(how = How.XPATH, using = "//*[@text()='PERKHIDMATAN KATERING PENERBANGAN AWAM']/following::input")
    public WebElement perkhidmatankateringpenerbanganawam;
    @FindBy(how = How.XPATH, using = "//*[@text()='P3-PREMIS DI MANA MAKANAN DISEDIA, DIPROSES, DISIMPAN DAN DIHIDANGKAN UNTUK JUALAN']/following::input")
    public WebElement p3;
    @FindBy(how = How.XPATH, using = "//*[@text()='GERAI MENJUAL MAKANAN DAN MINUMAN']/following::input")
    public WebElement geraimenjualmakanandanminuman;
    @FindBy(how = How.XPATH, using = "//*[@text()='GERAI MENJUAL MAKANAN DAN MINUMAN DI MEDAN SELERA']/following::input")
    public WebElement geraimenjualmakananminumanmedanselera;
    @FindBy(how = How.XPATH, using = "//*[@text()='GUDANG SELAIN GUDANG DI KILANG']/following::input")
    public WebElement gudangselaingudangdikilang;
    @FindBy(how = How.XPATH, using = "//*[@text()='KAFETARIA HOSPITAL KERAJAAN']/following::input")
    public WebElement kafeteriahospitalkerajaan;
    @FindBy(how = How.XPATH, using = "//*[@text()='KAFETARIA HOSPITAL SWASTA']/following::input")
    public WebElement kafeteriahospitalswasta;
    @FindBy(how = How.XPATH, using = "//*[@text()='KAFETARIA INSTITUSI KKM']/following::input")
    public WebElement kafeteriainstitusikkm;
    @FindBy(how = How.XPATH, using = "//*[@text()='KAFETARIA INSTITUSI POLIS & TENTERA( DARAT, LAUT, UDARA)']/following::input")
    public WebElement kafeteriainstitusipolistentera;
    @FindBy(how = How.XPATH, using = "//*[@text()='KAFETARIA KOLEJ/IPTA/IPTS']/following::input")
    public WebElement kafeteriakolejiptaipts;
    @FindBy(how = How.XPATH, using = "//*[@text()='KAFETARIA PEJABAT ATAU JABATAN']/following::input")
    public WebElement kafeteriapejabatjabatan;
    @FindBy(how = How.XPATH, using = "//*[@text()='KAFETERIA KILANG']/following::input")
    public WebElement kafeteriakilang;
    @FindBy(how = How.XPATH, using = "//*[@text()='KANTIN HOSPITAL DAN KLINIK KERAJAAN']/following::input")
    public WebElement kantinhospitaldanklinikkerajaan;
    @FindBy(how = How.XPATH, using = "//*[@text()='KANTIN HOSPITAL SWASTA']/following::input")
    public WebElement kantinhospitalswasta;
    @FindBy(how = How.XPATH, using = "//*[@text()='KANTIN KILANG']/following::input")
    public WebElement kantinkilang;
    @FindBy(how = How.XPATH, using = "//*[@text()='KANTIN KOLEJ/IPTA/IPTS']/following::input")
    public WebElement kantinkolejiptaipts;
    @FindBy(how = How.XPATH, using = "//*[@text()='KANTIN PEJABAT ATAU JABATAN']/following::input")
    public WebElement kantinpejabatataujabatan;
    @FindBy(how = How.XPATH, using = "//*[@text()='KANTIN SEKOLAH (RENDAH/MENENGAH)']/following::input")
    public WebElement kantinsekolahrendahmenengah;
    @FindBy(how = How.XPATH, using = "//*[@text()='KANTIN-KANTIN LAIN']/following::input")
    public WebElement kantinkantinlain;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI KOPI']/following::input")
    public WebElement kedaikopi;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI MAKAN']/following::input")
    public WebElement kedaimakan;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI MAKANAN SEGERA (KFC, SUGAR BUN, MCDONALD DLL)']/following::input")
    public WebElement kedaimakanansegera;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI MENJUAL AISKRIM']/following::input")
    public WebElement kedaimenjualaiskrim;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI ROTI DAN KEK']/following::input")
    public WebElement kedairotidankek;
    @FindBy(how = How.XPATH, using = "//*[@text()='KEDAI RUNCIT (ADA MENJUAL MAKANAN SEDIA DIMAKAN)']/following::input")
    public WebElement kedairuncitp3;
    @FindBy(how = How.XPATH, using = "//*[@text()='KIOSK (PREMIS YANG MENJUAL DAN MENYEDIAKAN MAKANAN)']/following::input")
    public WebElement kioskp3;
    @FindBy(how = How.XPATH, using = "//*[@text()='LOUNGE MINUMAN DI HOTEL & RESORT']/following::input")
    public WebElement loungeminumanduhotelresort;
    @FindBy(how = How.XPATH, using = "//*[@text()='PENJAJA MAKANAN (SELAIN BAZAR RAMADHAN& PRAPERAYAAN-PASAR MALAM, UPTOWN']/following::input")
    public WebElement penjajamakanan;
    @FindBy(how = How.XPATH, using = "//*[@text()='PENJAJA PRA-PERAYAAN (BAZAAR RAMADAN DLL)']/following::input")
    public WebElement penjajapraperayaan;
    @FindBy(how = How.XPATH, using = "//*[@text()='RESTORAN']/following::input")
    public WebElement restoran;
    @FindBy(how = How.XPATH, using = "//*[@text()='RESTORAN HOTEL & RESORT']/following::input")
    public WebElement restoranhotelresort;
    @FindBy(how = How.XPATH, using = "//*[@text()='P4-SEMUA KENDERAAN YANG MAKANAN SEDIA DIMAKAN DIJUAL']/following::input")
    public WebElement p4;
    @FindBy(how = How.XPATH, using = "//*[@text()='FOOD TRUCK']/following::input")
    public WebElement foodtruck;
    @FindBy(how = How.XPATH, using = "//*[@text()='KAPAL PERSIARAN']/following::input")
    public WebElement kapalpersiaran;
    @FindBy(how = How.XPATH, using = "//*[@text()='KERETAPI']/following::input")
    public WebElement keretapi;
    @FindBy(how = How.XPATH, using = "//*[@text()='LAIN-LAIN KENDERAAN']/following::input")
    public WebElement lainlainkenderaan;
    @FindBy(how = How.XPATH, using = "//*[@text()='PENJAJA RTE MENGGUNAKAN BASIKAL']/following::input")
    public WebElement penjajartebasikal;
    @FindBy(how = How.XPATH, using = "//*[@text()='PENJAJA RTE MENGGUNAKAN KERETA']/following::input")
    public WebElement penjajartekereta;
    @FindBy(how = How.XPATH, using = "//*[@text()='PENJAJA RTE MENGGUNAKAN LORI']/following::input")
    public WebElement penjajartelori;
    @FindBy(how = How.XPATH, using = "//*[@text()='PENJAJA RTE MENGGUNAKAN MOTOSIKAL']/following::input")
    public WebElement penjajartemotorsikal;
    @FindBy(how = How.XPATH, using = "//*[@text()='PENJAJA RTE MENGGUNAKAN SAMPAN/PERAHU']/following::input")
    public WebElement penjajartesampanperahu;
    @FindBy(how = How.XPATH, using = "//*[@text()='PENJAJA RTE MENGGUNAKAN VAN']/following::input")
    public WebElement penjajartevan;

    @FindBy(how = How.NAME, using = "comp")
    public WebElement syarikat;

    @FindBy(how = How.XPATH, using = "//button[@text()='Tambah Syarikat']")
    public WebElement btnTambahSyarikat;

    @FindBy(how = How.NAME, using = "compId")
    public WebElement syarikatList;

    @FindBy(how = How.NAME, using = "premiseSubCategoryInput")
    public  WebElement subKategoriSyarikat;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Simpan')]")
    public WebElement btnSimpan;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Kembali')]")
    public WebElement btnKembali;

    @FindBy(how = How.NAME, using = "premName")
    public WebElement namaPremis;

    @FindBy(how = How.NAME, using = "premIsSameCompanyAddress")
    public WebElement samaSepertiAlamatSyarikat;

    @FindBy(how = How.ID, using = "_address1_")
    public WebElement alamat1_maklumatPremis;

    @FindBy(how = How.ID, using = "_address2_")
    public WebElement alamat2_maklumatPremis;

    @FindBy(how = How.ID, using = "_address3_")
    public WebElement alamat3_maklumatPremis;

    @FindBy(how = How.ID, using = "_postcode_")
    public WebElement poskod;

    @FindBy(how = How.ID, using = "_city_")
    public WebElement bandar;

    @FindBy(how = How.ID, using = "_state_")
    public WebElement negeri;

    @FindBy(how = How.ID, using = "_district_")
    public WebElement daerah;

    @FindBy(how = How.ID, using = "_otherPhone_")
    public WebElement noTelefon;

    @FindBy(how = How.ID, using = "_fax_")
    public WebElement noFaks;

    @FindBy(how = How.NAME, using = "premLicenseNoPBT")
    public WebElement noLesenPihakBerkuasaTempatan;

    @FindBy(how = How.NAME, using = "pbt")
    public WebElement dikeluarkanOleh_pbt;

    @FindBy(how = How.NAME, using = "premLicenseOthers")
    public WebElement noLesenLainYangBerkaitan;

    @FindBy(how = How.ID, using = "document")
    public WebElement namaDokumen;

    @FindBy(how = How.ID, using = "file")
    public WebElement muatNaikIcon;

    @FindBy(how = How.ID, using = "fullName")
    public WebElement namaPemilikPremis;

    @FindBy(how = How.ID, using = "_identificationType")
    public WebElement jenisIdentiti;

    @FindBy(how = How.ID, using = "_identityNo")
    public WebElement noIdentiti;

    @FindBy(how = How.ID, using = "email")
    public WebElement alamatEmel;

    @FindBy(how = How.ID, using = "confirmEmailOwner")
    public WebElement pengesahanAlamatEmel;

    @FindBy(how = How.ID, using = "mobileNo")
    public WebElement noTelefonBimbit;

    @FindBy(how = How.ID, using = "confirmMobileNoOwner")
    public WebElement pengesahanNoTelefonBimbit;

    @FindBy(how = How.NAME, using = "premIsSamePremiseAddress")
    public WebElement samaSepertiAlamatPremis;

    @FindBy(how = How.XPATH, using = "//*[@text='Tambah Pengguna']")
    public WebElement btnTambahPengguna;

    @FindBy(how = How.NAME, using = "fullNameUser")
    public WebElement namaPenggunaDiBawahPremis;

    @FindBy(how = How.NAME, using = "contactInfoUser_identificationType")
    public WebElement jenisIdentitiPengguna;

    @FindBy(how = How.NAME, using = "contactInfoUser_identityNo")
    public WebElement noIdentitiPengguna;

    @FindBy(how = How.NAME, using = "emailUser")
    public WebElement emelPengguna;

    @FindBy(how = How.NAME, using = "confirmEmailUser")
    public WebElement pengesahanEmelPengguna;

    @FindBy(how = How.NAME, using = "mobileNoUser")
    public WebElement noTelefonBimbitPengguna;

    @FindBy(how = How.NAME, using = "confirmMobileNoUser")
    public WebElement pengesahanNoTelefonBimbitPengguna;

    @FindBy(how = How.XPATH, using = "//*[@text='DOMESTIK']/following::input")
    public WebElement pasaranDomestikCheckbox;

    @FindBy(how = How.XPATH, using = "//*[@text='EKSPORT']/following::input")
    public WebElement pasaranEksport;

    @FindBy(how = How.NAME, using = "pjkm")
    public WebElement maklumatPJKM;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Tambah Program']")
    public WebElement btnTambahProgram;

    @FindBy(how = How.NAME, using = "premiseSafetyId")
    public WebElement namaProgram;

    @FindBy(how = How.NAME, using = "issuesById")
    public WebElement dikeluarkanOleh;

    @FindBy(how = How.ID, using = "date")
    public WebElement tarikhDikeluarkan;

    @FindBy(how = How.NAME, using = "certificateNo")
    public WebElement noSijil;

    @FindBy(how = How.ID, using = "file")
    public WebElement lampirkanSalinanSijil;

    @FindBy(how = How.NAME, using = "premNoFoodHandlingForeign")
    public WebElement pengendaliMakananAsing;

    @FindBy(how = How.NAME, using = "premNoFoodHandlingLocal")
    public WebElement pengendaliMakananTempatan;

    @FindBy(how = How.XPATH, using = "//*[@text='Tambah Produk']")
    public WebElement btnTambahProduk;

    @FindBy(how = How.NAME, using = "productCategoryInput")
    public WebElement kategoriProduk;

    @FindBy(how = How.NAME, using = "productTypeInput")
    public WebElement jenisProduk;

    @FindBy(how = How.NAME, using = "countryInput")
    public WebElement negaraPengimport;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='verify']")
    public WebElement pengesahanCheckBox;

}
