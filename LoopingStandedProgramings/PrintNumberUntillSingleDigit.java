package LoopingStandedProgramings;

import java.util.Scanner;

public class PrintNumberUntillSingleDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int lastDigit=0;
		/*
		 *   creating a infinity loop 
		 */
//		while(true) {
//			
//			int sum=0; // for every iteration the sum value will be 0
//			/*
//			 *  summation of digits
//			 */
//			while (num!=0) {
//				lastDigit=num%10;
//				sum+=lastDigit;
//				num/=10;
//			}
//			// updating the temperer value with sum value
//			num=sum;
//			/*
//			 *  single digit numbers are start from 0-9 
//			 *  compare sum is more than 9 if it is Grater loop will  if not it will break 
//			 */
//			if(sum<=9) {
//				System.out.println("\t Result: "+num);
//				break;
//			}
		
		/*
		 *    or
		 */
			while (num>=9) {
				int sum=0;
				while (num!=0) {
					lastDigit=num%10;
					sum+=lastDigit;
					num/=10;
				}
				num=sum;
			}
			System.out.println("\tresult: "+num);
			
		}
	}
