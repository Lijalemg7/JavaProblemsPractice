package twentytwo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// to put user input we need scanner 
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please Enter the maximum point for the quiz");
		
		// double variable  and assign it, whatever comes to the input scanner 
		// is assigned to the max
		// formatting the decimal 
		DecimalFormat cleanDub = new DecimalFormat("0.#");
		double maxPoint = scan.nextDouble();
		System.out.println("Maximum = "  +maxPoint);
		// Create and ask to enter the student point of the quiz
		System.out.println("Please enter the students grade out of " + maxPoint);
		double score = scan.nextDouble();
		System.out.println("Total Score = " + score);
		
		// close the scanner and always a good habit
		scan.close();
		double cleanpercent = calcPercent(score, maxPoint);
		
		// formating to 
		
		double percent =(score/maxPoint)*100;
		System.out.println(percent);
		String Grade;
		if (percent >= 100) {
			Grade = "A";
		}
		else if (percent >= 80) {
			Grade = "B";
		}
		else if (percent >= 70) {
			Grade = "C";
		}
		else if (percent >= 60) {
			Grade = "D";
		}
		else {
			Grade = "F";
		}
		System.out.println("The student letter grade is: " + Grade + " The percent is " + percent+"%");

	}

	private static double calcPercent(double score, double maxPoint) {
		// TODO Auto-generated method stub
		return 0;
		
	}
	private static void renaming (double score  , double maxPoint ) {
		System.out.println("===========================");
		System.out.println("Creating another method ");
	}

}
