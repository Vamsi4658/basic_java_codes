package operators;

import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2=sc.nextInt();
		System.out.println();
		
		// Arithmetic Operators
		
		System.out.print("+ : "+(n1+n2)+"\n"+"- : "+(n1-n2)+"\n"+"x : "+(n1*n2)+"\n"+"/ : "+(n1/n2));
	}
}
