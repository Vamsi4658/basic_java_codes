package patterns;

import java.util.Scanner;

public class EvenNumberPyrmidPattren {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int evenNum=2; // Initiating the even number 
		// rows
		for(int i=0;i<n;i++) {
			// printing spaces
			for(int s=0;s<n-i-1;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				// printing even number
				System.out.print(evenNum+" ");
				evenNum+=2; // moving to next value
			} 
			System.out.println();
		}
//		sc.close();
	}
}
