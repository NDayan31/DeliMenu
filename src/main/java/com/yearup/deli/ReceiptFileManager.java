package com.yearup.deli;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

public class ReceiptFileManager {
    public static void main(String[] args) {


        try {
            File file = new File("CustomerReciepts.txt");
            FileWriter fw = new FileWriter(file, true);
            fw.write("*example*/n");
            fw.close();
        } catch(Exception e) {
            System.out.println("Error");

        }

    }


}
