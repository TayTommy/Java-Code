import java.util.ArrayList;

/* DATE:	05 March 2023
 * ASSIGN:	Prime Numbers - Onesies Vs Threesies
 * DESCRI:	This program determines which prime number finally pushes the size of the onesies list greater than the size 
 * 			of the threesies list for the first time, also mentioning how many primes are in each list when this happens
 * 
 * ANSWER/OUTPUT:	
 * 			The breaking number is 26861 for ONESIES being 1473 and THREESIES being 1472
 */


public class OnesiesVsThreesies {

	
	// MAIN FUNCTION TO PERFORM OPERATIONS
	public static void main(String[] args) 
	{
		
		// Initializing Variables
		final int HIGH_RANGE = 100000;	// Setting high range for testing (completely up to programmer to change and manipulate)
		final int LOW_RANGE = 3;		// Setting low range for testing (3 as default since we know that 1 and 2 wouldn't be involved in these calculations)
		
		
		// Letting user know about the calculation settings...
		System.out.println("Calculating onesies and threesies from a range of " + LOW_RANGE + " to " + HIGH_RANGE + "....");
		
		
		// Creating array lists for onesies and threesies with datatype Integer 
		ArrayList<Integer> onesies = new ArrayList<Integer>();
		ArrayList<Integer> threesies = new ArrayList<Integer>();
		
		
		
		// starting at 3 since we know that 1 and 2 wouldn't be involved in these calculations
		for (int i = LOW_RANGE; i <= HIGH_RANGE; i++)
		{
			// Checking if the number found is a prime number
			if (isPrime(i) == true)
			{
				// Determining onesies
				if ((i%4) == 1)
					onesies.add(i); 	//Adding onesies to list 
				
				// Determining threesies
				else if ((i%4) == 3)
					threesies.add(i); 	//Adding threesies to list 
				
			// THE MAIN COMPONENT OF DETERMINING WHEN THE ONESIES OUTNUMBER THE THREESIES, AND DISPLAYING RESULTS
			if (onesies.size() > threesies.size())
				System.out.println("The breaking number is " + i + " for ONESIES being " + onesies.size() + " and THREESIES being " + threesies.size());
			}
		}
		
		
		// PRINTING PROPERTIES IN CASE THE USER WANTS TO DISPLAY MORE INFORMATION
		//System.out.println("Onesies:   " + onesies.toString());
		//System.out.println("TOTAL ONESIES: " + onesies.size());
		//System.out.println("Threesies: " + threesies.toString());
		//System.out.println("TOTAL THREESIES: " + threesies.size());
	}
	
	
	// FUNCTION FOR DETERMINING WHETHER A NUMBER IS PRIME
	static boolean isPrime(int num)
	{
		// Making sure number isn't 1 or less
		if(num <= 1)
			return false;
		// Determining whether the number is a prime using MOD
		for(int i = 2; i <= num / 2 ; i++)
		{
			if((num % i) == 0)
				return  false;
		}
		return true;
	}

}
