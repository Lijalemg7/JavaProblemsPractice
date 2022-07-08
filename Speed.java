package twentytwo;

import java.util.Scanner;

public class Speed {
	public static void main (double kilometersPerHour) {
		Scanner scan = new Scanner(System.in);
		double speedinMilesPerhour = kilometersPerHour*1.609;
		System.out.println("Please eneter the speed in km/h");
		double input = scan.nextDouble();
		System.out.println("The converted Speed in kilometer = " + speedinMilesPerhour+"m/h");
	}		

}
