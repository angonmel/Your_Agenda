package com.angonmel.Agenda.util;




import java.io.*;
import java.util.ArrayList;

import java.util.List;

public class PrintAgenda {

    public static void createFile(String file, List<String> arrData)
            throws IOException {

        FileWriter writer = new FileWriter(file);

        int size = arrData.size();

        for (int i=0;i<size;i++) {
            String str = arrData.get(i).toString();
            writer.write(str);
            if(i < size-1) {//This prevent creating a blank like at the end of the file**
                writer.write("\n");
            }
        }
        writer.close();
    }
    public static List<String>readFile(String fileName) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Agenda is empty");
        }
        if (fileReader == null){
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

}




