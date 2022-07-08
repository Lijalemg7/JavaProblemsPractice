package twentytwo;

import java.util.Scanner;

public class MultiplesSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int sum = 0;
		int n = scan.nextInt();
		for (int i = 1; i < 100; i++ ) {
			n = n*i;
		}System.out.println(n);

	}

}
