package com.ucm.shiro.facturae.v3_2_0.parser;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeValidatorTest;
import com.ucm.shiro.facturae.agnostic.parser.FacturaeValidationException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class FacturaeValidatorTest extends AbstractFacturaeValidatorTest {
    private static FacturaeValidator _validator;

    @BeforeAll
    static void setUpParser() throws FacturaeValidationException {
        FacturaeValidatorTest._validator = new FacturaeValidator();
    }

    @DisplayName("It must validate a valid Facturae V3.2.0 files")
    @Test
    public void itMustValidateValidFacturaeV3_2_0Files() throws FileNotFoundException {
        String[] files = {
            "xml/schema/facturae/v3_2_0/facturae_3_2_0_1.xml",
            "xml/schema/facturae/v3_2_0/facturae_3_2_0_2.xml",
            "xml/schema/facturae/v3_2_0/facturae_3_2_0_3.xml",
            "xml/schema/facturae/v3_2_0/facturae_3_2_0_4.xml",
            "xml/schema/facturae/v3_2_0/facturae_3_2_0_5.xml",
        };
        this.checkFilesAreValidated(FacturaeValidatorTest._validator, files);
    }
}
