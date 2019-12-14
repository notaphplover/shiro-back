package com.ucm.shiro.facturae.v3_0.parser;

import com.ucm.shiro.facturae.agnostic.parser.FacturaeParseException;
import com.ucm.shiro.facturae.v3_0.parser.types.Facturae;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class FacturaeParserTest {

    private static FacturaeParser _parser;

    @BeforeAll
    static void setUpParser() throws FacturaeParseException {
        FacturaeParserTest._parser = new FacturaeParser();
    }

    @DisplayName("It must parse a valid Facturae V3.0 files")
    @Test
    public void itMustParseValidFacturaeV3_0Files() throws FacturaeParseException {
        InputStream input1 = this
                .getClass()
                .getClassLoader()
                .getResourceAsStream("xml.schema.facturae.v3_0/facturae_3_0_1.xml");

        Facturae output1 = FacturaeParserTest._parser.parse(input1);
        Assertions.assertNotNull(output1);

        InputStream input2 = this
                .getClass()
                .getClassLoader()
                .getResourceAsStream("xml.schema.facturae.v3_0/facturae_3_0_2.xml");

        Facturae output2 = FacturaeParserTest._parser.parse(input2);
        Assertions.assertNotNull(output2);
    }
}
