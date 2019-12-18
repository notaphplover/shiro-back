package com.ucm.shiro.facturae.exception;

public class FacturaeTransformException extends Exception {

    public FacturaeTransformException() { super(); }

    public FacturaeTransformException(String message) { super(message); }

    public FacturaeTransformException(String message, Throwable cause) {
        super(message, cause);
    }

    public FacturaeTransformException(Throwable cause) {
        super(cause);
    }
}
