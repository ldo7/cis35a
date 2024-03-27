/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: -1
 * Due: Oct 5
 * Submitted: Oct 5
 * 
 */

import java.util.Scanner;

public class CelsiusFahrenheit 
{
	public static void main(String[] args) 
	{
		//Variables
		float Celsius, Fahrenheit;
		
		//Input-Celsius
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a temperature in Celsius");
		Celsius = scan.nextInt();
		
		//Processing
		Fahrenheit = 32 + Celsius*1.8f;
		
		//Output
		System.out.println("The temperature in Fahrenheit is "+Fahrenheit + "\n");
		
		
		//Input-Fahrenheit
		System.out.println("Enter a temperature in Fahrenheit");
		Fahrenheit = scan.nextInt();
		
		//Processing
		Celsius = (Fahrenheit - 32)/1.8f;
		
		//Output
		System.out.println("The temperature in Celsius is "+Celsius);
	}
}
