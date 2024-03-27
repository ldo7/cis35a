package testFilewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class tester {
   
	public static void main(String[] args)  throws IOException    {
        // initialize a string
        String str = "ABC";
        try {
        	System.out.println("Want to write "+str);

        	FileWriter fw = new FileWriter("existingFile.txt",true);

            fw.write("\n1st LINE - write"); 
            fw.append("\n2nd LINE - null");
            fw.write("\n3rd LINE - null");
  
            System.out.println("Successfully written");
  
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}