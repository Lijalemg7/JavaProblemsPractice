package twentytwo;

import java.util.Scanner;

public class ThreeInputInteger {

	public static void main(String[] args) {
		/*This program Write a Java program that accepts three integer values
		//and return true if one of them is 20 or 
		more and less than the subtractions of others
//         */
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
	    System.out.println((Math.abs(a - b) >= 20 || Math.abs(b - c) >= 20 || Math.abs(c - a) >= 20));

	}
	}