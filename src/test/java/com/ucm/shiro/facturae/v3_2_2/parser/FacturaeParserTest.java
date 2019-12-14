package com.ucm.shiro.facturae.v3_2_2.parser;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeParserTest;
import com.ucm.shiro.facturae.agnostic.parser.FacturaeParseException;
import com.ucm.shiro.facturae.v3_2_2.parser.types.Facturae;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FacturaeParserTest extends AbstractFacturaeParserTest<Facturae> {

    private static FacturaeParser _parser;

    @BeforeAll
    static void setUpParser() throws FacturaeParseException {
        FacturaeParserTest._parser = new FacturaeParser();
    }

    @DisplayName("It must parse a valid Facturae V3.2.2 files")
    @Test
    public void itMustParseValidFacturaeV3_2_2Files() throws FacturaeParseException {
        String[] files = {
                "xml/schema/facturae/v3_2_2/facturae_3_2_2_1.xml",
        };
        this.checkFilesArePared(FacturaeParserTest._parser, files, Facturae.class);
    }
}
