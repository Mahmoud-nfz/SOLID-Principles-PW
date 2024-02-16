package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Base64;

public class EncodingModule
{
    public void encodeWithFiles() throws IOException
    {
        ILineReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new MyFileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
            writer = new BufferedWriter(
                new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));

            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
            
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void encodeBasedOnNetworkAndDatabase() throws MalformedURLException, IOException
    {
        ICharReader reader = new MyInputStreamReader("http://myfirstappwith.appspot.com/index.html");

        StringBuilder inputString1 = new StringBuilder();
        while (reader.hasMore()) { 
            inputString1.append(reader.readChar());
        }

        int c;
        c = reader.readChar();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.readChar();
        }

        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
    
}

