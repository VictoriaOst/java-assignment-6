package com.company;

import java.io.*;

public class Decoder {
    public void decode(char[] bytes, File file,char pivot) {
        FilterOutputStream filterOutputStream = null;
        try {
            filterOutputStream = new FilterOutputStream(new FileOutputStream(file));
            for (int itter = 0; itter < bytes.length; itter++) {
                filterOutputStream.write(bytes[itter] / ((byte)(pivot)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                filterOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
