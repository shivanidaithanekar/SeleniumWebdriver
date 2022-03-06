package string;

public class PalindromeString {
	public static void main(String[] args) {
		
		String inputString = "madam"; // xyz, shiva then it is not a palindrome
		String reversedString = reverseString(inputString);
		if(inputString.equals(reversedString)) {
			System.out.println("The inputString is a palimdrome String.");
		} 
		else {
			System.out.println("The inputString is not a palimdrome String.");		
			}
		}
	// a method t reverse the string
	public static String reverseString(String str)
	{
		String reversedString = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			reversedString += str.charAt(i);
		}
		return reversedString;
	}
}
	
	


