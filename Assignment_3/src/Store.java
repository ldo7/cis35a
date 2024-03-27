/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 3
 * Due: Oct 10
 * Submitted: Oct 10
 * 
 */
public class Store {
	//variables
	private float salesbyweek[][];
	private float totalsalesbyweek[];
	private float avgsalesbyweek[];
	private float totalsalesforallweeks;
	private float avgweekleysales;
	private float weekwithhighestsales;
	private float weekwithlowestsales;

	//constructor
	Store() 
	{
		salesbyweek = new float[5][7];
		totalsalesbyweek = new float[5];
		avgsalesbyweek = new float[5];
		totalsalesforallweeks=0;
		avgweekleysales=0;
		weekwithhighestsales=0;
		weekwithlowestsales=0;
	}
	
	//Calculations
	public void calctotalsalesbyweek() {
		for (int i=0; i<5;i++) //iterate through weeks
		{
			int t=0;
			for (int j=0;j<7;j++) //iterate through sales
			{
				t+=salesbyweek[i][j]; //make sum of sales
			}
			totalsalesbyweek[i]=t;
		}
	}
	public void calcavgsalesbyweek() {
		for (int i=0; i<5;i++) 
		{
			avgsalesbyweek[i]=totalsalesbyweek[i]/7; //find avg = totalsales/numsales
		}
	}
	public void calctotal() {
		for (int i=0; i<totalsalesbyweek.length;i++) //iterate through weeks
		{
			totalsalesforallweeks += totalsalesbyweek[i]; //make sum of all sales
		}
	}
	public void calcavgweeklysales() {
		for (int i=0; i<5;i++) //find total number of weeks
		{
			avgweekleysales += avgsalesbyweek[i];
		}
		avgweekleysales /= 5; //5 days per week?
	}
	public void calcweekwithhighestsales() {
		float numSales=0;
		weekwithhighestsales=1; //default 
		for (int i=0; i<5;i++) 
		{
			if(totalsalesbyweek[i] > numSales) // if the sales in this week is greater than the prev. recorded one, then replace it with new highest value
			{
				numSales = totalsalesbyweek[i];
				weekwithhighestsales = i+1; //starts at week 1, not 0
			}
		}
	}
	public void calcweekwithlowestsales() {
		float numSales=totalsalesbyweek[0];
		weekwithlowestsales=1;
		for (int i=1; i<5;i++) 
		{
			if(totalsalesbyweek[i] < numSales) // if the sales in this week is LESS than the prev. recorded one, then replace it with new lowest value
			{
				numSales = totalsalesbyweek[i];
				weekwithlowestsales = i+1; //week 1 is at array position 0
			}
		}
	}
	
	public void analyzeresults() {
		calctotalsalesbyweek();
		calcavgsalesbyweek();
		calctotal();
		calcavgweeklysales();
		calcweekwithhighestsales();
		calcweekwithlowestsales();
	}
	
	//getters & setters
	public void setsaleforweekdayintersection(int week, int day, float sale) 
	{
		salesbyweek[week][day] = sale; 
	}
	
	public float getsaleforweekdayintersection(int week, int day)
	{
		return 0.0f;
	}
	

	public float[][] getSalesbyweek() {
		return salesbyweek;
	}

	public void setSalesbyweek(float[][] salesbyweek) {
		this.salesbyweek = salesbyweek;
	}

	public float[] getTotalsalesbyweek() {
		return totalsalesbyweek;
	}

	public void setTotalsalesbyweek(float[] totalsalesbyweek) {
		this.totalsalesbyweek = totalsalesbyweek;
	}

	public float[] getAvgsalesbyweek() {
		return avgsalesbyweek;
	}

	public void setAvgsalesbyweek(float[] avgsalesbyweek) {
		this.avgsalesbyweek = avgsalesbyweek;
	}

	public float getTotalsalesforallweeks() {
		return totalsalesforallweeks;
	}

	public void setTotalsalesforallweeks(float totalsalesforallweeks) {
		this.totalsalesforallweeks = totalsalesforallweeks;
	}

	public float getAvgweekleysales() {
		return avgweekleysales;
	}

	public void setAvgweekleysales(float avgweekleysales) {
		this.avgweekleysales = avgweekleysales;
	}

	public float getWeekwithhighestsales() {
		return weekwithhighestsales;
	}

	public void setWeekwithhighestsales(float weekwithhighestsales) {
		this.weekwithhighestsales = weekwithhighestsales;
	}

	public float getWeekwithlowestsales() {
		return weekwithlowestsales;
	}

	public void setWeekwithlowestsales(float weekwithlowestsales) {
		this.weekwithlowestsales = weekwithlowestsales;
	}
	
	//print
	public void printdata() { //print all sales
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public void print(int i) //print calculated values
	{ 
		switch(i) {
		case 1:
			System.out.println("Total Sales per week:");
			for (int j=0;j<totalsalesbyweek.length;j++)
				System.out.println("Week " + (j+1) + ": " + totalsalesbyweek[j] );
			break;	
		case 2:
			System.out.println("Average Daily Sales per week");
			for (int j=0;j<avgsalesbyweek.length;j++)
				System.out.println("Week " + (j+1) + ": " + avgsalesbyweek[j] );
			break;	
		case 3:
			System.out.println( "Total Sales: "+totalsalesforallweeks);
			break;
		case 4:
			System.out.println("Average Weekly Sales: "+avgweekleysales);
			break;
		case 5:
			System.out.println("Week " + (int)weekwithhighestsales + " has the highest number of sales");
			break;
		case 6:
			System.out.println("Week " + (int)weekwithlowestsales + " has the lowest number of sales");

			break;
		case 7: 
			System.out.println("Total Sales for each week:");
			for (int j=0;j<totalsalesbyweek.length;j++)
				System.out.println("Week " + (j+1) + ": " + totalsalesbyweek[j]);
			System.out.println("\nAverage Daily Sales for each week");
			for (int j=0;j<avgsalesbyweek.length;j++)
				System.out.println("Week " + (j+1) + ": " + avgsalesbyweek[j]);
			System.out.println(totalsalesforallweeks + " total sales");
			System.out.println(avgweekleysales + " average weekly sales");
			System.out.println("Week " + (int)weekwithhighestsales + " has the highest number of sales");
			System.out.println("Week " + (int)weekwithlowestsales + " is the lowest number of sales");

			break;
		case 8:
			printdata(); 
			break;
		default:
			System.out.println("Invalid Input!");
			break;
			
		}
		System.out.println("\n");
	}
}
