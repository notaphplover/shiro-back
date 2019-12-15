package com.ucm.shiro.facturae.agnostic.parser;

import org.junit.jupiter.api.Assertions;

public abstract class AbstractFacturaeValidatorTest {

    protected void checkFilesAreValidated(
        FacturaeXmlValidator validator,
        String[] resourcePaths
    ) {
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
