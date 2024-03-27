/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 2a
 * Due: Oct 24
 * Submitted: Oct 24
 * 
 */
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		//create 3 person objects & request info
		Driver d1 = new Driver();
        Person p1 = d1.readValue();
        p1.print();
        Person p2 = d1.readValue();
        p2.print(); 
        Person p3 = d1.readValue();
        p3.print();
	}
	
	public Person readValue()
	{
		//Variables
		String name, address, phoneNumber;
		int age;
		Scanner scan = new Scanner(System.in);
		
		Person p = new Person();
		
		//Input
		System.out.println("What is your name?");
		name = scan.nextLine();
		System.out.println("What is your age?");
		age = scan.nextInt();
		scan.nextLine();
		System.out.println("What is your address?");
		address = scan.nextLine();
		System.out.println("What is your phone number?");
		phoneNumber = scan.nextLine();
		
		//Processing
		p.setName(name);
		p.setAddress(address);
		p.setAge(age);
		p.setPhoneNumber(phoneNumber);
		
		//output
		return p;
	}
}
