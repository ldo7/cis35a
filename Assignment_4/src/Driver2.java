/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 4
 * Due: Nov 21
 * Submitted: Nov 21
 * 
 */
public class Driver2 {

	public static void main(String[] args) 
	{
		//System.out.println("DRIVER 2 \n");//DELETE AT END
		SpecialSavings s1 = new SpecialSavings(2000.0); //below 10k
		SpecialSavings s2 = new SpecialSavings(3000.0); //below 10k
		
		//saver1
		System.out.println("~~~ SPECIAL SAVINGS ACCOUNT #1 ~~~");
		System.out.println("MONTH #1");
		s1.calculateMonthlyInterest();
		s1.print(); 	  //below 10k
		
		System.out.println("MONTH #2");
		s1.deposit(9000); //above 10k
		s1.calculateMonthlyInterest(); //change interest rate if above 10k
		s1.print();
		
		System.out.println("MONTH #3");
		s1.withdraw(11000); //below 10k
		s1.calculateMonthlyInterest();
		s1.print();
		
		
		//saver2
		System.out.println("~~~ SPECIAL SAVINGS ACCOUNT #2 ~~~");
		System.out.println("MONTH #1");
		s2.calculateMonthlyInterest();
		s2.print();
		
		System.out.println("MONTH #2");
		s2.deposit(10000); //above 10k
		s2.calculateMonthlyInterest();
		s2.print();
		
		System.out.println("MONTH #3");
		s2.deposit(300); //above 10k
		s2.calculateMonthlyInterest();
		s2.print();
		
	}
}
