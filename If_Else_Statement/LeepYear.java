package If_Else_Statement;

import java.util.Scanner;

public class LeepYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int year = sc.nextInt(); //taking input from the user
		
		if (year % 4==0 ) {
			System.out.println(" leap year");
		} else {
			System.out.println(" non- leap year");
		}
	} 
}
