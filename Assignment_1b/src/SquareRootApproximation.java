/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 1
 * Due: Oct 11
 * Submitted: Oct 12
 * 
 */

import java.lang.Math;
import java.util.Scanner;

public class SquareRootApproximation 
{
	public static void main(String[] args) 
	{
		long n;
		
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Enter a number to find the square root approximation of:");
		n = scan.nextLong();
		
		if (n<0)
			System.out.println("\nInvalid Input Detected. Please input only positive values\n");
		
		}while(n<0);//if (-) input

		System.out.printf("The approximate square root of "+ n +" is %.3f", sqrt(n));
			
	}
	public static double sqrt(long n)
	{
		double lastGuess=1, nextGuess=(lastGuess + n / lastGuess) / 2; 
		//lastGuess= first guess, any # btw 0-1....or just assume = 1??	
		
		while (Math.abs(nextGuess-lastGuess) >= 0.0001)
		{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		return nextGuess;
	}
}
