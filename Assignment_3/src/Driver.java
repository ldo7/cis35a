/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 3
 * Due: Oct 10
 * Submitted: Oct 10
 * 
 */
public class Driver {

	public static void main(String[] args) 
	{
		FileIO a1 = new FileIO("/Users/lanido/Dropbox/workspaceCIS35/Assignment_3/src/Salesdat.txt");
		Franchise f = a1.readData();
		f.calc(); 
		UI ui = new UI(f);
		ui.play();
	}

}
