//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.14 at 02:13:28 p. m. CET 
//


package com.ucm.shiro.facturae.v3_1.parser.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrectionMethodDescriptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorrectionMethodDescriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Rectificación íntegra"/>
 *     &lt;enumeration value="Rectificación por diferencias"/>
 *     &lt;enumeration value="Rectificación por descuento por volumen de operaciones durante un periodo"/>
 *     &lt;enumeration value="Autorizadas por la Agencia Tributaria"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CorrectionMethodDescriptionType")
@XmlEnum
public enum CorrectionMethodDescriptionType {

    @XmlEnumValue("Rectificaci\u00f3n \u00edntegra")
    RECTIFICACIÓN_ÍNTEGRA("Rectificaci\u00f3n \u00edntegra"),
    @XmlEnumValue("Rectificaci\u00f3n por diferencias")
    RECTIFICACIÓN_POR_DIFERENCIAS("Rectificaci\u00f3n por diferencias"),
    @XmlEnumValue("Rectificaci\u00f3n por descuento por volumen de operaciones durante un periodo")
    RECTIFICACIÓN_POR_DESCUENTO_POR_VOLUMEN_DE_OPERACIONES_DURANTE_UN_PERIODO("Rectificaci\u00f3n por descuento por volumen de operaciones durante un periodo"),
    @XmlEnumValue("Autorizadas por la Agencia Tributaria")
    AUTORIZADAS_POR_LA_AGENCIA_TRIBUTARIA("Autorizadas por la Agencia Tributaria");
    private final String value;

    CorrectionMethodDescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CorrectionMethodDescriptionType fromValue(String v) {
        for (CorrectionMethodDescriptionType c: CorrectionMethodDescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}