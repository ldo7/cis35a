package driver;
import model.Statistics;
import model.Student;
import model.StudentGrade;
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

public class Driver2 {
	public static void main(String[] args) {
		
		Student stu[] = new Student[15]; //max 15...
		
		FileIO u1 = new FileIO();
		stu = u1.readFile("/Users/lanido/Dropbox/workspaceCIS35/Assignment6/src/studentData.txt", stu);
		
		Statistics stats = new Statistics();
		stats.findlow(stu, u1.getnumstudents());
		stats.findhigh(stu, u1.getnumstudents());
		stats.findavg(stu, u1.getnumstudents());

		//Req.2
		StudentGrade s1[] = buildStudGradArray(stu,stats);
		
		u1.serializeGrades(s1);
		u1.deserializeGrades(s1);
		
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
