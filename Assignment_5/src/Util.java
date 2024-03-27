
/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 5
 * Due: Nov 29
 * Submitted: Nov 29
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Util {
	// private variable
	private boolean DEBUG = false;
	private int numStudents=0;

	// This should be an instance method
	// Reads the file and builds student array.
	public Student[] readFile(String filename, Student[] stu) { 
		int count = 0; // keep track of student[] index
		int firstline = 1;

		try {
			// Open the file using FileReader Object.
			FileReader file = new FileReader(filename);// access the file

			BufferedReader buff = new BufferedReader(file);// create a buffer - improves performance

			boolean eof = false;// eof - end of file

			// In a loop read a line using readLine method.
			while (!eof) { // while there's parts of the string left...
				String line = buff.readLine();// ERROR??

				if (line == null)// if no more lines to read

					eof = true;// end of file reached

				else {
					//if (DEBUG)
						System.out.println(line); 

					numStudents++; //keep track of # students

					if (firstline > 1 && firstline%2 != 0 ) { //only read odd lines with data, for some reason blank lines become  0 0 0 0 0

						Student s = new Student();
						int scores[] = new int[5];

						// Tokenize each line using StringTokenizer Object
						// 6 columns = 6 tokens per line

						StringTokenizer st = new StringTokenizer(line);
						while (st.hasMoreTokens()) { // one row/line at a time , 1 row = 1 student

							s.setSID(Integer.parseInt(st.nextToken())); // assign ID to student
							
							for (int i = 0; i < 5; i++) 
							{
								// Each token is converted from String to Integer using parseInt method
								scores[i] = Integer.parseInt(st.nextToken());
							}
						}
						// Value is then saved in the right property of Student Object.
						s.setScores(scores); // add scores to student
						stu[count] = s; // add student to return array
						count++;
					}
					firstline++;
				}
			}
			buff.close();
		} catch (IOException e)
		{
			System.out.println("Error -- " + e.toString());
		}
		
		if (DEBUG) { //check if inputted correctly
			for (int i = 0; i < numStudents; i++) {
				stu[i].print();
				for (int j = 0; j < 5; j++)
					System.out.print(stu[i].getScores()[j] + " ");
				System.out.println("\n");
			}
		}

		return stu;

	}
	
	public int getnumstudents() {
		return (numStudents-1)/2;
	}
}
