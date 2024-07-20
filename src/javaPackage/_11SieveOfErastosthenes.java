package javaPackage;
import java.util.Scanner;

public class _11SieveOfErastosthenes 
{
	public static void main(String args[]) 
	{  
		Scanner input = new Scanner(System.in);  
		
		System.out.print("Enter a number: ");  
		int n = input.nextInt();  
		System.out.println();

        System.out.println("List of primes less than or equal to " + n + ":");
        
        prime(n);
	}
	
	public static void prime(int n)
    {
		//Assume all numbers are prime
        boolean[] prime = new boolean[n + 1];
        
        //Initialize all numbers as prime
        for(int i = 0; i <= n; i++)
        {
            prime[i] = true;
        }
         
        //Mark non-prime
        for(int p = 2; p * p <=n; p++)
        {
        	//If 'p' is prime
            if(prime[p] == true)
            {
            	//Multiples of 'p' are not prime
            	for(int i = p * p; i <= n; i += p)
            	{
            		prime[i] = false;
            	}
            }
        }
         
        //Print Prime
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
            {
                System.out.print(i + "\t");
            }
        }
    }
    
}
