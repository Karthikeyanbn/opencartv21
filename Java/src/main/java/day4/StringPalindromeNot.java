package day4;

public class StringPalindromeNot {

	public static void main(String[] args) {
		String s= "Welcome";
		String rev="";
		
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
			
			
		}
		
		System.out.println(" after reversing "+ rev);
		
		if (s.equals(rev)) {
			System.out.println("it is a palindrome");
			
		} else {
			System.out.println("it is not a palindrom");

		}

	}

}
