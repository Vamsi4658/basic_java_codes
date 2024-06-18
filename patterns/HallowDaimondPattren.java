package patterns;

import java.util.Scanner;

public class HallowDaimondPattren {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			
			//for spaces condition n-i-1
			for(int s=0;s<n-i-1;s++) {
				System.out.print(" ");
			}
			// column i+1
			for (int j=0;j<i+1;j++) {
				
				if (j==0 || j==i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		// mirroring the loop
		for(int i=n-1; i>=0;i--) {
			
			//for spaces condition n-i-1
			for(int s=0;s<n-i-1;s++) {
				System.out.print(" ");
			}
			// column i+1
			for (int j=0;j<i+1;j++) {
				if (j==0 || j==i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
