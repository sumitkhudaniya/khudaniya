import java.util.Hashtable;
import java.util.Scanner;

// Java program generate a random AlphaNumeric String
// using Math.random() method

public class RandomString {

	// function to generate a random string of length n
	static String getAlphaNumericString(int l)
	{
		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"
										+ "abcdefghijklmnopqrstuvwxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(l);

		for (int i = 0; i < l; i++) 
		{
			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int)(AlphaNumericString.length()* Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}

	public static void main(String[] args)
	{
		// Creating an empty Hashtable
		Hashtable<Integer, String> hash_table =	new Hashtable<Integer, String>();

		int l = 10;
		// Get the size n
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no. of strings : ");
		int n = sc.nextInt();
		

		// Get and display the alphanumeric string
		for(int i=0;i<n;i++)
		{
			String s1 = RandomString.getAlphaNumericString(l);
			
			// Inserting values into the table
			long start = System.nanoTime();
			
			hash_table.put(i, s1);
			
			long end = System.nanoTime();
			System.out.println("Time used in inserting no. "+i+" string " +(end-start)+ " ns");
		}
			// Displaying the Hashtable
			System.out.println("Initial table is: " + hash_table);

		
	}
}
