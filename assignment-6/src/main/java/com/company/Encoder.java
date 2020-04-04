package com.company;

import java.io.*;
import java.util.Base64;

public class Encoder {
    public char[] encode(File file,char pivot) throws IOException {
        InputStream filterInputStream = null;
        char[] bytes = new char[(int) file.length()];
        try {
            filterInputStream = new BufferedInputStream(new FileInputStream(file));
            char code;
            int counter = 0;
            while ((code = (char) filterInputStream.read()) != 65535) {
                bytes[counter] = (char) (code * (byte)pivot);
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
