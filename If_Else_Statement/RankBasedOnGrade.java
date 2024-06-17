package If_Else_Statement;

import java.util.Scanner;

public class RankBasedOnGrade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t------------------------------------");
		System.out.println("\tchech your rank baserd on your Grade");
		System.out.println("\t------------------------------------");
		System.out.println("\tA, B, C, D, F");
		System.out.print("\tEnter the Grade ");
		char grade = sc.next().charAt(0);
		
		if (grade=='A' || grade=='a') {
			System.out.println("\n\t**** you secuted 1st rank ****");
		} else if (grade=='B' || grade=='b') {
			System.out.println("\n\t**** you secuted 2nd rank ****");
		} else if (grade=='C' || grade=='c') {
			System.out.println("\n\t**** you secuted 3rd rank ****");
		} else if (grade=='D' || grade=='d') {
			System.out.println("\n\t**** You are Passed ****");
		} else if (grade=='F' || grade=='f') {
			System.out.println("\n\t**** you Failed ****");
		} else {
			System.err.println("\n\t***** Invalid Input *****");
		}
		
	}
}
