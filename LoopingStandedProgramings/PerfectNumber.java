package LoopingStandedProgramings;

import java.util.Scanner;
/*
 *  a perfect number is a positive integer 
 *  that is equal to the sum of its positive proper divisors,
 *  that is, divisors excluding the number itself.
 */
public class PerfectNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter the number: ");
		 
		 int num = sc.nextInt(); // 6
		 int sum = 0;
		 
		 for(int i=1; i<num; i++) {
			 
			 // finding the factors
			 if(num%i==0) {
				 sum+=i;// Summation of factors
			 }
		 }
		 // Comparing the summation is equals to number
		 if(sum==num) {
			 System.out.println(" this is a perfect number");
		 }else {
			 System.err.println(" this is not a perfect number");
		 }	 
	}
}
