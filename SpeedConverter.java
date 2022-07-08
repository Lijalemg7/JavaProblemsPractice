package twentytwo;

import java.util.Scanner;
class SpeedConverter{

	public static void toMilesPerHour(long kilometersPerHour) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please eneter the speed in km/h");
		double MilesPerHour = kilometersPerHour * 1.609;
		System.out.println("The converted Speed in kilometer = " + MilesPerHour+"m/h");
	}		
	
}