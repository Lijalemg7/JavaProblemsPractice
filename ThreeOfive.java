package twentytwo;

import java.util.Scanner;

public class ThreeOfive {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 1st No");
		int a = scan.nextInt();
		System.out.println("Enter 2nd no");
		int b = scan.nextInt();
		System.out.println("Enter 3rd no");
		int c = scan.nextInt();
		if (a + b == c) {
			System.out.println("True");
		}else {
			System.out.println("False ");
		}
	}
		
}
