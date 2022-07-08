package twentytwo;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
//		String org_str = str;
		String rev = "";
		int ln = str.length();
		for (int i = ln-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}if (str.equals(rev)) {
			System.out.println(str + " is palindrome");
		}else {
			System.out.println(str + "  is not palindrom");
		}

	}

}
