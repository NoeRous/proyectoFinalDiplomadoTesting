package ui;

import org.openqa.selenium.By;

public class StepOneCreateQuotaAidPageUI {
    public static By procedureTypeSelect = By.xpath("//select[@name='procedure_type_id']");
    public static By modalitySelect = By.xpath("//select[@name='quota_aid_modality']");
    public static By requirementOneButton = By.xpath("//span[contains(text(),'Comprobante de depósito bancario o transferencia por concepto de adquisición de folder y formularios, en la cuenta fiscal de la MUSERPOL.')]");
    public static By requirementTwoButton = By.xpath("//span[contains(text(),'Formulario de verificación de requisitos con carácter de Declaración Jurada y solicitud a ser otorgado por la MUSERPOL a momento de inicio del trámite.')]");
    public static By requirementThreeButton = By.xpath("//span[contains(text(),'Cédula de Identidad del (la) titular en copia simple.')]");
    public static By requirementFourButton = By.xpath("//span[contains(text(),'Certificado de defunción del titular en original y actualizado, emitido por el SERECI.')]");
    public static By requirementFiveButton = By.xpath("//span[contains(text(),'Fotocopia simple y vigente de la Cédula de Identidad de los derechohabientes.')]");
    public static By requirementSixButton = By.xpath("//span[contains(text(),'Certificado de Matrimonio en original y actualizado, emitido por el SERECI.')]");
    public static By requirementSevenButton = By.xpath("//span[contains(text(),'Declaratoria de Herederos en original, emitida por Autoridad Competente.')]");
    public static By nextButton = By.xpath("//button[@class='wizard-btn']");
}
