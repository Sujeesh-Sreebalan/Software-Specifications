package StringAssignment;
import java.util.Scanner;


public class StringManipulation {
	
	/**
	 * 
	 * Main method to demonstrate usage of ComparingString class
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringOperation string = new StringOperation();
		
//		Taking Input from User for two Strings
		System.out.print("Enter the First String: ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter the Second String: ");
		String str2 = sc.nextLine();
		
//		Calling the comparing method to check whether the two strings are equal or not
		if (string.compareString(str1, str2)) {
			System.out.println("Both Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
//		Printing the reverse of the first String
		String reversedString = string.reverseString(str1);
		System.out.println(reversedString);
		
//		Converting lowercase letter to uppercase letter and vice versa 
		System.out.println(string.convertStringOpposite(str2));
		
//		Finding the largest word in the string
		System.out.println(string.largestWord(str2));
		sc.close();
		
	}

}
