package twentytwo;
//SUCESS1 Write a Java program to create the concatenation of the two strings except 
//removing the first character of each string.
import java.util.Scanner;

public class StringCancatenationRemovingFstChar {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the first AND second string");
		String str1 = input.nextLine();
		String Str2 = input.nextLine();
		System.out.println(str1.substring(1)+Str2.substring(1));

	}

}
