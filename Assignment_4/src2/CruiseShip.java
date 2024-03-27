/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 4
 * Due: Nov 21
 * Submitted: Nov 21
 * 
 */
public class CruiseShip extends Ship {
	//some methods - in Ship, CargoShip and CruiseShip - should be overridden - demonstrate polymorphism.
	private int ticketprice, numberofrooms;
	private String buffetmenu, cruisetype; //buffet menu????
	private String[] services;

	//constructor
	public CruiseShip(String name, String origin, String departuredate, String arrivaldate, String departingport,
			String arrivalport, String owner, int capacity, int length, int width, int height, boolean floating,
			int ticketprice, int numberofrooms, String buffetmenu, String cruisetype, String[] services) 
	{
		super(name, origin, departuredate, arrivaldate, departingport, arrivalport, owner, capacity, length, width,
				height, floating);
		this.ticketprice = ticketprice;
		this.numberofrooms = numberofrooms;
		this.buffetmenu = buffetmenu;
		this.cruisetype = cruisetype;
		this.services = services;
	}

	//overrided methods
	public void print()
	{
		System.out.printf("\n~~~~~ CRUISE SHIP ~~~~~ \nName: %s\nIs Floating: %b\nOrigin: %s\nDeparture: %s\nArrival Date: %s\nDeparting Port: %s\nArrival Port: %s\nOwner:"
				+ " %s\nCapacity: %d people\nLength: %d meters\nWidth: %d meters\nHeight: %d meters\nHorn Sound: %s\nTicket Price: $%d\nNumber of Rooms: %d\nBuffet Menu: %s cuisine\nCruise Type: %s", 
				getName(), isFloating(), getOrigin(), getDeparturedate(), getArrivaldate(), getDepartingport(), getArrivalport(), getOwner(), getCapacity(), 
				getLength(), getWidth(), getHeight(), sound(), ticketprice, numberofrooms, buffetmenu, cruisetype);
		System.out.print("\nServices: ");
		for (int i=0; i<services.length;i++)
		{
			System.out.print(services[i]+", ");
		}
		System.out.println("\n\n");
	}
	public String sound()
	{
		return "BRRRRRR";
	}
	
	//getters & setters
	public int getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}

	public int getNumberofrooms() {
		return numberofrooms;
	}

	public void setNumberofrooms(int numberofrooms) {
		this.numberofrooms = numberofrooms;
	}

	public String getBuffetmenu() {
		return buffetmenu;
	}

	public void setBuffetmenu(String buffetmenu) {
		this.buffetmenu = buffetmenu;
	}

	public String getCruisetype() {
		return cruisetype;
	}

	public void setCruisetype(String cruisetype) {
		this.cruisetype = cruisetype;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

}
