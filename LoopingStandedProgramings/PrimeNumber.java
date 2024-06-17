package LoopingStandedProgramings;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\tEnter Number");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("\t"+num+" is a Prime Number");
		} else {
			System.out.println("\t"+num+" is Not a Prime Number");
		}
		
	}
}

/*
 *    int num =sc.nextInt();
 *    int flag =0;
 *    
 *    for(int i =2; i<n/2; i++){
 *    		
 *    		if(num%i==0){
 *    			flag=1;
 *    		}
 *    }
 *    if(flag==0){
 *    	sys.out.pln("this is a prime number)
 *    } else {
 *    	syso.out.pln("this is not prime number
 *    }
 * 
 */
