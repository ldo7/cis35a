/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 4
 * Due: Nov 21
 * Submitted: Nov 21
 * 
 */
public class CargoShip extends Ship{
	//private variables
	private String cargotype, loadingmethod;
	private int numberofcranes, cargovalue;
	private boolean contraband;
	
	//constructor
	public CargoShip(String name, String origin, String departuredate, String arrivaldate, String departingport,
			String arrivalport, String owner, int capacity, int length, int width, int height, boolean floating,
			String cargotype, String loadingmethod, int numberofcranes, int cargovalue, boolean contraband) 
	{
		super(name, origin, departuredate, arrivaldate, departingport, arrivalport, owner, capacity, length, width,
				height, floating);
		this.cargotype = cargotype;
		this.loadingmethod = loadingmethod;
		this.numberofcranes = numberofcranes;
		this.cargovalue = cargovalue;
		this.contraband = contraband;
	}

	//overrided methods
	public void print()
	{
		System.out.printf("\n~~~~~ CARGO SHIP ~~~~~ \nName: %s\nIs Floating: %b\nOrigin: %s\nDeparture: %s\nArrival Date: %s\nDeparting Port: %s\nArrival Port: %s\nOwner:"
				+ " %s\nCapacity: %d package units\nLength: %d meters\nWidth: %d meters\nHeight: %d meters\nHorn Sound: %s\nCargotype: %s\nLoading Method: %s\nNumber of Cranes: %d\nCargo Value: $%d\nContraband: %b\n\n", 
				getName(), isFloating(), getOrigin(), getDeparturedate(), getArrivaldate(), getDepartingport(), getArrivalport(), getOwner(), getCapacity(), 
				getLength(), getWidth(), getHeight(), sound(), cargotype, loadingmethod, numberofcranes, cargovalue, contraband);
	}
	public String sound()
	{
		return "HONK HONK";
	}
	
	//getters & setters
	public String getCargotype() {
		return cargotype;
	}

	public void setCargotype(String cargotype) {
		this.cargotype = cargotype;
	}

	public String getLoadingmethod() {
		return loadingmethod;
	}

	public void setLoadingmethod(String loadingmethod) {
		this.loadingmethod = loadingmethod;
	}

	public int getNumberofcranes() {
		return numberofcranes;
	}

	public void setNumberofcranes(int numberofcranes) {
		this.numberofcranes = numberofcranes;
	}

	public int getCargovalue() {
		return cargovalue;
	}

	public void setCargovalue(int cargovalue) {
		this.cargovalue = cargovalue;
	}

	public boolean isContraband() {
		return contraband;
	}

	public void setContraband(boolean contraband) {
		this.contraband = contraband;
	}

}
