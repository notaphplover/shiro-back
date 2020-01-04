package com.ucm.shiro.facturae.v3_0.transformer;

import com.ucm.shiro.facturae.agnostic.transformer.AbstractFacturaeTransformer;
import com.ucm.shiro.facturae.exception.FacturaeTransformException;

public class FacturaeTransformerToV3_1 extends AbstractFacturaeTransformer {

    private static final String FACTURAE_TO_3_1_XSLT_PATH = "xml/schema/facturae/v3_0/Transformer3.0To3.1.xslt";

    public FacturaeTransformerToV3_1() throws FacturaeTransformException {
        super(FacturaeTransformerToV3_1.class.getClassLoader().getResourceAsStream(FACTURAE_TO_3_1_XSLT_PATH));
    }
}