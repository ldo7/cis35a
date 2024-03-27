
	This file contains 5 java programs and 1 txt file: 
	
	1. UI.java asks the user to choose 1 out of the 6 stores to see various sales data from, such as a store's total sales per week, 
		average sales per week, total sales, average weekly sales, and which weeks had the highest or lowest sales.
	
	
	2. Store.java contains the blueprint to create a Store object which is instantiated in Franchise.java and FileIO.java. The file contains methods to 
		get, set, calculate, and print various sales data about any store (previously mentioned in #1).

	
	3. Franchise.java creates a list of stores and contains methods to get and set a store or the number of stores, and retrieve calculated sales data from each store. 
	
	
	4. FileIO.java reads the Salesdat.txt file and contains a DIY debugger method of sorts by comparing the original sales data with the data printed from Store and 
			Franchise object methods. The file also contains a method to create a store object and populate it with the store's corresponding sales data from Salesdat.txt. 
			The file also utilizes streams and buffers to more efficiently parse through the data.
	 
	
	5. Driver.java creates FileIO, Franchise, and UI objects in order to set up the console prompt. 
	
	
	6. Salesdat.txt contains a list of sales data, where each column represents sales data from each day organized chronologically, and the rows represent 
		data from each of the 6 stores.