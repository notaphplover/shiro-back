package com.ucm.shiro.facturae.v3_1.transformer;

import com.ucm.shiro.facturae.agnostic.transformer.AbstractFacturaeTransformer;
import com.ucm.shiro.facturae.exception.FacturaeTransformException;

public class FacturaeTransformerToV3_2 extends AbstractFacturaeTransformer {

    private static final String FACTURAE_TO_3_2_XSLT_PATH = "xml/schema/facturae/v3_1/Transformer3.1To3.2.xslt";

    public FacturaeTransformerToV3_2() throws FacturaeTransformException {
        super(FacturaeTransformerToV3_2.class.getClassLoader().getResourceAsStream(FACTURAE_TO_3_2_XSLT_PATH));
    }
}