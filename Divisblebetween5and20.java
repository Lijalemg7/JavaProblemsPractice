package twentytwo;

import java.util.Scanner;

public class Divisblebetween5and20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please Enter a number ");
		int p = input.nextInt();
		int amount = 0;
		for (int i =5; i<=20; i++) {
		
			if (i%p ==0)
				System.out.print(i + " ");
			amount++;
			}System.out.println(amount);
			
		}

	}


