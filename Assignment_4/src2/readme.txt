
	This file contains 4 java programs: 
	
	1. Ship.java is the parent class of both CargoShip.java and CruiseShip.java. This file holds the blueprint to create the most basic ship
		and holds information about the ship's name, origin, departuredate, arrivaldate, departingport, arrivalport, owner, capacity, length, width, 
		height, and floating status.The file also contains the appropriate getter and setter methods, and print method that displays all specifications.
	
	2. CargoShip.java is a child class to SavingsAccount.java, and OVERRIDES the parent's print() & sound() method because cargo ships have more properties 
		than normal ships, including cargotype, loadingmethod, numberofcranes, cargovalue, and contraband status. The file also contains the appropriate 
		getter and setter methods, and print method that displays all appropriate specifications.
	
	
	1. CruiseShip.java is a child class to SavingsAccount.java, and OVERRIDES the parent's print() method because cruise ships have more properties 
		than normal ships, including ticketprice, numberofrooms, buffetmenu, cruisetype, and services. The file also contains the appropriate getter 
		and setter methods, and print method that displays all appropriate specifications.
	
	2. Driver.java instantiates ship, cargoShip, and cruiseShip objects, then puts them in an array of Ships, and prints the specifications of all ships.