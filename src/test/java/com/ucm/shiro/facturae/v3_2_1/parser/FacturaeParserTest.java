package com.ucm.shiro.facturae.v3_2_1.parser;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeParserTest;
import com.ucm.shiro.facturae.exception.FacturaeParseException;
import com.ucm.shiro.facturae.v3_2_1.parser.types.Facturae;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FacturaeParserTest extends AbstractFacturaeParserTest<Facturae> {

    private static FacturaeParser _parser;

    @BeforeAll
    static void setUpParser() throws FacturaeParseException {
        FacturaeParserTest._parser = new FacturaeParser();
    }

    @DisplayName("It must parse a valid Facturae V3.2.1 files")
    @Test
    public void itMustParseValidFacturaeV3_2_1Files() throws FacturaeParseException {
        String[] files = {
                "xml/schema/facturae/v3_2_1/facturae_3_2_1_1.xml",
        };
        this.checkFilesAreParsed(FacturaeParserTest._parser, files, Facturae.class);
    }
}
