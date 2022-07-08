package twentytwo;

import java.io.InputStream;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BankinApp {
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);

		//This method enables 	

		double amount= 0;
		double withDraw = 0;
		double balance = (amount- withDraw);
		System.out.println("Welcome to our Bank\n");
		System.out.println("This is main menu \n\n" +
	    "If you are an exsiting customer press 1 \n" +
		"If you are new customer please press 2 \n");
		System.out.println("Please Enter your selection ");
		int menu = sc.nextInt();

		//an existing customer can login using user name  and password.
		// if they are prompted, they can login using user name and password
		// after they login they can check balance, make deposit and withdraw
		if (menu == 1) {
			System.out.println("You are an exsiting customer, \n\nplease login to your account");

			System.out.println("Enter your username ");

			String userName = sc.next();
			System.out.println("Please Enter your passowrd ");
			String password = sc.next();

			System.out.println("Welcome our valuable customer ");
			System.out.println("Please enter your selection ");
			System.out.println("Main Menu: \n\n For account blance press 1 \n"
			+ " To deposit money press 2 \n "
			+ " To withdraw money press 3\n"
			+ " To go back to the main menu press 4");
			int menu1 = sc.nextInt();
			if (menu1 == 1 ) {
				System.out.println("Balance");
				System.out.println("Your account balance is "+ balance);
				int menu11 = sc.nextInt();
			}else if (menu1 == 2) {
				System.out.println("Deposit");
				System.out.println("Enter your deposit amount");
				double deposit = sc.nextDouble();
				
				System.out.println("You have deposited " + deposit + " and your account balance is = " + (deposit + balance) );
				int menu11 = sc.nextInt();
			}
			else if (menu1 == 3 ) {
				System.out.println("Withdraw ");
				System.out.println("Enter your withdraw amount ");
				double withDraw1 = sc.nextDouble();

				// If withdraw amount is greater than the current balance, insufficient Balance
				// this is also nested on another else if statement 
				if (withDraw1 > balance ) {
					System.out.println("Insuffcient Balance ");
				}else {
					System.out.println("Your have withdrwan " + withDraw1 +"  Your account Balance is "+ (balance-withDraw1));
				}
			}else {
				System.out.println("Go back to the nmain menu");
			}





		}
		// If customer are new they are prompted to sign up for an account
		// They can login 
		else if ( menu == 2) {
			System.out.println("You are prompted to sign up page  ");
			System.out.println("Enter Your first name ");
			String firstName =sc.next();

			System.out.println("Enter your lastName");
			String lastName = sc.next();

			System.out.println("Enter Your phonenumber  name ");
			String phoneNumber =sc.next();

			System.out.println("Enter Your  email ");
			String email =sc.next();

			System.out.println("Dear " + firstName + ", you have sucessefully created an account");


		}else {
			System.out.println(" Come back again, thank for being a valuable customer ");
		}










	}
}





