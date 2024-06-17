 package patterns;

import java.util.Iterator;
import java.util.Scanner;

public class DaimondPattern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			if (i<=5) {
				for(int s=0;s<n-i-1;s++) {
					System.out.print(" ");
				}
				for(int j=0;j<i+1;j++) {
					System.out.print("* ");
				}
			} else {
				for(int s=0;s<i+i-n;s++) {
					System.out.print(" ");
				}
				for(int j=0;j<=n-i+1;j++) {
					System.out.print(" *");
				}
//				System.out.println();
			}
			System.out.println();
		}
	}
}
