package com.yearup.deli;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReceiptFileManager {
    /*public static void main(String[] args) {*/

    public ReceiptFileManager() {

        Path receiptsFolder = Path.of("Receipts");
        try {
            if (!Files.exists(receiptsFolder)) {
                Files.createDirectory(receiptsFolder);
            }

        } catch (IOException e) {


        }

    }
}




