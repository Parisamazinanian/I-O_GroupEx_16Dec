package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileExample {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/FileExample.txt");

        //creating a new file
        boolean value = file.createNewFile();
        if(value){
            System.out.println("The file has been created");
        } else{
            System.out.println("The file has not been created");
        }

        //print file location
        System.out.println(file.getAbsolutePath());

        //writing to our new file with characters (FileWriter)
        FileWriter output = new FileWriter(file, false);
        String data = "This is the data in the output file";
        output.write(data);
        output.close();

        //writing to our new file with bytes (FileOutputStream)
        OutputStream outputBytes = new FileOutputStream(file, true);
        outputBytes.write(data.getBytes());
        outputBytes.close();

        //reading from our new file with characters (FileReader)
        FileReader input = new FileReader(file);
        int character;
        List<Character> chars = new ArrayList<>();
        while((character = input.read()) != -1){
            System.out.print((char) character);;
        }
        System.out.println();
        input.close();

        //prints the length of the file in bytes
        System.out.printf("The length of the file is %s%n", file.length());

        //deleting our new file
        value = file.delete();
        if(value){
            System.out.println("The file has been deleted");
        } else{
            System.out.println("The file has not been deleted");
        }
    }
}
