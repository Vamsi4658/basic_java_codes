package If_Else_Statement;

import java.util.Scanner;

public class Number_Even_Or_not {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Number");
		int n1 = sc.nextInt();
		
		if (n1%2==0)
			System.out.println(" Given Number is Even: "+n1);
		else 
			System.out.println(" Given Number is Odd: "+ n1);
		
	}
}
