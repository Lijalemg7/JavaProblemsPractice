package twentytwo;

import java.util.Scanner;

public class SpeedConver {
	public static void printConversion(double kilometersPerHour) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter the Speeed in Km/h:  ");
		scan.nextDouble();
		if (kilometersPerHour > 0) {
			double milesPerhour = (kilometersPerHour)*1.6093444;
			System.out.println(milesPerhour+"mi/hr = " + kilometersPerHour+"km/h");
		}else {
			System.out.println("Invalid");
		}
	
		
	}
}

