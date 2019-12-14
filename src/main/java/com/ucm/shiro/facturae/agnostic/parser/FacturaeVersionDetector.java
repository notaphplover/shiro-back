package com.ucm.shiro.facturae.agnostic.parser;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FacturaeVersionDetector {

    private static final String[] FACTURAE_VALID_VERSIONS = {
        "3.0",
        "3.1",
        "3.2.0",
        "3.2.1",
        "3.2.2",
    };

    private static final String FACTURAE_VERSION_XPATH =
        "/*[local-name()='Facturae']/*[local-name()='FileHeader']/*[local-name()='SchemaVersion']/text()";

    protected DocumentBuilder _builder;

    protected XPathExpression _xpathExpression;

    public FacturaeVersionDetector() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        try {
            this._builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException exception) { }

        XPathFactory xpathfactory = XPathFactory.newInstance();
        XPath xpath = xpathfactory.newXPath();
        try {
            this._xpathExpression = xpath.compile(FACTURAE_VERSION_XPATH);
        } catch (XPathExpressionException exception) { }
    }

    public String getVersion(InputStream input) throws FacturaeValidationException {
        String version;
        try {
            Document document = this._builder.parse(input);
            version = (String)this._xpathExpression.evaluate(document, XPathConstants.STRING);
        } catch (IOException | SAXException | XPathExpressionException exception) {
            throw new FacturaeValidationException(exception);
        }
        if (!Arrays.stream(FACTURAE_VALID_VERSIONS).anyMatch(version::equals)) {
            throw new FacturaeValidationException();
        }
        return version;
    }
}
