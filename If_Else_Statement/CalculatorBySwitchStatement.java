package If_Else_Statement;

import java.util.Scanner;

public class CalculatorBySwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("------ Calculator ------");
		System.out.println("------------------------");
		
		System.out.print("\t enter frist number: ");
		int n1 = sc.nextInt();
		System.out.print("\t enter frist number: ");
		int n2 = sc.nextInt();
		
		System.out.println("\t Addition (+)\n\t Subtration (-)\n\t Multiplication (x)\n\t Division (/)");
		System.out.println();
		System.out.println(" select the calculation operation");
		char c = sc.next().charAt(0);
		
		switch (c) {
		case '+': {
			System.out.println(" Sum of "+n1+" and "+n2+" = "+ (n1+n2));
		}
		break;
		case '-': {
			System.out.println("Subtration of Given two numbers is = " +(n1-n2));
		}
		break;
		case 'x': {
			System.out.println(" product of Given two Numbers = "+ (n1*n2));
		}
		break;
		case '/': {
			System.out.println(" Division of Given two Numbers = "+ (n1/n2));
		}
		break;
		default:
			System.err.println("***** Invalid Operation *****");
		}
	}
}
