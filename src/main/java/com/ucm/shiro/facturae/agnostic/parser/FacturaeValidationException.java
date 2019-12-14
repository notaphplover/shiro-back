package com.ucm.shiro.facturae.agnostic.parser;

public class FacturaeValidationException extends Exception {

    public FacturaeValidationException() { super(); }

    public FacturaeValidationException(String message) { super(message); }

    public FacturaeValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public FacturaeValidationException(Throwable cause) {
        super(cause);
    }
}
