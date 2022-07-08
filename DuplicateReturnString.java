package twentytwo;

import java.util.Scanner;


public class DuplicateReturnString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter the string s");
		String s = scan.nextLine();
		scan.nextLine();
		int ln = s.length();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ln; i++) {
			for (int j =i+1; j <ln; j++) {
				if (ch[i]==ch[j]) {
					System.out.print(ch[j]);
					break;
				}
			}
		}
		}
		

	}


