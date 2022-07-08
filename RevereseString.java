package twentytwo;

import java.util.Scanner;

public class RevereseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter string ");
		String str = scan.nextLine();
		String rev ="";
		int len = str.length();
		for (int i = len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}System.out.println(rev);

	}

}
