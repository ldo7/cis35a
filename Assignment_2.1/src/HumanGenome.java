/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 2 pt.1
 * Due: Oct 30
 * Submitted: Oct 30
 * 
 */
public class HumanGenome 
{
	//Variables
	private String genomeName;
	private int numGenes, numChromosomes, numCells;

	//default constructor, initialize object
	public HumanGenome()
	{
		
	}
	
	//methods
	//name
	public String getGenomeName() {
		return genomeName;
	}

	public void setGenomeName(String genomeName) {
		this.genomeName = genomeName;
	}
	//number of genes
	public int getNumGenes() {
		return numGenes;
	}

	public void setNumGenes(int numGenes) {
		this.numGenes = numGenes;
	}
	//number of chromosomes
	public int getNumChromosomes() {
		return numChromosomes;
	}

	public void setNumChromosomes(int numChromosomes) {
		this.numChromosomes = numChromosomes;
	}
	//number of cells
	public int getNumCells() {
		return numCells;
	}

	public void setNumCells(int numCells) {
		this.numCells = numCells;
	}
	//print
	public void print()
	{
		System.out.printf("\nGenome Name: %s\nNumber of Genes: %s\nNumber of Chromosomes: %s\nNumber of cells (in trillions): %s\n\n",
							genomeName,numGenes, numChromosomes, numCells);
	
	}
	
}
