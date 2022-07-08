package twentytwo;

import java.util.Scanner;

public class ToCheckEvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		if(i% 2 == 0) {
			System.out.println("The number is even ");
		}if (i%2 !=0) {
				System.out.println("The number is odd");
			
		}

	}

}
 