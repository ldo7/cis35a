/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: 3
 * Due: Oct 10
 * Submitted: Oct 10
 * 
 */
public class Franchise 
{
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];
	}

	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	//prompts calculation of store info based on Salesdat.txt
	public void calc() 
	{
		for(int i=0;i<stores.length;i++)
			stores[i].analyzeresults();
	}
	
}
