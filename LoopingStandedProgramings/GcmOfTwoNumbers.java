package LoopingStandedProgramings;

import java.util.Scanner;

/*
 * the gcd of two numbers is the largest part of their prime factorization that they have in common
 */
public class GcmOfTwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 *  taking input from user
		 */
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int result=0;
		
		for(int i=1;i<=n1;i++) {
			
			if (n1%i==0 && n2%i==0) {
				
				result=i;
			}
		}
		System.out.println(result);
	}
}
