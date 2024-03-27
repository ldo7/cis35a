/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 2a
 * Due: Oct 24
 * Submitted: Oct 24
 * 
 */

public class Person 
{
	//Instance variables
	private String name, address, phoneNumber;
	private int age;
	
	//default constructor, initialize object
	public Person()
	{
		
	}
	//overloaded constructor
	public Person(String Name, int Age, String Address, String PhoneNumber)
	{
		name=Name;
		age=Age;
		address=Address;
		phoneNumber=PhoneNumber;
	}
	
	//Age
	public int age()
	{
		return age;
	}
	public void setAge(int a)
	{
		age=a;
	}
	
	//Name
	public String name()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
	
	//Address
	public String address()
	{
		return address;
	}
	public void setAddress(String a)
	{
		address=a;
	}
	
	//Phone Number
	public String phoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String p)
	{
		phoneNumber=p;
	}
	
	//Print
	public void print()
	{
		System.out.println("\nName: "+name+"\nAge: "+age+"\nPhone Number: "
							+phoneNumber+"\nAddress: "+address+"\n");
	}
	
}


