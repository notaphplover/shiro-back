package com.ucm.shiro.facturae.agnostic.transformer;

import com.ucm.shiro.facturae.exception.FacturaeTransformException;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;
import java.io.OutputStream;

import net.sf.saxon.TransformerFactoryImpl;

public class AbstractFacturaeTransformer {

    protected TransformerFactory _factory;

    protected Transformer _xslTransformer;

    public AbstractFacturaeTransformer(InputStream xsltInput) throws FacturaeTransformException {
        this._factory = TransformerFactoryImpl.newInstance();

        Source xslt = new StreamSource(xsltInput);
        try {
            this._xslTransformer = this._factory.newTransformer(xslt);
        } catch (TransformerConfigurationException exception) {
            throw new FacturaeTransformException(exception);
        }
    }

    public void transform(InputStream input, OutputStream output) throws FacturaeTransformException {
        Source xmlInput = new StreamSource(input);
        try {
            this._xslTransformer.transform(xmlInput, new StreamResult(output));
        } catch (TransformerException exception) {
            throw new FacturaeTransformException(exception);
        }
    }
}
