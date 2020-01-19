package com.ucm.shiro.facturae.agnostic.transformer;

import com.ucm.shiro.facturae.FacturaeVersion;
import com.ucm.shiro.facturae.agnostic.parser.FacturaeVersionDetector;
import com.ucm.shiro.facturae.exception.FacturaeTransformException;
import com.ucm.shiro.facturae.exception.FacturaeValidationException;
import com.ucm.shiro.facturae.v3_0.transformer.FacturaeTransformerToV3_1;
import com.ucm.shiro.facturae.v3_1.transformer.FacturaeTransformerToV3_2;
import com.ucm.shiro.facturae.v3_2_0.transformer.FacturaeTransformerToV3_2_1;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.TreeMap;

public class FacturaeTransformer {
    private final static TreeMap<FacturaeVersion, AbstractFacturaeTransformer> transformersMap = new TreeMap<>();

    private final static FacturaeVersionDetector versionDetector = new FacturaeVersionDetector();

    static {
        try {
            transformersMap.put(FacturaeVersion.v3_0, new FacturaeTransformerToV3_1());
            transformersMap.put(FacturaeVersion.v3_1, new FacturaeTransformerToV3_2());
            transformersMap.put(FacturaeVersion.v3_2_0, new FacturaeTransformerToV3_2_1());
        } catch (FacturaeTransformException e) {
            e.printStackTrace();
        }
    }

    public void transform(InputStream input, OutputStream output) throws FacturaeValidationException, FacturaeTransformException {
        try {
            byte[] bytes = IOUtils.toByteArray(input);
            FacturaeVersion version;
            {
                InputStream bytesInputStream = new ByteArrayInputStream(bytes);
                version = FacturaeTransformer.versionDetector.getVersion(bytesInputStream);
            }
            AbstractFacturaeTransformer transformer = FacturaeTransformer.transformersMap.get(version);
            if (null == transformer) {
                output.write(bytes);
                return;
            }
            ByteArrayOutputStream tempOutput = new ByteArrayOutputStream();
            transformer.transform(input, tempOutput);
            this.transform(new ByteArrayInputStream(tempOutput.toByteArray()), output);
        } catch (IOException ex) {
            throw new FacturaeTransformException(ex);
        }
    }
}
