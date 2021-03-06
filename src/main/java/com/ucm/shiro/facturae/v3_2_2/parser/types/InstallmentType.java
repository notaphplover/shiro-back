//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.14 at 05:29:22 p. m. CET 
//


package com.ucm.shiro.facturae.v3_2_2.parser.types;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InstallmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstallmentDueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="InstallmentAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleTwoDecimalType"/>
 *         &lt;element name="PaymentMeans" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PaymentMeansType"/>
 *         &lt;element name="AccountToBeCredited" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AccountType" minOccurs="0"/>
 *         &lt;element name="PaymentReconciliationReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax60Type" minOccurs="0"/>
 *         &lt;element name="AccountToBeDebited" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AccountType" minOccurs="0"/>
 *         &lt;element name="CollectionAdditionalInformation" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type" minOccurs="0"/>
 *         &lt;element name="RegulatoryReportingData" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}RegulatoryReportingDataType" minOccurs="0"/>
 *         &lt;element name="DebitReconciliationReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax60Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentType", propOrder = {
    "installmentDueDate",
    "installmentAmount",
    "paymentMeans",
    "accountToBeCredited",
    "paymentReconciliationReference",
    "accountToBeDebited",
    "collectionAdditionalInformation",
    "regulatoryReportingData",
    "debitReconciliationReference"
})
public class InstallmentType {

    @XmlElement(name = "InstallmentDueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar installmentDueDate;
    @XmlElement(name = "InstallmentAmount")
    protected double installmentAmount;
    @XmlElement(name = "PaymentMeans", required = true)
    protected String paymentMeans;
    @XmlElement(name = "AccountToBeCredited")
    protected AccountType accountToBeCredited;
    @XmlElement(name = "PaymentReconciliationReference")
    protected String paymentReconciliationReference;
    @XmlElement(name = "AccountToBeDebited")
    protected AccountType accountToBeDebited;
    @XmlElement(name = "CollectionAdditionalInformation")
    protected String collectionAdditionalInformation;
    @XmlElement(name = "RegulatoryReportingData")
    protected String regulatoryReportingData;
    @XmlElement(name = "DebitReconciliationReference")
    protected String debitReconciliationReference;

    /**
     * Gets the value of the installmentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstallmentDueDate() {
        return installmentDueDate;
    }

    /**
     * Sets the value of the installmentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstallmentDueDate(XMLGregorianCalendar value) {
        this.installmentDueDate = value;
    }

    /**
     * Gets the value of the installmentAmount property.
     * 
     */
    public double getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * Sets the value of the installmentAmount property.
     * 
     */
    public void setInstallmentAmount(double value) {
        this.installmentAmount = value;
    }

    /**
     * Gets the value of the paymentMeans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * Sets the value of the paymentMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMeans(String value) {
        this.paymentMeans = value;
    }

    /**
     * Gets the value of the accountToBeCredited property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountToBeCredited() {
        return accountToBeCredited;
    }

    /**
     * Sets the value of the accountToBeCredited property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountToBeCredited(AccountType value) {
        this.accountToBeCredited = value;
    }

    /**
     * Gets the value of the paymentReconciliationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReconciliationReference() {
        return paymentReconciliationReference;
    }

    /**
     * Sets the value of the paymentReconciliationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReconciliationReference(String value) {
        this.paymentReconciliationReference = value;
    }

    /**
     * Gets the value of the accountToBeDebited property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountToBeDebited() {
        return accountToBeDebited;
    }

    /**
     * Sets the value of the accountToBeDebited property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountToBeDebited(AccountType value) {
        this.accountToBeDebited = value;
    }

    /**
     * Gets the value of the collectionAdditionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAdditionalInformation() {
        return collectionAdditionalInformation;
    }

    /**
     * Sets the value of the collectionAdditionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAdditionalInformation(String value) {
        this.collectionAdditionalInformation = value;
    }

    /**
     * Gets the value of the regulatoryReportingData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatoryReportingData() {
        return regulatoryReportingData;
    }

    /**
     * Sets the value of the regulatoryReportingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatoryReportingData(String value) {
        this.regulatoryReportingData = value;
    }

    /**
     * Gets the value of the debitReconciliationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitReconciliationReference() {
        return debitReconciliationReference;
    }

    /**
     * Sets the value of the debitReconciliationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitReconciliationReference(String value) {
        this.debitReconciliationReference = value;
    }

}
