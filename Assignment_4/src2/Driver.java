/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 4
 * Due: Nov 21
 * Submitted: Nov 21
 * 
 */
public class Driver {
	
	public static void main(String[] args) 
	{
		Ship s = new Ship("Abby", "Chile", "11/11/2022", "03/05/2023","Brazil", "Cuba", "Captain Bob", 7000, 341, 57, 82,true);
		CargoShip c1 = new CargoShip("Cartel A", "Colombia", "01/01/2024", "02/01/2024","Thailand", "USA", "Ms. Smith", 2700, 137, 17, 9,true, "Drugs", "via Truck", 2, 3000000, true);
			String[] services = {"Suites", "Gym", "Baths", "Swimming Pool", "Tennis Court", "Barber Shop", "Smoking Room","Cafe", "Lounge", "Staircase", "Ballroom"};
		CruiseShip c2 = new CruiseShip("Titanic", "England", "04/11/1912 ", "04/14/1912 ","Southampton, England", "New York, USA", "J.P. Morgan", 3320, 269, 29, 53,false, 400, 840, "French", "Ocean", services ); 

		Ship[] ships = new Ship[3];
		ships[0]= s;
		ships[1] = c1;
        ships[2] = c2;
        
        for (int i = 0 ; i < ships.length;i++)
        {
            ships[i].print();
        }
	}
}
