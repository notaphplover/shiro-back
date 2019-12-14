package com.ucm.shiro.facturae.agnostic.parser;

import org.w3c.dom.ls.LSInput;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LSInputImplementation implements LSInput {

    private static final String CHARSET = StandardCharsets.UTF_8.name();

    protected String _baseUri;

    protected boolean _certified;

    protected String _content;

    protected String _publicId;

    protected String _systemId;

    @Override
    public Reader getCharacterStream() {
        return new StringReader(this._content);
    }

    @Override
    public void setCharacterStream(Reader characterStream) {
        try {
            char[] buffer = new char[8 * 1024];
            StringBuffer strBuffer = new StringBuffer();
            while(characterStream.read(buffer, 0, buffer.length) != -1) {
                strBuffer.append(buffer);
            }
            this._content = strBuffer.toString();
        } catch (IOException exception) {
            this._content = null;
        }
    }

    @Override
    public InputStream getByteStream() {
        return new ByteArrayInputStream(this._content.getBytes());
    }

    @Override
    public void setByteStream(InputStream byteStream) {
        try {
            this._content = new String(byteStream.readAllBytes());
        } catch (IOException e) {
            this._content = "";
        }
    }

    @Override
    public String getStringData() {
        return this._content;
    }

    @Override
    public void setStringData(String stringData) {
        this._content = stringData;
    }

    @Override
    public String getSystemId() {
        return this._systemId;
    }

    @Override
    public void setSystemId(String systemId) {
        this._systemId = systemId;
    }

    @Override
    public String getPublicId() {
        return this._publicId;
    }

    @Override
    public void setPublicId(String publicId) {
        this._publicId = publicId;
    }

    @Override
    public String getBaseURI() {
        return this._baseUri;
    }

    @Override
    public void setBaseURI(String baseURI) {
        this._baseUri = baseURI;
    }

    @Override
    public String getEncoding() {
        return CHARSET;
    }

    @Override
    public void setEncoding(String encoding) { }

    @Override
    public boolean getCertifiedText() {
        return this._certified;
    }

    @Override
    public void setCertifiedText(boolean certifiedText) {
        this._certified = certifiedText;
    }
}
