package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader implements ILineReader {
    private BufferedReader _reader;

    public MyFileReader(String filePath) throws FileNotFoundException {
        _reader = new BufferedReader(new FileReader(filePath));
    }

    public String readLine() throws IOException{
        return _reader.readLine();
    }

    public void close() throws IOException{
        _reader.close();
    }
}
