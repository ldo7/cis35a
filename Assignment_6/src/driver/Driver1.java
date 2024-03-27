package driver;

import exception.StudentGradingException;
import model.Statistics;
import model.Student;
import util.FileIO;

/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 5
 * Due: Dec 7
 * Submitted: Dec 7
 * 
 */

public class Driver1 {
	public static void main(String[] args) throws StudentGradingException { //fix this part later...
		Student lab2[] = new Student[40]; 
		
		// Populate the student array with txt file
		FileIO u1 = new FileIO();
		lab2 = u1.readFile("/Users/lanido/Dropbox/workspaceCIS35/Assignment_5/src/StudentData.txt", lab2);
		
		Statistics statlab2 = new Statistics();
		statlab2.findlow(lab2, u1.getnumstudents());
		statlab2.findhigh(lab2, u1.getnumstudents());
		statlab2.findavg(lab2, u1.getnumstudents());
		
		
		u1.createProblem(1); //Problem #1 - File does not exist
		
	}
}
