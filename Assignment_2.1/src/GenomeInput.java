/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 2 pt.1
 * Due: Oct 30
 * Submitted: Oct 30
 * 
 */
import java.util.Scanner;

public class GenomeInput 
{
	public static void main(String args[])
	{
		//create 3 HumanGenome objects & request info
		GenomeInput g = new GenomeInput();
		HumanGenome Woody = g.readValue();
		Woody.print();
		HumanGenome Mulan = g.readValue();
		Mulan.print();
		HumanGenome Olaf = g.readValue();
		Olaf.print();
	}
	
	public HumanGenome readValue()
	{
		//Variables
		String genomeName;
		int numGenes, numChromosomes, numCells;
		
		Scanner scan = new Scanner(System.in);
		
		HumanGenome h = new HumanGenome();

		//Input
		System.out.println("What is the genome name?");
		genomeName = scan.nextLine();
		System.out.println("How many genes are there?");
		numGenes = scan.nextInt();
		scan.nextLine();
		System.out.println("How many chromosomes are there?");
		numChromosomes = scan.nextInt();
		System.out.println("How many cells are in their body in terms of trillions?");
		numCells = scan.nextInt();
		
		//Processing
		h.setGenomeName(genomeName);
		h.setNumGenes(numGenes);
		h.setNumChromosomes(numChromosomes);
		h.setNumCells(numCells);
		
		//output
		return h;
	}
}
