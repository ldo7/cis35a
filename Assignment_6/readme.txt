
	This file contains 4 packages, 5 java programs, and 1 text file: 
	
	1. Student.java in Model package contains the blueprint to create a Student object that holds each student's four-digit student ID number and their 5 quiz scores. 
			It also contains getter, setter, and print methods.
	
	
	2. Statistic.java in Model package performs a statistical analysis of quiz scores for a class of students, such as the lowest, highest, and average scores for each Quiz. 
			It also contains a method to print whichever statistics.
	
	
	3. StudentData.txt contains data on each student's four-digit student ID number and their 5 quiz scores.
	
	
	4. FileIO.java in Util package utilizes reads the StudentData.txt file and has a readFile() method that populates a Student[] array with data from the text file. 
			The program utilizes Buffers, FileReader, and String Tokenization. It also has a createProblem() method in order to demonstrate throwing,
			logging, and fixing exceptions.
	
	5. Driver.java in Driver package creates an array of 40 students, a Util object to read the StudentData.txt file, and a Statistics object to analyze the student scores. 
		Then, it calls the createProblem() from FileIO.java in order to demonstrate throwing, logging, and fixing exceptions. Only 1 exception is demonstrated,
		where the problem is that the data.txt file trying to be opened does not exist, so the program throws a custom StudentGradingException in order to resolve the problem, 
		which is by asking the user to input an already existing file name such as StudentData.txt	
	
	
	6. StudentGradingException.java is the blueprint for a custom exception that extends the Exception class. It logs the exception error onto a separate file and 
		fixes the exception based on what type of error it is.