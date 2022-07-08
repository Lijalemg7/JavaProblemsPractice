package twentytwo;

import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		char entry;
		Scanner in = new Scanner(System.in);
		System.out.println("Please input your char" );
		entry = in.next().charAt(0);
		switch (entry) {
		case 'e':
			System.out.println("You won car");
			break;
		case 'f':
			System.out.println("you won tv");
			break;
		case 'g':
			System.out.println("You won laptop");
			break;
		case 'n':
			System.out.println("You won phone");
			break;
			default:
				System.out.println("No winner ");
				break;
			
				
		}
		

	}

}
