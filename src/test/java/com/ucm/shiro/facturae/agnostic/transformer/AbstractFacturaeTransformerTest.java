package com.ucm.shiro.facturae.agnostic.transformer;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeValidator;
import com.ucm.shiro.facturae.exception.FacturaeTransformException;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class AbstractFacturaeTransformerTest {

    protected void checkFilesAreTransformed(
        String[] inputs,
        AbstractFacturaeTransformer transformer,
        AbstractFacturaeValidator validatorNext
    ) throws FacturaeTransformException {
        for (String input: inputs) {
            this.checkFileIsTransformed(input, transformer, validatorNext);
        }
    }

    protected void checkFileIsTransformed(
        String input,
        AbstractFacturaeTransformer transformer,
        AbstractFacturaeValidator validatorNext
    ) throws FacturaeTransformException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        transformer.transform(this.getClass().getClassLoader().getResourceAsStream(input), output);
        ByteArrayInputStream inputFromTransformed = new ByteArrayInputStream(output.toByteArray());
        Assertions.assertTrue(validatorNext.check(inputFromTransformed));
    }
}
