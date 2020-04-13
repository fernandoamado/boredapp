package org.academiadecodigo.hackaton.Connection;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


public class ConnectionController {
    private InputStream inputStream;

    public ConnectionController(String urlString) throws IOException {
        inputStream = new TextFromWeb(urlString).getUrl().getInputStream();
    }

    public InputStream getInputStream(){
        return inputStream;
    }
}
