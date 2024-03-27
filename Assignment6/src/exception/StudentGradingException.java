/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 6
 * Due: Dec 7
 * Submitted: Dec 7
 * 
 */

package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class StudentGradingException extends Exception {
	private int errorno;
	private String errormsg;
	
	public StudentGradingException() {
		super();
		printmyproblem();
	}
	
	public StudentGradingException(String errormsg) {
		super();
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	public StudentGradingException(int errorno) {
		super();
		this.errorno = errorno;
		printmyproblem();
	}
	
	public StudentGradingException(int errorno, String errormsg) {
		super();
		this.errorno = errorno;
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	public int getErrorno() {
		return errorno;
	}
	
	public void setErrorno(int errorno) {
		this.errorno = errorno;
	}
	
	public String getErrormsg() {
		return errormsg;
	}
	
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	public void printmyproblem() {
		//use file writer to print to LOG
        String str = "ABC";
        try {
        	System.out.println("\nHmmmm, seems like there's a problem.....");
        	//System.out.println("\nCurrently Logging new Exception...."); //DEBUG

        	FileWriter fw = new FileWriter("errorLog.txt",true);

            fw.append("\n\nFixProblems [errorno=" + errorno + ", errormsg=" + errormsg + "]"); 
  
            //System.out.println("Error successfully logged."); //DEBUG
  
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
		
	}

	public String fixProblemReadFromConsole(int i)
	{
		String filename=null;
		switch(i) {
			//Problem = file DNE, so request user to input different file name --> while loop until file exists
			case 1:
				Scanner s = new Scanner(System.in);
				System.out.println("\nOOPS! File does not exist. Please input an existing file name ending with .txt\n");
				filename = s.next();
		}
		return filename;
	}
}

