package model;

import java.io.Serializable;

public class StudentGrade implements Serializable {

	private static final long serialVersionUID = 1L;
	private Student student;
	private Statistics stats;

	public StudentGrade() {}
	
	public StudentGrade(Student stu, Statistics stats)
	{
		student = stu;
		this.stats = stats;
	}
	
	//print student results
	public void print()
	{
		System.out.println("––––––––––––––––––––––––––––––––––––––––––––––");
		student.print();
		stats.print(4);
	}
	
	//getter & setters
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Statistics getStat() {
		return stats;
	}
	
	public void setStat(Statistics stat) {
		this.stats = stat;
	}
}
