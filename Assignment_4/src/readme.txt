
	This file contains 4 java programs: 
	
	1. SavingsAccount.java is the parent class of SpecialSavings.java. This file holds the blueprint to create a savings account that holds a user's 
		savings amount and annual interest rate, has public methods that allow the user to access, modify, and print their savings amount 
		and annual interest rate, and has protected methods that only allow it's child class to access.
	
	
	2. SpecialSavings.java is a child class to SavingsAccount.java, and adjusts the interest rate of any account with under 10K savings 
		to 4% and any account over 10K to 10% by overriding it's parent method.
	
	
	3. Driver1.java instantiates two different SavingsAccount objects, saver1 and saver2, with different balances, then calculates the 
		monthly interest, and prints the new balances for each account based each month's interest rates.
	
	
	4. Driver 2.java instantiates two different SpecialSavings objects, saver1 and saver2, with different balances, and makes a few 
		deposits and withdrawals at the beginning of each month, then calculates new monthly interest depending on whether the balance 
		is above or below 10K, and prints the new balance and annual interest earned for each account. 