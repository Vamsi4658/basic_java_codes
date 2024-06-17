package LoopingStandedProgramings;

import java.util.Scanner;

/*
 *  Harshad number can be defined as a number which is divisible by the sum of its digits. 
 *  Simply it means if the sum of the digits of the number is a 
 *  factor of that number then it is a Harshad number
 * 
 */
public class HarshadNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number");
		int num = sc.nextInt();
		
		int digit=0;int sum=0;
		int temp=num;
		
		while (temp>0) {	
			
			digit=temp%10;
			sum+=digit;
			temp/=10;
		}
		
		if (num%sum==0) {
			System.out.println("\\n\\tthis is a Harshad Number");
		} else {
			System.err.println("\n\tthis is not a Harshad Number");
		}
	}
}
