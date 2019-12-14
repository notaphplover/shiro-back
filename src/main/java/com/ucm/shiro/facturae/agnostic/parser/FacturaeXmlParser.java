package com.ucm.shiro.facturae.agnostic.parser;

import java.io.InputStream;

public interface FacturaeXmlParser<T> {
    /**
     * Parses a Facturae xml into a memory object.
     * @param input
     * @return
     */
    T parse(InputStream input) throws FacturaeParseException;
}
