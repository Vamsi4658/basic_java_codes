package LoopingStandedProgramings;

import java.util.Scanner;

/*
 *  
 */
public class UglyNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int result=0;
		for(int i =1;i<=num;i++) {
			
			if (i%2==0 || i%3==0 || i%5==0) {
				result=i;
			}
		}
		if (result!=0) {
			System.out.println("this is ugly number"+result);
		}
	}
}
