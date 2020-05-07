package org.apache.jmeter.protocol.tcp.sampler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.jmeter.samplers.SampleResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TCPOnewayClientImpl extends TCPClientImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(TCPOnewayClientImpl.class);

    public TCPOnewayClientImpl() {
        LOGGER.debug("Custom tcp client handler created...");
    }

    @Override
    public void write(OutputStream outputStream, InputStream inputStream) throws IOException {
        LOGGER.debug("Write called (InputStream)...");
        super.write(outputStream, inputStream);
    }

    @Override
    public void write(OutputStream outputStream, String s) throws IOException {
        LOGGER.debug("Write called (String)...");
        super.write(outputStream, s);
    }

    @Override
    public String read(InputStream inputStream) throws ReadException {
        LOGGER.debug("Read called...");
        return "";
    }

    @Override
    public String read(InputStream inputStream, SampleResult sampleResult) throws ReadException {
        return read(inputStream);
    }
}
