package com.ucm.shiro.facturae.v3_1.transformer;

import com.ucm.shiro.facturae.agnostic.transformer.AbstractFacturaeTransformerTest;
import com.ucm.shiro.facturae.exception.FacturaeTransformException;
import com.ucm.shiro.facturae.exception.FacturaeValidationException;
import com.ucm.shiro.facturae.v3_2_0.parser.FacturaeValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FacturaeTransformerToV3_2Test extends AbstractFacturaeTransformerTest {

    private static FacturaeTransformerToV3_2 _transformer;

    private static FacturaeValidator _validatorNext;

    @BeforeAll
    static void setUp() throws FacturaeValidationException, FacturaeTransformException {
        FacturaeTransformerToV3_2Test._transformer = new FacturaeTransformerToV3_2();
        FacturaeTransformerToV3_2Test._validatorNext = new FacturaeValidator();
    }

    @DisplayName("It must transform valid Facturae V3.1 files")
    @Test
    public void itMustTransformValidFacturaeV3_1Files() throws IOException, FacturaeTransformException {
        String[] files = {
                "xml/schema/facturae/v3_1/facturae_3_1_1.xml",
                "xml/schema/facturae/v3_1/facturae_3_1_2.xml",
        };
        this.checkFilesAreTransformed(
            files,
            FacturaeTransformerToV3_2Test._transformer,
            FacturaeTransformerToV3_2Test._validatorNext
        );
    }

}
