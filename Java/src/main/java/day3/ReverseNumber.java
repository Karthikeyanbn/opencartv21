package day3;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int number=1234;
		int reversenumber =0;
		
		while (number !=0) {
			int reminder = number%10;
			reversenumber=reversenumber*10+reminder;
			number=number/10;
		
			
		}
		
		System.out.println("reversed number "+ reversenumber);
		
		
	}
}
