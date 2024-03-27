/*
 * 
 * Name: Lani Do
 * Class: CIS35-11Y
 * Assignment: -1
 * Due: Oct 5
 * Submitted: Oct 5
 * 
 */

import java.util.Scanner;

public class CalculateTotal 
{
	public static void main(String[] args) 
	{
		//Variables
		//quantity of product
		int qty_TV, qty_VCR, qty_RemoteCont, qty_CD, qty_TapeRec;
		
		//total units per product
		float t_TV, t_VCR, t_RemoteCont, t_CD, t_TapeRec;
		
		//unit price
		final float p_TV = 400; 
		final float p_VCR = 220;
		final float p_RemoteCont = 35.2f;
		final float p_CD = 300;
		final float p_TapeRec = 150; 
		
		//tax rate & total
		final float tax = 8.25f; 
		float total, totalTax, gTotal;
		
		
		//Input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many TV's were sold?");
		qty_TV = scan.nextInt();
		
		System.out.println("How many VCR's were sold?");
		qty_VCR = scan.nextInt();
		
		System.out.println("How many Remote Controller's were sold?");
		qty_RemoteCont = scan.nextInt();
		
		System.out.println("How many CD's were sold?");
		qty_CD = scan.nextInt();
		
		System.out.println("How many Tape Recorder's were sold?");
		qty_TapeRec = scan.nextInt();
		
		//Processing
		t_TV = qty_TV * p_TV;
		t_VCR = qty_VCR * p_VCR;
		t_RemoteCont = qty_RemoteCont * p_RemoteCont;
		t_CD = qty_CD * p_CD;
		t_TapeRec = qty_TapeRec * p_TapeRec;
		
		total = t_TV + t_VCR + t_RemoteCont + t_CD + t_TapeRec;
		totalTax = total * tax/100;
		gTotal = total + totalTax;
		
		//Output 
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","Quantity","Description", "Unit Price", "Total Price");
		System.out.printf("\t%2d\t\t%-30s\t\t%15.2f\t\t%15.2f\n",qty_TV,"TV",p_TV,t_TV);
		System.out.printf("\t%2d\t\t%-30s\t\t%15.2f\t\t%15.2f\n",qty_VCR,"VCR",p_VCR,t_VCR);
		System.out.printf("\t%2d\t\t%-30s\t\t%15.2f\t\t%15.2f\n",qty_RemoteCont,"Remote Controller",p_RemoteCont,t_RemoteCont);
		System.out.printf("\t%2d\t\t%-30s\t\t%15.2f\t\t%15.2f\n",qty_CD,"CD",p_CD,t_CD);
		System.out.printf("\t%2d\t\t%-30s\t\t%15.2f\t\t%15.2f\n",qty_TapeRec,"Tape Recorder",p_TapeRec,t_TapeRec);
		
		System.out.println("");
		System.out.printf("\t%95.2f SUBTOTAL\n",total);
		System.out.printf("\t%95.2f TAX\n",totalTax);
		System.out.printf("\t%95.2f TOTAL",gTotal);
		
		
	}

}
