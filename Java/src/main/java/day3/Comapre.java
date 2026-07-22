package day3;



public class Comapre {

	public static void main(String[] args) {
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
			
		}
		
		for (int c:b) {
			System.out.print(c+"");
			
		}
		
		for (int d : a) {
			for (int c : b) {
				if (d==c) {
					System.out.println("print the value "+d);
					
				}
				
			}
			
		}
			
		}
		

	}


