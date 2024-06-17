package LoopingStandedProgramings;

import java.util.Scanner;

public class ReversingNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your number: ");
		int num=  sc.nextInt();
		
		int rev =0; int last_digit=0;
		
		while (num>0) {
			
			last_digit=num%10;
			rev =rev*10+last_digit;
			num/=10;
		}
		System.out.println("Reversed Number is : "+rev);
	}
}
