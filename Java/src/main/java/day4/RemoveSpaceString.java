package day4;

public class RemoveSpaceString {

	public static void main(String[] args) {
	
		String s=" java Automation selenium programming";
		
		s= s.replaceAll("\\s", "");
		System.out.println(s);
		

	}

}
