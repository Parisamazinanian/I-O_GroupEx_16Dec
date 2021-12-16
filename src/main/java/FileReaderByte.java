package main.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReaderByte {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("/src/main/resources/captmidn.txt");//importing the txt file
        int data=input.read();//reads the first character
        while(data != -1){//keep reading till there is no character
            System.out.print((char) data);//print the value
            data = input.read();//read the next character
        }
        input.close();
    }
}
