package twentytwo;

import java.util.Scanner;

public class SpeedConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	
		System.out.println("Please enter the speed in km/hr");
		double kilometresPerHour = sc.nextDouble();
		double MilesPerHour = kilometresPerHour/1.609;
		if (kilometresPerHour <=0) {
			System.out.println("invalid entery " +-1);	
	}
		else {
			System.out.println("Your converted speed equlas " + MilesPerHour );
		}
		
	}
}