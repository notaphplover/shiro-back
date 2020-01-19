package com.ucm.shiro.facturae.v3_0.transformer;

import com.ucm.shiro.facturae.agnostic.transformer.AbstractFacturaeTransformerTest;
import com.ucm.shiro.facturae.exception.FacturaeTransformException;
import com.ucm.shiro.facturae.exception.FacturaeValidationException;
import com.ucm.shiro.facturae.v3_1.parser.FacturaeValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

public class FacturaeTransformerToV3_1Test extends AbstractFacturaeTransformerTest {

    private static FacturaeTransformerToV3_1 _transformer;

    private static FacturaeValidator _validatorNext;

    @BeforeAll
    static void setUp() throws FacturaeValidationException, FacturaeTransformException {
        FacturaeTransformerToV3_1Test._transformer = new FacturaeTransformerToV3_1();
        FacturaeTransformerToV3_1Test._validatorNext = new com.ucm.shiro.facturae.v3_1.parser.FacturaeValidator();
    }

    @DisplayName("It must transform valid Facturae V3.0 files")
    public void itMustTransformValidFacturaeV3_1Files() throws FacturaeTransformException {
        String[] files = {
                "xml/schema/facturae/v3_0/facturae_3_0_1.xml",
                "xml/schema/facturae/v3_0/facturae_3_0_2.xml",
        };
        this.checkFilesAreTransformed(
                files,
                FacturaeTransformerToV3_1Test._transformer,
                FacturaeTransformerToV3_1Test._validatorNext
        );
    }
}
