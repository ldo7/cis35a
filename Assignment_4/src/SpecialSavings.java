/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 4
 * Due: Nov 21
 * Submitted: Nov 21
 * 
 */
public class SpecialSavings extends SavingsAccount{
	
	//constructor
	public SpecialSavings(double balance)
	{
		super(balance);
		//savingsBalance=getSavingsBalance();
		//annualInterestRate=getAnnualInterestRate();
	}
	
	//methods 
	public void calculateMonthlyInterest () { //override
		if (getSavingsBalance() >= 10000)
		{
			setAnnualInterestRate(10);
		}
		else
		{
			setAnnualInterestRate(4);
		}
		super.calculateMonthlyInterest();
	}
	public void deposit(double amount)
	{
		System.out.printf("Deposit: %.2f\n",amount);
		setSavingsBalance(getSavingsBalance()+amount); //child class uses parent's protected methods to change priv. variables
	}
	public void withdraw(double amount)
	{
		System.out.printf("Withdraw: %.2f\n",amount);
		setSavingsBalance(getSavingsBalance()-amount);
	}
	public void print()//override
	{
		System.out.printf("Total Balance: %.2f\nAnnual Interest: %.1f%s\n\n", getSavingsBalance(), getAnnualInterestRate()*100, '%');
	}
}
