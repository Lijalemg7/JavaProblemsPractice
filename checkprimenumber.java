package twentytwo;

import java.util.Scanner;

public class checkprimenumber {

	public static void main(String[] args) {
		int num1, x, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number please:  ");
		num1 = sc.nextInt();
		for (x=2; x<num1; x++) {
			if (num1%x ==0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(num1 + "  is a prime number");
		}
		else {
			System.out.println(num1 + "  is not a prime number ");
		}
		

	}

}
