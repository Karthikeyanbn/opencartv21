package day4;

public class JunkFromString {

	public static void main(String[] args) {
	String s="&&java$$automation";
	
	s=s.replaceAll("[^a-zA-Z]", "");
	
	System.out.println(s);

	}

}
