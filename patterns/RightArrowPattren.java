package patterns;

import java.util.Scanner;

public class RightArrowPattren {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<=n;i++) {
			
			// print star
			for(int j=0;j<i*2-1;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		//mirroring the loop and skip the last value
		for(int i=n-1; i>=0;i--) {
			
			// print star
			for(int j=0;j<i*2-1;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
