package com.ucm.shiro.facturae.v3_1.parser;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeParser;
import com.ucm.shiro.facturae.exception.FacturaeParseException;
import com.ucm.shiro.facturae.v3_1.parser.types.Facturae;

public class FacturaeParser extends AbstractFacturaeParser<Facturae> {

    public FacturaeParser() throws FacturaeParseException {
        super(Facturae.class);
    }
}
