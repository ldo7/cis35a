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

public class Statistics implements Serializable{

	private static final long serialVersionUID = 1L;

	private int[] lowscores = new int[5];

	private int[] highscores = new int[5];

	private float[] avgscores = new float[5];
	
	/*
	 * This method will find the lowest score and store it in an array names
	 * lowscores.
	 */
	public void findlow(Student[] a, int numstudents) {
		
		for (int i=0;i<5;i++) //iterate through quizes
		{
			int low=a[0].getScores()[i];
			
			for(int j=0;j<numstudents;j++) //iterate list of students
			{
				int[] temp = a[j].getScores();
				if (low > temp[i])
				{
					low=temp[i];
				}
			}
			lowscores[i]=low;
		}
	}

	/*
	 * This method will find the highest score and store it in an array names
	 * highscores.
	 */
	public void findhigh(Student[] a, int numstudents) {
		
		for (int i=0;i<5;i++) //iterate through quizes
		{
			int high=a[0].getScores()[i];
			
			for(int j=0;j<numstudents;j++) //iterate list of students
			{
				int[] temp = a[j].getScores();
				if (high < temp[i])
				{
					high=temp[i];
				}
			}
			highscores[i]=high;
		}
	}

	/*
	 * This method will find avg score for each quiz and store it in an array names
	 * avgscores.
	 */
	public void findavg(Student[] a, int numstudents) {
		
		for (int i=0;i<5;i++) //iterate through quizes
		{
			float sum=0;
			for(int j=0;j<numstudents;j++) //iterate list of students
			{
				sum+=a[j].getScores()[i];
			}
			avgscores[i]=sum/numstudents;
		}
	}

	public void print(int option) {
		System.out.println();
		// 1 - print low scores, 2 - print high scores, 3 - print avg - 4 print all.
		switch(option) {
		case 1:
			System.out.print("\nLowest Scores: ");
			for(int i=0;i<5;i++)
				System.out.print(lowscores[i]+" ");
			System.out.println();
			break;
		case 2:
			System.out.print("Highest Scores: ");
			for(int i=0;i<5;i++)
				System.out.print(highscores[i]+" ");
			System.out.println();
			break;
		case 3:
			System.out.print("Average Scores: ");
			for(int i=0;i<5;i++)
				System.out.printf("%.2f ",avgscores[i]);
			System.out.println();
			break;
		case 4:
			System.out.print("Lowest Scores: ");
			for(int i=0;i<5;i++)
				System.out.print(lowscores[i]+" ");
			System.out.print("\nHighest Scores: ");
			for(int i=0;i<5;i++)
				System.out.print(highscores[i]+" ");
			System.out.print("\nAverage Scores: ");
			for(int i=0;i<5;i++)
				System.out.printf("%.2f ",avgscores[i]);
			System.out.println("\n");
			break;
		}

	}
	//getters & setters
	public int[] getLowscores() {
		return lowscores;
	}

	public void setLowscores(int[] lowscores) {
		this.lowscores = lowscores;
	}

	public int[] getHighscores() {
		return highscores;
	}

	public void setHighscores(int[] highscores) {
		this.highscores = highscores;
	}

	public float[] getAvgscores() {
		return avgscores;
	}

	public void setAvgscores(float[] avgscores) {
		this.avgscores = avgscores;
	}


}