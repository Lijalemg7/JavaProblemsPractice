package twentytwo;

import java.util.Scanner;

public class inputdemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer ");
		int myInt = input.nextInt();
		System.out.println("You entred integer," + myInt);
		System.out.println(" Enter double no: ");
		double myDouble = input.nextDouble();
		System.out.printf("You entred double", + myDouble);
		System.out.println("Please enter string");
		input.nextLine();
		String myString = input.nextLine();
		System.out.println("You entered," + myString);
		
		// TODO Auto-generated method stub

	}

}
