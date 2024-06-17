package LoopingStandedProgramings;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		int last_digit = 0;
		
		/*
		 *  this loop will count the digits
		 */
		while (temp!=0) {
			last_digit=num%10;
			count++;
			temp=temp/10;
		}
		int temp2=num;
		int sum=0;
		while(temp2!=0) {
			int power=1;
			last_digit=temp2%10;
//			for(int i=1;i<=count;i++) {
//				power=power*last_digit;
//			}
//			sum=sum+power;
			sum=(int) (sum+Math.pow(last_digit, count));
			temp2/=10;
		}
		if(sum==num) {
			System.out.println(" ** this is Armstrong number **");
		} else {
			System.out.println(" ** this not Armstrong Number");
		}
//		System.out.println(count);
	}
}
