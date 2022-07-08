
//package twentytwo;
//import java.util.Scanner;
//public class ReversString {
//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input a string: ");
//        char[] letters = scanner.nextLine().toCharArray();
//        System.out.print("Reverse string: ");
//        for (int i = letters.length - 1; i >= 0; i--) {
//            System.out.print(letters[i]);
//        }
//        System.out.print("\n");
//    }
//}
////Divisible by 3 and 5 between 1 to 100
//public class NumberDivisible3o5 {
//
//	public static void main(String[] args) {
//		for (int i = 1; i<=100; i++) {
//			if(i%3 ==0 && i%5 ==0) {
//				System.out.print(i + " ");
//			}
//		}
//
//	}
//
//}

// The sum of two integers and returns true if sum is equal to third integer returns true if sum is correct

//package twentytwo;
//
//import java.util.Scanner;
//
//public class NumberDivisible3o5 {
//	
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter the first integer");
//		int i = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Enter the second integer ");
//		int in = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Enter the third enteger ");
//		int sum = scan.nextInt();
//		if (i + in == sum) {
//			System.out.println("True");
//		}else {
//			System.out.println("false");
//		}
//		
//		
//		
//	}
	
//}

//package twentytwo;
//
//import java.util.Scanner;
//
//public class NumberDivisible3o5 {
//	
//// find the number of integers divisible by p between two ranges x and y
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter first number ");
//		int x = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Enter the second number");
//		int y = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Please enter the number tpo be divided");
//		int n = scan.nextInt();
//		scan.nextLine();
//		for (int i= x; i<= y; i++) {
//		if (x%n ==0 && y%n ==0) {
//			System.out.println(i);
//		}
//		}	
//	
//}	
//	
//}	
//	package twentytwo;
//
//import java.util.Scanner;
//
//public class NumberDivisible3o5 {
//	//Input an integer and count the factors 
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter the number");
//		int input = scan.nextInt();
//		for (int i= 1; i<=input; i++) {
//			if (input%i == 0) {
//				System.out.println(count(i));
//			}
//		}
//		
//		
//	}
//
//	private static char[] count(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	}
//	Write a Java program to print the area and perimeter of a circle.
//package twentytwo;
//
//import java.util.Scanner;
//
//public class AreaT{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		   
//		  System.out.print("Input first height: ");
//		  int b = scan.nextInt();
//		   
//		  System.out.print("Input second base: ");
//		  int h = scan.nextInt();
//		  System.out.println("Input the third side: ");
//		  int s = scan.nextInt();
//		  
//		  double area = (h*b)/2;
//		  double permiter = h + b + s;
//		   
//		  System.out.print("The area is : " + area + " . The permimeter is : " + permiter);
//		
//	}
//}




	
//import java.util.Scanner;
//public class Exercise33 { 
// public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input an integer: ");
//        long n = input.nextLong();
//        System.out.println("The sum of the digits is: " + sumDigits(n));
//
//    }
//
//    public static int sumDigits(long n) {
//        int sum = 0;
//        while (n != 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        return sum;
//    }
//}	//Write a Java program to reverse a string.

//public static void main(String[] args) {
//		int amount = 0;
//		for(int i = 1; i <= 4; i++){
//			for(int j = 1; j <= 4; j++){
//				for(int k = 1; k <= 4; k++){
//					if(k != i && k != j && i != j){
//						amount++;
//						System.out.println(i + "" + j + "" + k);
//					}
//				}
//			}
//		}
//		System.out.println("Total number of the three-digit-number is " + amount);
//	}
//}



//import java.io.Console;
//public class PasswordRead {
//	public static void main(String[] args) {
//		Console cons;
//		if ((cons = System.console()) != null) {
//			char[] pass_ward = null;
//			try {
//				pass_ward = cons.readPassword("Input your Password:");
//				System.out.println("Your password was: " + new String(pass_ward));
//			} finally {
//				if (pass_ward != null) {
//					java.util.Arrays.fill(pass_ward, ' ');
//				}
//			}
//		} else {
//			throw new RuntimeException("Can't get password...No console");
//		}
//	}
//}		
//	odd number of 1 and 99	
package twentytwo;
import java.util.Scanner;
public class Oddnumber { 
public static void main(String[] args) {
	System.out.println("odd number ");
	for (int i = 0; i <=99; i++) {
		if (i%2 !=0) {
			System.out.print("odd numbers between 1 and 99 = " + i  + " ");
		}
	}
	
}
	


}

