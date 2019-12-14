package com.ucm.shiro.facturae.agnostic.parser;

import org.junit.jupiter.api.Assertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public abstract class AbstractFacturaeValidatorTest {

    protected void checkFilesAreValidated(
        FacturaeXmlValidator validator,
        String[] resourcePaths
    ) throws FileNotFoundException {
        for(String path: resourcePaths) {
            Assertions.assertTrue(validator.check(
                this
                    .getClass()
                    .getClassLoader()
                    .getResourceAsStream(path)
            ));
        }
    }

}
