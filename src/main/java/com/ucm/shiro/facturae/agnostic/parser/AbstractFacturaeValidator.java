package com.ucm.shiro.facturae.agnostic.parser;

import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;
import java.io.InputStream;

public abstract class AbstractFacturaeValidator implements FacturaeXmlValidator {

    private static final String CORE_SCHEMA_NAMESPACE = "http://www.w3.org/2000/09/xmldsig#";

    protected Schema _schema;

    public AbstractFacturaeValidator(InputStream schemaInput, InputStream coreSchemaInput) throws FacturaeValidationException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        factory.setResourceResolver(new LSResourceResolver() {
            @Override
            public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
                if (XMLConstants.W3C_XML_SCHEMA_NS_URI == type && CORE_SCHEMA_NAMESPACE == namespaceURI) {
                    LSInput input = new LSInputImplementation();
                    input.setByteStream(coreSchemaInput);
                    input.setSystemId(systemId);
                    return input;
                }

                return null;
            }
        });
        try {
            this._schema = factory.newSchema(new StreamSource(schemaInput));
        } catch (SAXException e) {
            throw new FacturaeValidationException(e);
        }
    }

    @Override
    public boolean check(InputStream input) {
        Validator validator = this._schema.newValidator();
        try {
            validator.validate(new StreamSource(input));
            return true;
        } catch (IOException | SAXException e){
            return false;
        }
    }
}
