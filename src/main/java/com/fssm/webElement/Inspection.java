package com.fssm.webElement;

import org.openqa.selenium.By;

public class Inspection {

    public static By carianPemeriksaanTab = By.xpath("//span[text()='Carian Pemeriksaan']");
    public static By carianPremisTab = By.xpath("//span[text()='Carian Premis']");
    public static By maklumatPemeriksaanPremisTab = By.xpath("//span[text()='Maklumat Pemeriksaan Premis']");
    public static By expandArrowBtn = By.cssSelector("");

    /**
     * Modal window
     */
    public static By inspectionModalBody = By.cssSelector("body > modal-container");
    public static By infomationTabEl = By.cssSelector(".nav-tabs > li a.nav-link span");
    // Maklumat Syarikat dan Premis
    public static By maklumatPremisLable = By.cssSelector(".panel-collapse .panel-body simple-premise-info .form-group.row .form-control-label");
    public static By maklumatPremisData = By.cssSelector(".panel-collapse .panel-body simple-premise-info .form-group.row");
    public static By collapseData = By.cssSelector(".collapse.in.show .panel-body .form-group.row p.col-12.form-control-static.text-uppercase");
    public static By panelTitle = By.cssSelector("inspection-premise-details div .panel-group .panel.panel-open .panel.card.panel-default .panel-heading.card-header .panel-title");
    public static By panelClose = By.cssSelector("inspection-premise-details div accordion-group.panel");

}
