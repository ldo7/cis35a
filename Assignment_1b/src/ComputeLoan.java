/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 1
 * Due: Oct 12
 * Submitted: Oct 11
 * 
 */

import java.util.Scanner;

public class ComputeLoan 
{
	public static void main(String[] args) 
	{
		//Variables
		double loanAmount, annualInterestRate, numberOfYears;
		
		//Input
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Loan Amount: ");
		loanAmount = scan.nextDouble();
		System.out.println("Number of Years: ");
		numberOfYears = scan.nextDouble();
		System.out.println("Annual Interest Rate: ");
		annualInterestRate = scan.nextDouble();

		//request input again if any (-) or zero values 
		if(annualInterestRate<=0 || numberOfYears<=0 || loanAmount<=0)
			System.out.println("\nInvalid Input Detected. Please input only positive values\n");

		} while(annualInterestRate<=0 || numberOfYears<=0 || loanAmount<=0); 
		
		calculatePayments(loanAmount, numberOfYears, annualInterestRate);
	}
	
	public static void calculatePayments (double l, double y, double a)
	{
		//Variables
		double loanAmount=l, annualInterestRate=a, monthlyInterestRate, numberOfYears=y,
		n, i, monthlyPayment, totalPayment, interest, balance, principal;
		
		//Processing
		annualInterestRate = annualInterestRate / 100;
		monthlyInterestRate = annualInterestRate / 12;
		balance = loanAmount;
		
		n = numberOfYears * 12;
		i = monthlyInterestRate;
		
		monthlyPayment = loanAmount * (i*Math.pow(i + 1, n)) / (Math.pow(i + 1, n) - 1);
		totalPayment = n * monthlyPayment;
		
		System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n", totalPayment);

		//Output
		System.out.printf("\n%s\t%s\t%s\t%s\n", "Payment#", "Interest", "Principal", "Balance");
		
		for (int t=1; t<=n; t++)
		{
			interest = monthlyInterestRate * balance; 
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", t, interest, principal, balance);
		
		}
	}
}
