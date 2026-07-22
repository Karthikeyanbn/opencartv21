package day3;

public class OddNumberEvenNumber {

	public static void main(String[] args) {
		int number=23456;
		int oddnumber=0;
		int evennumber=0;
		
		while (number!=0) {
			
			int reminder =number%10;
			
			if(reminder%2==0) {
				evennumber++;
			}
			else {
				oddnumber++;
			}
			number/=10;
			
		}
		
		System.out.println("number of odd count"+oddnumber);
		System.out.println("number of even count"+evennumber);
			

	}

}
