package main.java;

import java.io.*;

public class FileReaderChar {
    public static void main(String args[]) throws IOException {
        Reader reader = new FileReader("/src/main/resources/captmidn.txt");//read the file
        int data=reader.read();//read the first character
        while(data != -1){//keep reading till there is no more character
            System.out.print((char) data);//print the character
            data = reader.read();//read the next character
        }
        reader.close();//close the file
    }
}

