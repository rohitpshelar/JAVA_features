package com.Interview;


import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Decrypt_pdf {

    public static void rename(String fn) {
        Path oldFile = Paths.get(fn);
        try {
            System.out.println(oldFile.getFileName());
            System.out.println(renameFile(String.valueOf(oldFile.getFileName())));
            Files.move(oldFile, oldFile.resolveSibling(
                    renameFile(String.valueOf(oldFile.getFileName()))));
        } catch (Exception e) {
            System.out.println("operation failed");
        }
    }

    public static void main(String[] args)
            throws IOException {
        final File folder = new File("D:\\Salary slip");

        for (final File fileEntry : folder.listFiles()) {
            if (String.valueOf(fileEntry.getAbsoluteFile()).contains("ini")) {

            } else {

                // select a file for Decryption operation
                File file = new File(String.valueOf(fileEntry.getAbsoluteFile()).replace("\\", "\\\\"));

                // Load the PDF file
                PDDocument pdd = PDDocument.load(file, "ROHICFAPS8574L");
                // removing all security from PDF file
                pdd.setAllSecurityToBeRemoved(true);
                file.renameTo(new File(String.valueOf(fileEntry.getAbsoluteFile()).replace("\\", "\\\\")));
                // Save the PDF file
                pdd.save(file);

                // Close the PDF file
                pdd.close();


                System.out.println("Decryption Done...");

                // if want to rename
//                rename(String.valueOf(fileEntry.getAbsoluteFile()).replace("\\", "\\\\"));
            }
        }
    }

    static String renameFile(String f) {
        String newName = "";
        f = f.toUpperCase();
        newName = updateYear(f);
        return newName.concat(" ").concat(updateMon(f)).concat(".pdf");
    }

    static String updateYear(String f) {
        if (f.contains("2016")) {
            return "2016";
        }
        if (f.contains("2017")) {
            return "2017";
        }
        if (f.contains("2018")) {
            return "2018";
        }
        if (f.contains("2019")) {
            return "2019";
        }
        if (f.contains("2020")) {
            return "2020";
        }
        if (f.contains("2021")) {
            return "2021";
        }
        if (f.contains("2022")) {
            return "2022";
        }
        return "NULL";
    }

    static String updateMon(String f) {
        if (f.contains("JAN")) {
            return "1 JAN";
        }
        if (f.contains("FEB")) {
            return "2 FEB";
        }
        if (f.contains("MARCH") || f.contains("MAR")) {
            return "3 MAR";
        }
        if (f.contains("APR") || f.contains("APRIL")) {
            return "4 APR";
        }
        if (f.contains("MAY")) {
            return "5 MAY";
        }
        if (f.contains("JUNE")) {
            return "6 JUN";
        }
        if (f.contains("JULY")) {
            return "7 JUL";
        }
        if (f.contains("AUG")) {
            return "8 AUG";
        }
        if (f.contains("SEP")) {
            return "9 SEP";
        }
        if (f.contains("OCT")) {
            return "10 OCT";
        }
        if (f.contains("NOV")) {
            return "11 NOV";
        }
        if (f.contains("DEC")) {
            return "12 DEC";
        }
        return "NULL";
    }


}
