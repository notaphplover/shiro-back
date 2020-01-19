package com.ucm.shiro.facturae.v3_2_0.transformer;

import com.ucm.shiro.facturae.agnostic.transformer.AbstractFacturaeTransformerTest;
import com.ucm.shiro.facturae.exception.FacturaeTransformException;
import com.ucm.shiro.facturae.exception.FacturaeValidationException;
import com.ucm.shiro.facturae.v3_2_1.parser.FacturaeValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FacturaeTransformerToV3_2_1Test extends AbstractFacturaeTransformerTest {

    private static FacturaeTransformerToV3_2_1 _transformer;

    private static FacturaeValidator _validatorNext;

    @BeforeAll
    static void setUp() throws FacturaeValidationException, FacturaeTransformException {
        FacturaeTransformerToV3_2_1Test._transformer = new FacturaeTransformerToV3_2_1();
        FacturaeTransformerToV3_2_1Test._validatorNext = new FacturaeValidator();
    }

    @DisplayName("It must transform valid Facturae V3.2.0 files")
    @Test
    public void itMustTransformValidFacturaeV3_2_0Files() throws FacturaeTransformException {
        String[] files = {
                "xml/schema/facturae/v3_2_0/facturae_3_2_0_1.xml",
                "xml/schema/facturae/v3_2_0/facturae_3_2_0_2.xml",
                "xml/schema/facturae/v3_2_0/facturae_3_2_0_3.xml",
                "xml/schema/facturae/v3_2_0/facturae_3_2_0_4.xml",
                "xml/schema/facturae/v3_2_0/facturae_3_2_0_5.xml",
        };
        this.checkFilesAreTransformed(
            files,
            FacturaeTransformerToV3_2_1Test._transformer,
            FacturaeTransformerToV3_2_1Test._validatorNext
        );
    }

}
