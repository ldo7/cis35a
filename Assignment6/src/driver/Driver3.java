/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 6
 * Due: Dec 7
 * Submitted: Dec 7
 * 
 */
package driver;

import adapter.SAPI;
import adapter.StudentAPIImpl;

public class Driver3 {

	public static void main (String[] args)
	{
		StudentAPIImpl a1 = new SAPI();
		a1.printStudentScore(1234);
		a1.printStatistics();
	}
}
