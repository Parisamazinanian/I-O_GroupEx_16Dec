package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferedExample {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/BufferedFile.txt");
        writeLines(file.getAbsolutePath());
        for(Integer x : readLines(file.getAbsolutePath())){
            System.out.println(x);
        }
        file.delete();
    }

    public static List<Integer> readLines(String filename) throws IOException {
        List<Integer> result = new ArrayList<>(100);
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
        while((line = reader.readLine()) != null){
            result.add(Integer.parseInt(line));
        }
        reader.close();
        return result;
    }

    public static void writeLines(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for(int i = 0; i < 100; i++){
            writer.write(String.valueOf(i));
            writer.newLine();
        }
        writer.close();
    }
}
