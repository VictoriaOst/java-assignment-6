package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        Scanner scanner = new Scanner(System.in);
        String code = "";
        while (true) {
            System.out.println("Выбирете ключевой символ");
            code = scanner.nextLine();
            if (Validator.validatePivotChar(code)) {
                break;
            }
        }
        decoder.decode(encoder.encode(new File("exampleText.txt"),code.charAt(0)), new File("decodedText.txt"),code.charAt(0));
    }
}
