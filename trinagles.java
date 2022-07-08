package twentytwo;

import java.util.Scanner;

public class trinagles {

	public static void main(String[] args) {
		// lets import scanner to input the sides of triangle
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the sideOne of traingles "  );
		double sideOne1 = input.nextDouble();
		System.out.println("You Entered side one = " +sideOne1 );
		System.out.println("Please Enter the second side: "  );
		double sideTwo = input.nextDouble();
		System.out.println("You entred the seond side = "+ sideTwo);
		System.out.println("Please Enter the third line");
		double sideThree = input.nextDouble();
		System.out.println("You entred the third side= " + sideThree);
		System.out.println("The three sides are:\n "+ sideOne1 +","+ sideTwo +" and " + sideThree);
		if (sideOne1 == sideTwo && sideTwo == sideThree ) {
			System.out.println("The traingel is equliateral");
		}
		if (sideOne1 == sideTwo || sideOne1 == sideThree || sideTwo == sideThree) {
			System.out.println("The traingle has two sides equals, isosceles");
		}
		else {
			System.out.println("The traingle is scalene");
		}
		
		

	}

}
