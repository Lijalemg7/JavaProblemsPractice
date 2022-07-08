package twentytwo;

import java.util.Scanner;

public class TryCatchBlockDemo {

	public static void main(String[] args) {
		int num, deno;
		Scanner input = new Scanner(System.in);
		try 
		{
			System.out.print("Please Enter num ");
			num = input.nextInt();
			System.out.print("Please Enter deno ");
			deno = input.nextInt();
			System.out.println("The result is =" + num/deno);
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("------End of Error Hnadling Example-------");
		}
		
			
		
		
	}

}
