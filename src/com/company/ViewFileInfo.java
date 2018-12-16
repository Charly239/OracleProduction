package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ViewFileInfo {

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream(
                    "C:\\Users\\Charly Garcia\\LineTests\\TestResults.txt");
            Reader fr = new InputStreamReader(inputStream, "UTF-8");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("File Doesn't exist");
        }

    }

}