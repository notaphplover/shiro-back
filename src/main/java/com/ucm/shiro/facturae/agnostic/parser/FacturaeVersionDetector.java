package com.ucm.shiro.facturae.agnostic.parser;

import com.ucm.shiro.facturae.FacturaeVersion;
import com.ucm.shiro.facturae.v3_2_0.parser.types.Facturae;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.InputStream;

public class FacturaeVersionDetector {

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

    public FacturaeVersion getVersion(InputStream input) throws FacturaeValidationException {
        String version;
        try {
            Document document = this._builder.parse(input);
            version = (String)this._xpathExpression.evaluate(document, XPathConstants.STRING);
        } catch (IOException | SAXException | XPathExpressionException exception) {
            throw new FacturaeValidationException(exception);
        }
        FacturaeVersion facturaeVersion = FacturaeVersion.valueOfVersion(version);
        if (null == facturaeVersion) {
            throw new FacturaeValidationException();
        }
        return facturaeVersion;
    }
}
