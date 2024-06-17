package LoopingStandedProgramings;

import java.util.Scanner;

public class AdamNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\t enter number: ");
		int num = sc.nextInt();
		int lastDigit=0;
		int rev1 = 0;
		int sqr;
		int temp = num;
		
		//for squaring
		sqr=num*num;
//		System.out.println(sqr);
		// reversing the square number
		while (sqr!=0) {
			
			lastDigit=sqr%10;
			rev1=rev1*10+lastDigit;
			sqr/=10;
		}
//		System.out.println(rev1);
		//reversing the input
		int rev2=0;
		while (temp!=0) {
			lastDigit=temp%10;
			rev2=rev2*10+lastDigit;
			temp/=10;
		}
		//Squaring the number
		int sqr1=rev2*rev2;
		
		if (sqr1==rev1) {
			System.out.println("\t "+num+" is an Adam Number");
		} else {
			System.out.println("\t "+num+" is  not an Adam Number");
		}
	}
}
