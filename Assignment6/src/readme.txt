
	This file contains 5 packages, 10 java programs, and generates multiple text files: 
	
	1. Student.java in Model package contains the blueprint to create a Student object that holds each student's four-digit student ID number and their 5 quiz scores. 
			It also contains getter, setter, and print methods.
	
	
	2. Statistic.java in Model package performs a statistical analysis of quiz scores for a class of students, such as the lowest, highest, and average scores for each Quiz. 
			It also contains a method to print whichever statistics.
	
	
	3. StudentData.txt contains data on each student's four-digit student ID number and their 5 quiz scores.
	
	
	4. FileIO.java in Util package utilizes reads the StudentData.txt file and has a readFile() method that populates a Student[] array with data from the text file. 
			The program utilizes Buffers, FileReader, and String Tokenization. It also has a createProblem() method in order to demonstrate throwing,
			logging, and fixing exceptions.
	
	5. Driver1.java in Driver package creates an array of 40 students, a Util object to read the StudentData.txt file, and a Statistics object to analyze the student scores. 
		Then, it calls the createProblem() from FileIO.java in order to demonstrate throwing, logging, and fixing exceptions. Only 1 exception is demonstrated,
		where the problem is that the data.txt file trying to be opened does not exist, so the program throws a custom StudentGradingException in order to resolve the problem, 
		which is by asking the user to input an already existing file name such as StudentData.txt	
	
	
	6. StudentGradingException.java is the blueprint for a custom exception that extends the Exception class. It logs the exception error onto a separate file and 
		fixes the exception based on what type of error it is.
		
	7. Driver2.java in Driver package creates an array of StudentGrades containing each Student and class statistics, and then calls on FileIO methods in order to serialize 
		each Student into their own separate file, and then deserialize all those different files and print the data.
	
	
	8. Driver3.java in Driver package instantiates a StudentAPIImpl object and calls on its 2 methods to read the serialized student grades & statistics, to then print them.
	
	
	9. StudentAPI in the adapter package is an Interface that defines 2 methods, which reads the serialized student grades & statistics, and then prints them.
	
	
	10. StudentAPIImpl.java in the adapter package is an abstract class that defines the 2 methods declared in interface StudentAPI.java, and also loads the text file, 
		compute statistics, creates StudentGrade, and serializes StudentGradeArray in its constructor.
	
	
	11. SAPI.java simply extends the abstract class StudentAPIImpl in order to instantiate it in Driver3.java