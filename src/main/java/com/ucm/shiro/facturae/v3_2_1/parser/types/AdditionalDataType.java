//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.14 at 05:22:02 p. m. CET 
//


package com.ucm.shiro.facturae.v3_2_1.parser.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelatedInvoice" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax40Type" minOccurs="0"/>
 *         &lt;element name="RelatedDocuments" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AttachedDocumentsType" minOccurs="0"/>
 *         &lt;element name="InvoiceAdditionalInformation" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDataType", propOrder = {
    "relatedInvoice",
    "relatedDocuments",
    "invoiceAdditionalInformation",
    "extensions"
})
public class AdditionalDataType {

    @XmlElement(name = "RelatedInvoice")
    protected String relatedInvoice;
    @XmlElement(name = "RelatedDocuments")
    protected AttachedDocumentsType relatedDocuments;
    @XmlElement(name = "InvoiceAdditionalInformation")
    protected String invoiceAdditionalInformation;
    @XmlElement(name = "Extensions")
    protected ExtensionsType extensions;

    /**
     * Gets the value of the relatedInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedInvoice() {
        return relatedInvoice;
    }

    /**
     * Sets the value of the relatedInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedInvoice(String value) {
        this.relatedInvoice = value;
    }

    /**
     * Gets the value of the relatedDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link AttachedDocumentsType }
     *     
     */
    public AttachedDocumentsType getRelatedDocuments() {
        return relatedDocuments;
    }

    /**
     * Sets the value of the relatedDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedDocumentsType }
     *     
     */
    public void setRelatedDocuments(AttachedDocumentsType value) {
        this.relatedDocuments = value;
    }

    /**
     * Gets the value of the invoiceAdditionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAdditionalInformation() {
        return invoiceAdditionalInformation;
    }

    /**
     * Sets the value of the invoiceAdditionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAdditionalInformation(String value) {
        this.invoiceAdditionalInformation = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setExtensions(ExtensionsType value) {
        this.extensions = value;
    }

}
