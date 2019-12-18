package com.ucm.shiro.facturae.agnostic.parser;

import com.ucm.shiro.facturae.exception.FacturaeParseException;
import org.junit.jupiter.api.Assertions;

import java.io.InputStream;

public abstract class AbstractFacturaeParserTest<T> {

    protected void checkFilesAreParsed(
        FacturaeXmlParser<T> parser,
        String[] resourcePaths,
        Class<T> tClass
    ) throws FacturaeParseException {
        Object[] output = new Object[resourcePaths.length];

        for (int i = 0; i < resourcePaths.length; ++i) {
            InputStream input = this
                    .getClass()
                    .getClassLoader()
                    .getResourceAsStream(resourcePaths[i]);
            output[i] = parser.parse(input);
        }

        for (Object facturaeObject: output) {
            Assertions.assertEquals(tClass, facturaeObject.getClass());
        }
    }
}
