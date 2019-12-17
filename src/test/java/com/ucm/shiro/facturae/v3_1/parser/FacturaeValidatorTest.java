package com.ucm.shiro.facturae.v3_1.parser;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeValidatorTest;
import com.ucm.shiro.facturae.exception.FacturaeValidationException;
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

    @DisplayName("It must validate a valid Facturae V3.1 files")
    @Test
    public void itMustValidateValidFacturaeV3_1Files() throws FileNotFoundException {
        String[] files = {
            "xml/schema/facturae/v3_1/facturae_3_1_1.xml",
            "xml/schema/facturae/v3_1/facturae_3_1_2.xml",
        };
        this.checkFilesAreValidated(FacturaeValidatorTest._validator, files);
    }
}
