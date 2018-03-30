package ProgramsPractice;

public class FirstStarPrint {

	// Program to print the below pattern
	// *
	// **
	// ***
	// ****
	// *****
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=i;j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
