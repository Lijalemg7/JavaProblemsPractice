package twentytwo;
// Successful, check the length of the string and write str1str2str1 or....
import java.util.Scanner;

public class StringShortLong {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first string");
		String str1 = scan.nextLine();
		System.out.println("Enter 2nd string");
		String str2 = scan.nextLine();
		if (str1.length() >= str2.length()) {
			System.out.println(str1+str2+str1);
		}else {
			System.out.println(str2+str1+str2);
		}

	}

}