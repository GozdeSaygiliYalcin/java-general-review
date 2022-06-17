package main.java.com.gozdesy.l15_io.file;

import java.io.FileWriter;
import java.io.IOException;

/*
 *In the following example, we use the FileWriter class 
 *together with its write() method to write some text to 
 *the file we created in the example above. 
 *Note that when you are done writing to the file, we 
 *should close it with the close() method:
 */

public class WriteToFile {  
  public static void main(String[] args) {  
    try {  
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 
