/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 4
 * Due: Nov 21
 * Submitted: Nov 21
 * 
 */
public class SavingsAccount {
	//private variables
	private static double annualInterestRate;
	private double savingsBalance;
	
	//constructors
	public SavingsAccount()
	{
		savingsBalance=0;
		annualInterestRate=0;
	}
	public SavingsAccount(double balance)
	{
		savingsBalance=balance;
	}
	
	//methods
	public void calculateMonthlyInterest()
	{
		double intrest = savingsBalance*annualInterestRate/12.0;
		savingsBalance+=intrest;
	}
	public static void modifyInterestRate(double rate)
	{
		annualInterestRate = rate/100.0;
	}

	public void print()
	{
		System.out.printf("Total Balance: %.2f\n\n", savingsBalance);
	}

	//getters & setters
	protected static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	protected static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate/100;
	}

	protected double getSavingsBalance() {
		return savingsBalance;
	}

	protected void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
}
