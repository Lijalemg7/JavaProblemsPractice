package twentytwo;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 2;
		System.out.println("Please Enter the integer number;    ");
		int checkForPrimeNumber = input.nextInt();
		if (checkForPrimeNumber/i == 0 || checkForPrimeNumber ==1) {
			System.out.println("The number is not a prime number");
		 if (checkForPrimeNumber%3 == 0) { 
			System.out.println("This is not a prime");}
		 if (checkForPrimeNumber%5 ==0) {
			 System.out.println("This not prime");
		 }
		 else {
			 System.out.println("The number is prime ");
		 }
		}	 

	}

}
