package com.ucm.shiro.facturae.agnostic.transformer;

import com.ucm.shiro.facturae.agnostic.parser.AbstractFacturaeValidator;
import com.ucm.shiro.facturae.exception.FacturaeTransformException;
import org.junit.jupiter.api.Assertions;

import java.io.*;

public class AbstractFacturaeTransformerTest {

    protected void checkFilesAreTransformed(
        String[] inputs,
        AbstractFacturaeTransformer transformer,
        AbstractFacturaeValidator validatorNext
    ) throws IOException, FacturaeTransformException {
        for (String input: inputs) {
            this.checkFileIsTransformed(input, transformer, validatorNext);
        }
    }

    protected void checkFileIsTransformed(
        String input,
        AbstractFacturaeTransformer transformer,
        AbstractFacturaeValidator validatorNext
    ) throws IOException, FacturaeTransformException {
        PipedInputStream inputFromTransformed = new PipedInputStream();
        PipedOutputStream output = new PipedOutputStream(inputFromTransformed);
        transformer.transform(this.getClass().getClassLoader().getResourceAsStream(input), output);
        Assertions.assertTrue(validatorNext.check(inputFromTransformed));
    }
}
