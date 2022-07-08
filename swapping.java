package twentytwo;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		
		// swapping two numbers
		Scanner input = new Scanner(System.in);
		int a=0;
		int b=0;
		int c =0;
		System.out.println("Enter value of first no x"  );
		a= input.nextInt();
		System.out.println("Enter the second number: "  );
		b= input.nextInt();
	
		System.out.println("Values before swapping ");
		System.out.println("Values of x is  " + a);
		System.out.println("Values of y is  " + b);
		c= a;    //a= a+b;
		a=b;    //b= a-b; 
	    b= c;   //
		System.out.println("\n");
		System.out.println("Values after swapping ");
		System.out.println("Values of x is :" + a);
		System.out.println("Values of y is : " + b );

	}

}
