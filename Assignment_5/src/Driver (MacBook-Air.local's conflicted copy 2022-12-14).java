import model.Statistics;
import model.Student;
import util.FileIO;

/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 6
 * Due: Nov 29
 * Submitted: Nov 29
 * 
 */

public class Driver {
	public static void main(String[] args) {
		
		Student lab2[] = new Student[15]; 
		
		// Populate the student array with txt file
		FileIO u1 = new FileIO();
		lab2 = u1.readFile("/Users/lanido/Dropbox/workspaceCIS35/Assignment_5/src/StudentData.txt", lab2);
		
		Statistics statlab2 = new Statistics();
		statlab2.findlow(lab2, u1.getnumstudents());
		statlab2.findhigh(lab2, u1.getnumstudents());
		statlab2.findavg(lab2, u1.getnumstudents());

		statlab2.print(1);
		statlab2.print(2);
		statlab2.print(3);
		statlab2.print(4);
		
	}
}
