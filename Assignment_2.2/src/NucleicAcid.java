/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 2 pt.2
 * Due: Oct 30
 * Submitted: Oct 30
 * 
 */
public class NucleicAcid {
	//Variables
	private String name, chemicalFormula;
	private float molarMass, density;
	
	//default constructor, initialize object
	public NucleicAcid()
	{
		
	}
	
	//methods
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//chemical formula
	public String getChemicalFormula() {
		return chemicalFormula;
	}
	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}
	//molar mass
	public float getMolarMass() {
		return molarMass;
	}
	public void setMolarMass(float molarmass) {
		this.molarMass = molarmass;
	}
	//density
	public float getDensity() {
		return density;
	}
	public void setDensity(float density) {
		this.density = density;
	}
	//print
	public void print()
	{
		System.out.printf("\nNucleic Acid: %s\nChemical Formula: %s\nMolar Mass: %.3f g/mol\nDensity: %.3f g/cm^3\n\n",name, chemicalFormula,molarMass, density);
	}
	
}
