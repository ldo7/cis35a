/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 4
 * Due: Nov 21
 * Submitted: Nov 21
 * 
 */
public class Ship {
	//private variables
	private String name, origin, departuredate, arrivaldate, departingport, arrivalport, owner;
	private int capacity, length, width, height;
	private boolean floating;

	//constructor
	public Ship(String name, String origin, String departuredate, String arrivaldate, String departingport,
			String arrivalport, String owner, int capacity, int length, int width, int height, boolean floating) 
	{
		this.name = name;
		this.origin = origin;
		this.departuredate = departuredate;
		this.arrivaldate = arrivaldate;
		this.departingport = departingport;
		this.arrivalport = arrivalport;
		this.owner = owner;
		this.capacity = capacity;
		this.length = length;
		this.width = width;
		this.height = height;
		this.floating = floating;
	}

	
	//these methods will overrided in child classes
	public void print()
	{
		System.out.printf("~~~~~ SHIP ~~~~~ \nName: %s\nIs Floating: %b\nOrigin: %s\nDeparture: %s\nArrival Date: %s\nDeparting Port: %s\nArrival Port: %s\nOwner:"
				+ " %s\nCapacity: %d people\nLength: %d meters\nWidth: %d meters\nHeight: %d meters\nHorn Sound: %s\n\n", name, floating, origin, departuredate, arrivaldate, 
				departingport, arrivalport, owner, capacity, length, width, height, sound());
	}
	public String sound()
	{
		return "BEEP BEEP";
	}

	
	//getters & setters
	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected String getOrigin() {
		return origin;
	}


	protected void setOrigin(String origin) {
		this.origin = origin;
	}


	protected String getDeparturedate() {
		return departuredate;
	}


	protected void setDeparturedate(String departuredate) {
		this.departuredate = departuredate;
	}


	protected String getArrivaldate() {
		return arrivaldate;
	}


	protected void setArrivaldate(String arrivaldate) {
		this.arrivaldate = arrivaldate;
	}


	protected String getDepartingport() {
		return departingport;
	}


	protected void setDepartingport(String departingport) {
		this.departingport = departingport;
	}


	protected String getArrivalport() {
		return arrivalport;
	}


	protected void setArrivalport(String arrivalport) {
		this.arrivalport = arrivalport;
	}


	protected String getOwner() {
		return owner;
	}


	protected void setOwner(String owner) {
		this.owner = owner;
	}


	protected int getCapacity() {
		return capacity;
	}


	protected void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	protected int getLength() {
		return length;
	}


	protected void setLength(int length) {
		this.length = length;
	}


	protected int getWidth() {
		return width;
	}


	protected void setWidth(int width) {
		this.width = width;
	}


	protected int getHeight() {
		return height;
	}


	protected void setHeight(int height) {
		this.height = height;
	}


	protected boolean isFloating() {
		return floating;
	}


	protected void setFloating(boolean floating) {
		this.floating = floating;
	}



}
