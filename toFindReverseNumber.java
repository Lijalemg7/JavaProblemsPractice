package twentytwo;

import java.util.Scanner;

public class toFindReverseNumber {

	public static void main(String[] args) {
		int num1, num2, reversenumber1 =0;
		System.out.println(" Please Enter the no");
		Scanner sc = new Scanner (System.in);
		num2 = num1 = sc.nextInt();
		while (num1 !=0) {
			reversenumber1 = reversenumber1*10;
			reversenumber1 = reversenumber1 + num1%10;
			num1 = num1/10;
		}
		System.out.println("The result of reversed number "+ num2 + " is " + reversenumber1);
		
		
		

	}

}
