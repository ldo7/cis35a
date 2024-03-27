/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 4
 * Due: Nov 21
 * Submitted: Nov 21
 * 
 */
public class Driver1 {

	public static void main(String[] args) 
	{
		//System.out.println("DRIVER 1 \n");//DELETE AT END
		//saver1
		System.out.println("~~~ SAVINGS ACCOUNT #1 ~~~");
		SavingsAccount s1 = new SavingsAccount(2000);
		System.out.println("MONTH #1");
		s1.modifyInterestRate(4);
		s1.calculateMonthlyInterest();
		s1.print();
		System.out.println("MONTH #2");
		s1.modifyInterestRate(5);
		s1.calculateMonthlyInterest();
		s1.print();
		
		//saver2
		System.out.println("~~~ SAVINGS ACCOUNT #2 ~~~");
		SavingsAccount s2 = new SavingsAccount(3000);
		System.out.println("MONTH #1");
		s2.modifyInterestRate(4);
		s2.calculateMonthlyInterest();
		s2.print();
		System.out.println("MONTH #2");
		s2.modifyInterestRate(5);
		s2.calculateMonthlyInterest();
		s2.print();
		
	}
}