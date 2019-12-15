package com.ucm.shiro.facturae;

import java.util.HashMap;
import java.util.Map;

public enum FacturaeVersion {
    v3_0("3.0"),
    v3_1("3.1"),
    v3_2_0("3.2"),
    v3_2_1("3.2.1"),
    v3_2_2("3.2.2");

    private static final Map<String, FacturaeVersion> BY_VERSION = new HashMap<>();

    static {
        for (FacturaeVersion e: values()) {
            BY_VERSION.put(e.version, e);
        }
    }

    public final String version;

    FacturaeVersion(String version) {
        this.version = version;
    }

    public static FacturaeVersion valueOfVersion(String version) {
        return BY_VERSION.get(version);
    }
}
