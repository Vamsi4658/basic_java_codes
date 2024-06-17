package LoopingStandedProgramings;

import java.util.Scanner;

public class PalindromicNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // taking input form user
		
		int last_digit = 0;
		int rev = 0;
		
		int temp=num; // to store the num value
		
		// for reversing the number
		while(temp!=0) {
			
			last_digit = temp%10;
			rev=rev*10+last_digit;
			temp/=10;
		}
		// Checking that number is equal to reversed number
		if (num==rev) {
			System.out.println("\t"+num+" this a palindromic number");
		} else {
			System.out.println("\t"+num+" this Not a palindromic number");
		}
	}
}
