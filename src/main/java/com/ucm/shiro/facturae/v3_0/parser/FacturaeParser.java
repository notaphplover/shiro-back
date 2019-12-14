package com.ucm.shiro.facturae.v3_0.parser;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeParser;
import com.ucm.shiro.facturae.agnostic.parser.FacturaeParseException;
import com.ucm.shiro.facturae.v3_0.parser.types.Facturae;

public class FacturaeParser extends AbstractFacturaeParser<Facturae> {

    public FacturaeParser() throws FacturaeParseException {
        super(Facturae.class);
    }
}
