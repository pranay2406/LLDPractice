package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        try
        {
            readFromFile("abc");
        }
        catch(IOException e)
        {
            System.err.println("Error reading file");
        }


    }
       public static  void readFromFile(String path) throws IOException {
             File file = new File(path);
           FileReader filereader = new FileReader(file);
           filereader.read();
       }
}
