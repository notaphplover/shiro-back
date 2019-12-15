package com.ucm.shiro.facturae.agnostic.parser;

import com.ucm.shiro.facturae.FacturaeVersion;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FacturaeVersionDetectorTest {

    private static FacturaeVersionDetector _versionDetector;

    @BeforeAll
    static void setUpParser() {
        FacturaeVersionDetectorTest._versionDetector = new FacturaeVersionDetector();
    }

    @DisplayName("It must get the right Facturae version")
    @Test
    public void itMustGetFacturaeVersions() throws FacturaeValidationException {
        this.checkVersionIsFound(
            FacturaeVersionDetectorTest._versionDetector,
            new HashMap<String, FacturaeVersion>() {
                {
                    put("xml/schema/facturae/v3_0/facturae_3_0_1.xml", FacturaeVersion.v3_0);
                    put("xml/schema/facturae/v3_1/facturae_3_1_1.xml", FacturaeVersion.v3_1);
                    put("xml/schema/facturae/v3_2_0/facturae_3_2_0_1.xml", FacturaeVersion.v3_2_0);
                    put("xml/schema/facturae/v3_2_1/facturae_3_2_1_1.xml", FacturaeVersion.v3_2_1);
                    put("xml/schema/facturae/v3_2_2/facturae_3_2_2_1.xml", FacturaeVersion.v3_2_2);
                }
            }
        );
    }

    protected void checkVersionIsFound(
        FacturaeVersionDetector versionDetector,
        Map<String, FacturaeVersion> pathsToVersions
    ) throws FacturaeValidationException {
        for (Map.Entry<String, FacturaeVersion> entry : pathsToVersions.entrySet()) {
            InputStream input = this
                    .getClass()
                    .getClassLoader()
                    .getResourceAsStream(entry.getKey());
            Assertions.assertEquals(entry.getValue(), versionDetector.getVersion(input));
        }
    }
}
