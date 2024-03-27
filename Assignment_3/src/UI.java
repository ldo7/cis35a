/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 3
 * Due: Oct 10
 * Submitted: Oct 10
 * 
 */
import java.util.Scanner;

public class UI 
{
	private Franchise f;
	
	//default constructor
	public UI(Franchise f1)
	{
		f=f1;
	}
	
	//display data to user 
	public void play()
	{
		int store,choice;
		Scanner s = new Scanner(System.in);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!\t      WELCOME TO THE FRANCHISE APP \t\t!!\n!!~ We have the data for 6 stores in the last 5 weeks ~ !!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		while(true)
		{
			boolean valid=false;
			do
			{
				System.out.println("\nWhich store's analytics do you want to see? (Enter a number 1 through 6)");
				store=s.nextInt();
				if (store > 0 && store <7)
					valid=true;
				else
					System.out.println("Invalid Input!");

			}
			while(!valid);
			System.out.println("Select an Operation:");
			System.out.println("\tEnter 1 for total sales for each week");
			System.out.println("\tEnter 2 for average daily sales for each week");
			System.out.println("\tEnter 3 for total sales for all weeks");
			System.out.println("\tEnter 4 for average weekly sales");
			System.out.println("\tEnter 5 for week with the highest amount in sales");
			System.out.println("\tEnter 6 for week with the lowest amount in sales");
			System.out.println("\tEnter 7 for ALL analytical data");
			choice=s.nextInt();
			
			f.getStores(store-1).print(choice);

		}
	}
	
}
