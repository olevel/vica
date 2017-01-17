package com.bam.olevel.vica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by olevel on 9/28/16.
 */
public class AnalyseCSV {
    public static String readTime(String filePath) throws FileNotFoundException {
        String cvsSlitBy = ",";
        String timeArray = null;

        boolean first = true;
        FileInputStream inputStream = new FileInputStream(new File(filePath));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // use comma as separator
                String[] lineContent = line.split(cvsSlitBy);

            }
            return timeArray;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String readText(String filePath) throws IOException {
        FileReader fileReader = new FileReader(new File(filePath));

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        return bufferedReader.readLine();
    }

    public static int getRows(String filePath) throws IOException {
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String line;
        int rows = 0;
        while ((line = bufferedReader.readLine()) != null) {
            rows++;
        }

        return rows;
    }
}
