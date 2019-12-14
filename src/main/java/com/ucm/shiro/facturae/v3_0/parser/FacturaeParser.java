package com.ucm.shiro.facturae.v3_0.parser;

import com.ucm.shiro.facturae.agnostic.parser.FacturaeParseException;
import com.ucm.shiro.facturae.agnostic.parser.FacturaeXmlParser;
import com.ucm.shiro.facturae.v3_0.parser.types.Facturae;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class FacturaeParser implements FacturaeXmlParser<Facturae> {

    protected JAXBContext _context;

    protected Unmarshaller _unmarshaller;

    public FacturaeParser() throws FacturaeParseException {
        try {
            this._context = JAXBContext.newInstance(Facturae.class);
            this._unmarshaller = this._context.createUnmarshaller();
        } catch (JAXBException exception) {
            throw new FacturaeParseException(exception);
        }
    }

    @Override
    public Facturae parse(InputStream input) throws FacturaeParseException {
        try {
            return (Facturae) this._unmarshaller.unmarshal(input);
        } catch (JAXBException exception) {
            throw new FacturaeParseException(exception);
        }
    }
}
