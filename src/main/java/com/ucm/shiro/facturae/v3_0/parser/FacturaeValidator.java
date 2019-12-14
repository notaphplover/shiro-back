package com.ucm.shiro.facturae.v3_0.parser;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeValidator;
import com.ucm.shiro.facturae.agnostic.parser.FacturaeValidationException;

public class FacturaeValidator extends AbstractFacturaeValidator {

    private static final String FACTURAE_XSD_PATH = "xml/schema/facturae/v3_0/Facturae.xsd";
    private static final String CORE_XSD_PATH = "xml/schema/facturae/v3_0/xmldsig-core-schema.xsd";

    public FacturaeValidator() throws FacturaeValidationException {
        super(
            FacturaeValidator.class.getClassLoader().getResourceAsStream(FACTURAE_XSD_PATH),
            FacturaeValidator.class.getClassLoader().getResourceAsStream(CORE_XSD_PATH)
        );
    }
}
