package day3;

public class Countnumber {

	public static void main(String[] args) {
		int number =423424;
		int count=0;
		
		while (number !=0) {
			number/=10;
			count++;
			
		}
		System.out.println("number of digit in the number"+count);

	}

}
