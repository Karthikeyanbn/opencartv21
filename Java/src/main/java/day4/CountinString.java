package day4;

public class CountinString {

	public static void main(String[] args) {
	String s="java programming language";
	
	int beforeremovingcount=s.length();
	int afterremovingcount=s.replaceAll("a", "").length();
	
	int count=beforeremovingcount-afterremovingcount;
	
	System.out.println("print the count "+count);
	

	}

}
