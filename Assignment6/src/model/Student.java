/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 6
 * Due: Dec 7
 * Submitted: Dec 7
 * 
 */

package model;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	//private variables
	private int SID;
	private int scores[] = new int[5];

	public Student() {
	}
	
	public Student(int SID)
	{
		this.SID = SID;
	}
	
	public void print()
	{
		System.out.println("Student ID: "+SID);
		for (int i=0;i<5;i++)
		{
			System.out.print("\nQuiz "+ (i+1)+": ");
			System.out.println(scores[i]);
		}
	}
	
	//getters & setters
	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}


}
