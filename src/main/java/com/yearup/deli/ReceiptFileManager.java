package com.yearup.deli;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptFileManager {

    public void createReceipt(Order order) {

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
            StringBuilder receiptInfo = new StringBuilder();
            receiptInfo.append("==============CheckOut=============\n");
            for (Sandwich sandwich : order.getSandwiches()) {
                receiptInfo.append(sandwich.toString()).append("\n");
            }
            for (Drink drink : order.getDrinks()) {
                receiptInfo.append(drink.toString()).append("\n");
            }
            for (Chips chips1 : order.getChips()) {
                receiptInfo.append(chips1.toString()).append("\n");
            }
            receiptInfo.append("===================================\n");
            receiptInfo.append("\tSub Total: $").append(order.grandTotal());
            fw.write(String.valueOf(receiptInfo));
            fw.close();
            System.out.println("saved");

        }catch (IOException e){
            System.out.println("Failed");
    }







    }
}




