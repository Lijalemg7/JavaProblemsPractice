package twentytwo;

import java.util.Scanner;

public class recurring {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please Enter the string name ");
		String wordToBeCountd = input.nextLine();
		System.out.println("The word to be splitted and counted;" + wordToBeCountd);
		input.nextLine();
		String [] splitWord = wordToBeCountd.split(",");
		System.out.println("The splitted word are" + splitWord);

	}

}
