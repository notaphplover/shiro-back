package com.ucm.shiro.facturae.exception;

public class FacturaeParseException extends Exception {

    public FacturaeParseException() { super(); }

    public FacturaeParseException(String message) { super(message); }

    public FacturaeParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public FacturaeParseException(Throwable cause) {
        super(cause);
    }
}
