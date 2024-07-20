package javaPackage;
import java.util.Scanner;

public class _10EuclidsAlgorithm 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int firstInt, secondInt, answer;
		
		System.out.print("Enter the first integer: ");
		firstInt = input.nextInt();
		System.out.print("Enter the second integer: ");
		secondInt = input.nextInt();    	
		System.out.println();
		 
		answer = gcd(firstInt, secondInt);
		 
		 System.out.println("THE GCD OF " + firstInt + " AND " + secondInt + ":");
		 System.out.println("GCD("+ firstInt + "," + secondInt +") = "+ answer);
	}
		 
	public static int gcd(int m, int n)
	{
		if(n != 0)
		{
			return gcd(n, m % n);
		}
		else
		{
			return m;
		 }
	}

}
