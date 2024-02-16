package com.directi.training.dip.exercise_refactored;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MyInputStreamReader implements ICharReader {
    private InputStreamReader _reader;
    private int _lastRead = 1 ;

    public MyInputStreamReader(String urlString) throws MalformedURLException, IOException {
        URL url = new URL(urlString);
        InputStream in = url.openStream();
        _reader = new InputStreamReader(in);
    }

    public char readChar() throws IOException{
        _lastRead = _reader.read() ;
        return (char)_lastRead;
    }

    public boolean hasMore(){
        return _lastRead != -1 ;
    }

    public void close() throws IOException{
        _reader.close();
    }
}
