package com.yearup.deli;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptFileManager {

    public void createReceipt() {

        Path receiptsFolder = Path.of("Receipts");
        try {
            if (!Files.exists(receiptsFolder)) {
                Files.createDirectory(receiptsFolder);
            }

        } catch (IOException e) {
            System.out.println("Folder Already Created");
            return;
        }

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(sdf);

        String fileName = formattedDateTime + ".txt";
        Path filepath = receiptsFolder.resolve(fileName);

        try {
            FileWriter fw = new FileWriter(filepath.toFile());
            fw.close();
            System.out.println("saved");

        }catch (IOException e){
            System.out.println("Failed");
    }







    }
}




