/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 6
 * Due: Dec 7
 * Submitted: Dec 7
 * 
 */
package adapter;

import model.*;
import util.FileIO;

public abstract class StudentAPIImpl implements StudentAPI{
	
	private Student stu[];
	private Statistics stats;
	private StudentGrade s1[];
	private FileIO u1;
	
	public StudentAPIImpl() //similar to driver2
	{
		stu = new Student[15]; //max 15...
		
		//load text file
		u1 = new FileIO();
		stu = u1.readFile("/Users/lanido/Dropbox/workspaceCIS35/Assignment6/src/studentData.txt", stu);
		
		//compute statistics
		stats = new Statistics();
		stats.findlow(stu, u1.getnumstudents());
		stats.findhigh(stu, u1.getnumstudents());
		stats.findavg(stu, u1.getnumstudents());

		//create StudentGrade
		s1 = buildStudGradArray(stu,stats);
		
		//serialize StudentGrade Array
		u1.serializeGrades(s1);
	}
	
	//read the serialized file and print the score
	public void printStudentScore(int sid) {
		StudentGrade[] x = u1.deserialize(sid);
		x[0].getStudent().print();
	}
	
	//read any serialized file and print the value for statistics (is same in all files)
	public void printStatistics() {
		StudentGrade[] x = u1.deserialize(stu[1].getSID());
		x[0].getStat().print(4);
	}
	
	public static StudentGrade [] buildStudGradArray(Student [] stu, Statistics stats)
	{
		StudentGrade s1[] = new StudentGrade[stu.length]; 
		for (int i=0;i<stu.length;i++)
		{
			s1[i] = new StudentGrade(stu[i],stats);
		}
		
		return s1;
	}
}
