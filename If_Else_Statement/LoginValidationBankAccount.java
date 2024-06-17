package If_Else_Statement;

import java.util.Scanner;

public class LoginValidationBankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// database
		String uName = "vamsi1";
		int pin = 1234; // user pin
		double amount = 10000.00; // account balance
//		System.out.println("Enter User name");
//		String userName = sc.next();
		System.out.println("Ente your pin");
		int user_pin = sc.nextInt();
		
		if (pin==user_pin) {
			
			System.out.println("\t----------------------------------");
			System.out.println("\t         Welcome to Bank");
			System.out.println("\t----------------------------------\n");
			System.out.println("\t [ 1 ] <<<  for Balance Enquiry ");
			System.out.println("\t [ 2 ] <<<  for Withdraw Amount ");
			System.out.println("\t [ 3 ] <<<  for Change pin ");
			System.out.print("\n\t     Enter your input :");
			int i = sc.nextInt();
			
			switch (i) {
			case 1:
				System.out.println("\n\t  >> Account Balancy is: \n \t\t "+ amount);
				break;
			case 2 : {
				System.out.print("\n\t Enter amount in Ruppes: ");
				double withdrawAmount = sc.nextDouble();
				System.out.println("\n\t   >> Amount Withdrawal \n\t Succesfully "+withdrawAmount);
			} break;
			case 3 : {
				System.out.println("\n\t Enter Your New Pin");
				int newPin = sc.nextInt();
				pin=newPin;
				System.out.println("\n\t   >> Pin reset sucessfuly  <<");
			} break;
			default: System.err.println("\n\t     *** Invaid Input ***");
				break;
			}
		} else 
			System.err.println("\n\t     *** Invaid Pin ***");
	}
}
