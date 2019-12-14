package com.ucm.shiro.facturae.agnostic.parser;

import java.io.InputStream;

public interface FacturaeXmlValidator {
    /**
     * Verifies that a Facturae xml is valid
     * @param input
     * @return
     */
    boolean check(InputStream input);
}
