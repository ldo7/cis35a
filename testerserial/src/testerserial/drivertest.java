package testerserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class drivertest {

	public static void main(String[] args){
        try {
			System.out.println("start");
        	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
			out.writeObject("hello my name is tesint here ok bye");
			out.close();
			System.out.println("done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
