package day3;

public class SumNumber {

	public static void main(String[] args) {
		int number=1234;
		int sum=0;
		
		while (number!=0) {
			
			sum=sum+number%10;
			number/=10;
			
			
		}
		System.out.println("sum of number"+sum);

	}

}
