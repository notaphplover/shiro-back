package com.ucm.shiro.facturae.v3_2_0.transformer;

import com.ucm.shiro.facturae.agnostic.transformer.AbstractFacturaeTransformer;
import com.ucm.shiro.facturae.exception.FacturaeTransformException;

public class FacturaeTransformerToV3_2_1 extends AbstractFacturaeTransformer {

    private static final String FACTURAE_TO_3_2_1_XSLT_PATH = "xml/schema/facturae/v3_2_0/Transformer3.2To3.2.1.xslt";

    public FacturaeTransformerToV3_2_1() throws FacturaeTransformException {
        super(FacturaeTransformerToV3_2_1.class.getClassLoader().getResourceAsStream(FACTURAE_TO_3_2_1_XSLT_PATH));
    }
}
