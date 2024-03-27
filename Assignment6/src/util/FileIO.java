
package util;

import java.io.*;
import java.util.StringTokenizer;
import exception.StudentGradingException;
import model.*;

public class FileIO {
	private boolean DEBUG = false;
	private int numStudents = 0;

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

					if (firstline > 1 && firstline % 2 != 0) {
						Student s = new Student();
						int scores[] = new int[5];

						StringTokenizer st = new StringTokenizer(line);
						while (st.hasMoreTokens()) {

							s.setSID(Integer.parseInt(st.nextToken()));

							for (int i = 0; i < 5; i++) {
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
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
		return stu;
	}

	public int getnumstudents() {
		return (numStudents - 1) / 2;
	}

	public void createProblem(int i) throws StudentGradingException {
		// i=prob #
		// problem #1 - no file exists
		// problem #2 - alphanumeric error 10a instead 100

		boolean problemFixed = false;
		System.out.println("Inside main");
		String filename = "filedoesnotexist.txt";
		do { // fix = keep requesting user input until valid file name is found
			try { 
				try { //need 2nd try block b/c using "throw"
					System.out.println("Attempting to Open " + filename + "....");
					FileInputStream a1 = new FileInputStream("/Users/lanido/Dropbox/workspaceCIS35/Assignment6/src/"+filename); // try open file
					System.out.println("Now it is done! Your file had been found.");
					problemFixed = true;
				} catch (FileNotFoundException f) // if file DNE, cannot be opened
				{
					throw new StudentGradingException();
				}
			} catch (StudentGradingException e) {
				filename = e.fixProblemReadFromConsole(i); // fix error - create new file with that name OR request diff
															// file name (Scanner)
			}
		} while (problemFixed == false);
	}

	//create new file (serialized file), containing one student's id, lab scores and class' high, low and avg for each quiz
	public void serializeGrades(StudentGrade[] a) {
	
		// if you have 15 student records--> write 15 files.
		String filename=null;
		System.out.println("\nSeralizing...");

		for (int i = 0; i < a.length; i++) {
			filename=a[i].getStudent().getSID()+".txt";
			System.out.println(filename);
			
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));//.dat .ser
				out.writeObject(a);
				out.close();
			} 
			catch (Exception e) {
				System.out.print("Error: " + e);
				System.exit(1);
			}
		}
		System.out.println("done!\n");
	}

	public void deserializeGrades(StudentGrade[] a) {

		String filename = null;
		StudentGrade[] x = null;
		System.out.println("\nDeserializing...");
		for (int i = 0; i < a.length; i++) {
			filename = "/Users/lanido/Dropbox/workspaceCIS35/Assignment6/" + a[i].getStudent().getSID() + ".txt";
			System.out.println(a[i].getStudent().getSID() + ".txt");

			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
				x = (StudentGrade[]) in.readObject();
				in.close();
			} 
			catch (Exception e) {
				System.out.print("Error: " + e);
				System.exit(1);
			}
		}
		System.out.println("done!\n");
		
		// print the results
		for (int i = 0; i < x.length; i++) {
			x[i].print();
		}
	}
	
	public StudentGrade[] deserialize(int sid)
	{
		String filename = null;
		StudentGrade[] x = null;

		filename = "/Users/lanido/Dropbox/workspaceCIS35/Assignment6/" + sid + ".txt";
		System.out.println("––––––––––––––––––––––––––––––––––––––––––––––");
		System.out.println("\nDeserializing...");
		System.out.println(sid + ".txt");

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
			x = (StudentGrade[]) in.readObject();
			in.close();
			System.out.println("done!\n");
		} 
		catch (Exception e) {
			System.out.print("Error: " + e);
			System.exit(1);
		}
		return x;
	}
}
