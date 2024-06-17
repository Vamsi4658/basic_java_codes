package If_Else_Statement;

import java.util.Scanner;

public class ElseIfLadder {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("* Enter the number *");
		System.out.print(" Enter the number in range of [1-7] : ");
		int n1 = sc.nextInt();
		System.out.println();
		
		if (n1==1) {
			System.out.println("\t Sunday");
		} else if (n1== 2) {
			System.out.println("\t Monday");
		} else if (n1==3) {
			System.out.println("\t Tuesday");
		} else if (n1==4) {
			System.out.println("\t Wednesday");
		} else if (n1==5) {
			System.out.println("\t Thursday");
		} else if (n1==6) {
			System.out.println("\t Friday");
		} else if (n1==7) {
			System.out.println("\t Saturday");
		} else {
			System.err.println(" *** Invalid input ***");
		}
	}

}
