//package twentytwo;
////SUCESSWrite a Java program to create a new string taking first three characters from a given string. If the length of the given string is
////less than 3 use "#" as substitute characters
//import java.util.Scanner;
//
//public class StringTakeFirst3Char {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner (System.in);
//		System.out.println("Enter the first AND second string");
//		String str1 = input.nextLine();
//		if (str1.length() >= 3) {
//			System.out.println(str1.substring(0, 3));
//		}else if (str1.length() == 1) {
//			System.out.println(str1.substring(0)+"##");
//		}else if (str1.length()==2) {
//			System.out.println(str1.substring(0, 2)+"#");
//		}
//
//	}
//
//}
//package twentytwo;
//import java.util.Scanner;
////SUCESS create a new string taking first and last characters from two given strings. 
//public class StringTakeFirst3Char {
////
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		String str1 = scan.nextLine();
//		String str2 = scan.nextLine();
//		System.out.println(str1.substring(0, 1)+str2.substring(str2.length()-1));		
//	}
//}
//SUCESS test if 10 appears as either the first or last element of an array of integers. 
//The length of the array must be greater than or equal to 2.
//package twentytwo;
//import java.util.Scanner;
//public class StringTakeFirst3Char {
////
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		int [] Myarray = {10, -20, 30, 40, 60, 10};
//		System.out.println(Myarray[0] == 10 || Myarray[Myarray.length-1] ==10);	
//	}		
//	}
//new array of length 2 from two arrays of integers with three elements and the new array 
//will contain the first and last elements from the two arrays

//SUCESS o take the last three characters from a given string 
//and add the three characters at both the front and back of the string
//package twentytwo;
//import java.util.Arrays;
//import java.util.Scanner;
//public class StringTakeFirst3Char {
////
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		String str1 = scan.nextLine();
//		System.out.println(str1.substring(str1.length()-3)+str1+str1.substring(str1.length()-3));
//	}}
//package twentytwo;
//import java.util.Arrays;
//import java.util.Scanner;
//public class StringTakeFirst3Char {
////
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		int n = scan.nextInt();
//		while (n !=1) {
//			if (n%2 ==0) {
//				n = n/2;
//			}else {
//				n = ((n*3)+1)/2;
//			}
//		}
//		System.out.println(n);
//		scan.close();
//	}}
// To count the number of even and odd in a given array
//package twentytwo;
//import java.util.Arrays;
//import java.util.Scanner;
//public class StringTakeFirst3Char {
////
//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		int ctr_even =0, ctrodd = 0;
//		int[] array = {5,7,2,4,9};
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		for (int i = 0; i < array.length; i++) {
//			if (array[i]%2 == 0) {
//				ctr_even++;
//			}else{ ctrodd++;
//		}
//			
//		}
//		System.out.println("Even =  " +ctr_even);
//		System.out.println("Odd = " + ctrodd);
//to list odd first and then even list
package twentytwo;
import java.util.Arrays;
import java.util.Scanner;
public class StringTakeFirst3Char {
//
	public static void main(String[] args) {
		int[] array = {1, 19, 8, 5, 7, 13,  2, 4, 3, 9};
		  
		int i = 0;
	    System.out.println("Original Array: "+Arrays.toString(array)); 
	    Arrays.sort(array);
	    while(i < array.length && array[i] % 2 == 0)
	        i++;
	              
	    for(int j = i + 1; j < array.length; j++) {
	        if(array[j] % 2 != 0) {
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	            i++;
	        }
	    }                                                    
	  
		 System.out.println("New Array: "+Arrays.toString(array));
	  }
	}