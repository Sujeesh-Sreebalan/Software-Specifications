package StringAssignment;

class StringOperation{
	/**
	 * Compare two Strings and returns true if they are equal
	 * 
	 * @param string1 The First String to Compare.
	 * @param string2 The Second String to Compare.
	 * @return true if strings are equal, false otherwise. 
	 */
	public boolean compareString(String string1, String string2) {
//		if the length of both strings are not equal return false
		if(string1.length() != string2.length()) {
			return false;
		}else {
			for(int i = 0; i < string1.length(); i++) {
//				Comparing Character by Character
				if (string1.charAt(i) != string2.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Reverse a given input string.
	 * 
	 * @param string: The input String to be reversed.
	 * @return The reversed String.
	 */
	public String reverseString(String string) {
		int length = string.length();
		
//		Convert the input String to a character array
		char[] newString = string.toCharArray();

//		Iterating half of the string 
		for(int i = 0; i < string.length()/2 ; i++) {
//			Swapping the character
			Character tempString = newString[i];
			newString[i] = newString[length - 1 - i];
			newString[length - 1 - i] = tempString;
			
		}
//		returning the modified string
		return new String(newString);
	}
	
	
	/**
	 * Converts lowercase character to uppercase and vice versa in a given input string.
	 * 
	 * @param string: The input String to perform case conversion.
	 * @return The String with converted case characters.
	 */
	public String convertStringOpposite(String string) {
		String tempString = "";
		
//		Iterating through the loop and checking for each character whether they are in uppercase or lowercase.
		for(int i = 0; i < string.length(); i++) {
			Character ch = string.charAt(i);
			if (Character.isLowerCase(ch)) {
				tempString += Character.toUpperCase(ch);
			}else {
				tempString += Character.toLowerCase(ch);
			}
		}
//		returning the modified string
		return tempString;
	}
	
	/**
	 * Find the longest word in a given input string.
	 * 
	 * @param str: The input string to find the longest word.
	 * @return The longest word in the input string.
	 */
	
	public String largestWord(String string) {
		int length = string.length();
		int maxLength = 0; 
		int startIndex = 0;
		int endIndex = 0;
		int maxStartIndex = 0;
		
		while(endIndex <= length) {
			if(endIndex < length && string.charAt(endIndex) != ' ') {
				endIndex++;
			}else {
				int currentLength = endIndex - startIndex;
				if(currentLength > maxLength) {
					maxLength = currentLength;
					maxStartIndex = startIndex;
				}
				endIndex++;
				startIndex = endIndex;
			}
		}
		
//		returning the longest word from the string by using the substring.
		return string.substring(maxStartIndex, maxStartIndex+maxLength);
		
	}
}
