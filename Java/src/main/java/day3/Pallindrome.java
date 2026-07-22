package day3;

public class Pallindrome {
	public static void main(String[] args) {
		int number=121;
		int orginalnumber=number;
		int reversenumber=0;
		
		while (number!=0) {
			
			int reminder = number%10;
			reversenumber= reversenumber*10+reminder;
			number/=10;
		 
			
		}
		
		if (orginalnumber == reversenumber) {
			 
			 System.out.println("it is a pallindrome");
			
		} else {
			System.out.println("it is not a pallindrome");

		}	
		
	}

}
