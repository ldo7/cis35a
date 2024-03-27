/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 2 pt.2
 * Due: Oct 30
 * Submitted: Oct 30
 * 
 */
import java.util.Scanner;

public class GenoNucleicAcid {

	public static void main (String args[])
	{
		//create 5 NucleicAcid objects & request info
		GenoNucleicAcid g = new GenoNucleicAcid();
		NucleicAcid Cytosine = g.readValue();
		Cytosine.print();
		NucleicAcid Adenine = g.readValue();
		Adenine.print();
		NucleicAcid Guanine = g.readValue();
		Guanine.print();
		NucleicAcid Thymine = g.readValue();
		Thymine.print();
		NucleicAcid Uracil = g.readValue();
		Uracil.print();
		
	}
	
	public NucleicAcid readValue()
	{
		//Variables
		String name, chemicalFormula;
		float molarmass, density;
		
		
		NucleicAcid n = new NucleicAcid();
		Scanner scan = new Scanner(System.in);
		
		//Input
		System.out.println("What is the Name of the Nucleic Acid?");
		name = scan.nextLine();
		System.out.println("What is the Chemical Formula?");
		chemicalFormula = scan.nextLine();
		System.out.println("What is the Molar Mass in g/mol?");
		molarmass = scan.nextFloat();
		System.out.println("What is the Density in g/cm^3?");
		density = scan.nextFloat();
		
		//Processing
		n.setName(name);
		n.setChemicalFormula(chemicalFormula);
		n.setMolarMass(molarmass);
		n.setDensity(density);
		
		//output
		return n;
	}
	
}
