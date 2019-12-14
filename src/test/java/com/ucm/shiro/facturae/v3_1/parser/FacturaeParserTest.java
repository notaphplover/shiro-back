package com.ucm.shiro.facturae.v3_1.parser;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeParserTest;
import com.ucm.shiro.facturae.agnostic.parser.FacturaeParseException;
import com.ucm.shiro.facturae.v3_1.parser.types.Facturae;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FacturaeParserTest extends AbstractFacturaeParserTest<Facturae> {

    private static FacturaeParser _parser;

    @BeforeAll
    static void setUpParser() throws FacturaeParseException {
        FacturaeParserTest._parser = new FacturaeParser();
    }

    @DisplayName("It must parse a valid Facturae V3.1 files")
    @Test
    public void itMustParseValidFacturaeV3_1Files() throws FacturaeParseException {
        String[] files = {
                "xml/schema/facturae/v3_1/facturae_3_1_1.xml",
                "xml/schema/facturae/v3_1/facturae_3_1_2.xml",
        };
        this.checkFilesArePared(FacturaeParserTest._parser, files, Facturae.class);
    }
}
