package twentytwo;

import java.util.Scanner;

public class PracticeScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name ");
		
		// Create a scanner to read the name input
		// Since you are expecting a string make the data type string
		String name = scan.nextLine();
		System.out.println("Whats is your age ");// since the age is data int, 
		int age = scan.nextInt();// at this point you need to clear the scanner 
		scan.nextLine();
		
		System.out.println("What kind of food you like ");
		String food = scan.nextLine();
		System.out.println(" what is your height bro");
		double height = scan.nextDouble();
		scan.nextLine();
		System.out.println("How old your mother ");
		int agee = scan.nextInt();
		scan.nextLine();
		System.out.println("How happy you are ");
		String happy = scan.nextLine();
		System.out.println("How many kids in the house ");
		int kids = scan.nextInt();
		scan.nextLine();
		System.out.println("you have " +kids + "kids");

	}

}
