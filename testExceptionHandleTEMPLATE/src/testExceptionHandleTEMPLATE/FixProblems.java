package testExceptionHandleTEMPLATE;

import java.util.Arrays;

public class FixProblems extends Exception {
	private int errorno;
	private String errormsg;
	
	public FixProblems() {
		super();
		printmyproblem();
	}
	
	public FixProblems(String errormsg) {
		super();
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	public FixProblems(int errorno) {
		super();
		this.errorno = errorno;
		printmyproblem();
	}
	
	public FixProblems(int errorno, String errormsg) {
		super();
		this.errorno = errorno;
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	public int getErrorno() {
		return errorno;
	}
	
	public void setErrorno(int errorno) {
		this.errorno = errorno;
	}
	
	public String getErrormsg() {
		return errormsg;
	}
	
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	public void printmyproblem() {
		System.out.println("FixProblems [errorno=" + errorno + ", errormsg=" + errormsg); 
	}

	public String fixProblemReadFromConsole()
	{
		String a = "Z:\\JavaPrograms\\SelfHealingSoftware\\bin\\abc.txt";
		System.out.println("got here --> fixProblemReadFromConsole");
		return a;
	}
}
