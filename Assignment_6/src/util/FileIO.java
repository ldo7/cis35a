package util;
/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 5
 * Due: Dec 7
 * Submitted: Dec 7
 * 
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import exception.StudentGradingException;
import model.Student;


public class FileIO {
	private boolean DEBUG = false;
	private int numStudents=0;

	public Student[] readFile(String filename, Student[] stu) { 
		int count = 0; 
		int firstline = 1;

		try {
			FileReader file = new FileReader(filename);

			BufferedReader buff = new BufferedReader(file);

			boolean eof = false;

			while (!eof) {
				String line = buff.readLine();

				if (line == null)

					eof = true;

				else {
					if (DEBUG)
						System.out.println(line); 

					numStudents++; 

					if (firstline > 1 && firstline % 2 != 0 ) { 
						Student s = new Student();
						int scores[] = new int[5];

						StringTokenizer st = new StringTokenizer(line);
						while (st.hasMoreTokens()) { 

							s.setSID(Integer.parseInt(st.nextToken())); 
							
							for (int i = 0; i < 5; i++) 
							{
								scores[i] = Integer.parseInt(st.nextToken());
							}
						}
						s.setScores(scores); 
						stu[count] = s; 
						count++;
					}
					firstline++;
				}
			}
			buff.close();
		} 
		catch (IOException e)
		{
			System.out.println("Error -- " + e.toString());
		}
		return stu;
	}
	public int getnumstudents() {
		return (numStudents-1)/2;
	}
	
	
	public void createProblem(int i) throws StudentGradingException
	{
		//i=prob #
		//problem #1 - no file exists
		//problem #2 - alphanumeric error 10a instead 100
		
		boolean problemFixed = false;
		System.out.println("Inside main");
		String filename = "filedoesnotexist.txt"; 
		do { //fix = keep requesting user input until valid file name is found
			try {
				try {
					System.out.println("Attempting to Open "+filename+"....");
					FileInputStream a1 = new FileInputStream(filename); //try open file
					System.out.println("Now it is done! Your file had been found.");
					problemFixed = true;
				}
				catch(FileNotFoundException f) //if file DNE, cannot be opened
				{
					throw new StudentGradingException();
				}
			}
			catch(StudentGradingException e)
			{
				filename = e.fixProblemReadFromConsole(i); //fix error - create new file with that name OR request diff file name (Scanner)
			}
		}
		while(problemFixed == false);
	}
	
	
}
