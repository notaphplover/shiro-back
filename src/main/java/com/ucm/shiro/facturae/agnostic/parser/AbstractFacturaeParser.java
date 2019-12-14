package com.ucm.shiro.facturae.agnostic.parser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public abstract class AbstractFacturaeParser<T> implements FacturaeXmlParser<T> {

    protected JAXBContext _context;

    protected Unmarshaller _unmarshaller;

    public AbstractFacturaeParser(Class<T> tClass) throws FacturaeParseException {
        try {
            this._context = JAXBContext.newInstance(tClass);
            this._unmarshaller = this._context.createUnmarshaller();
        } catch (JAXBException exception) {
            throw new FacturaeParseException(exception);
        }
    }

    @Override
    public T parse(InputStream input) throws FacturaeParseException {
        try {
            return (T) this._unmarshaller.unmarshal(input);
        } catch (JAXBException exception) {
            throw new FacturaeParseException(exception);
        }
    }
}
