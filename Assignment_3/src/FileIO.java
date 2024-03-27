/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 3
 * Due: Oct 10
 * Submitted: Oct 10
 * 
 */
import java.io.*;
import java.util.*;

public class FileIO {
	private String fname = null;
	private boolean DEBUG = false; //DIY debugger, can be turned on/off by setting to true/false

	//constructor
	public FileIO(String fname) {//input the file to be read when instantiated
		this.fname = fname;
	}

	public Franchise readData() {
		Franchise a1 = null;
		int counter = 0; 	//count # of lines read - "Code Parsing"
		try {		//try statement - if there is any failure, program will halt
			FileReader file = new FileReader(fname); 		//access the file
			BufferedReader buff = new BufferedReader(file); //create a buffer - improves performance
			String temp; 									//need buffer b/c stream only reads 1 character at a time
			boolean eof = false; //eof - end of file
			while (!eof) {		//while there's parts of the string left...
				String line = buff.readLine(); //temporarily store string of data in buffer to parse through & check validity of data 
				counter++;		//go to next line
				if (line == null) //if reached end of file, no more lines to read
					eof = true;
				else {
					if (DEBUG)
						System.out.println("Reading" + line); //Display the current line being read
					if (counter == 1) {	//first line of Salesdat.txt holds number of stores
						temp = line;
						a1 = new Franchise(Integer.parseInt(temp)); //convert first String line into a number to create 6 stores
						if (DEBUG)
							System.out.println("d  " + a1.numberofstores()); //compare number of stores stated in 1st line of Salesdat.txt with Franchise method's returned value
					}
					if (counter == 2)//2nd line of Salesdat.txt contains Day numbers
						;			//does nothing...b/c num of days is instead calculated from num of columns
					if (counter > 2) { //these lines only contain numerical data
						  	int x = buildStore(a1, (counter-3), line); //Compare number of weeks read in txt file with num weeks actually printed by Store object method
							if (DEBUG) {
								System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x); //Display weeks read in txt file
								System.out.println("Data read:");
								a1.getStores(counter-3).printdata(); //print all the sales data from 1 store
							}
					}
				}
			}
			buff.close();
		} catch (Exception e) { //if any line within try statement fails, catch statements execute 
			System.out.println("Error -- " + e.toString());
		}
		return a1;
	}

	public int buildStore(Franchise a1, int counter, String temp) { 
		Store tstore = new Store(); //create a store
		String s1  =  ""; //used to store values from each column
		float sale = 0.0f;
		int week = 0;
		int day = 0;
		StringTokenizer st = new StringTokenizer(temp); // "chop string into smaller chunks"
	    while (st.hasMoreTokens()) { 		//while there's parts of the string left...
	         for(day=0;day<7;day++)		//iterate through each day of the week
	         {
		    	 s1 = st.nextToken();		//grab next data point
		         sale = Float.parseFloat(s1);	//convert string back into number 
	        	 tstore.setsaleforweekdayintersection(week, day, sale); //populate store object with data
	         }
	         week++;
	    }
		a1.setStores(tstore, counter); //send the store to Franchise
	    return week; //should return 5, if parsing done correctly
	}
}
