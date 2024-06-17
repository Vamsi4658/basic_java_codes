package patterns;

import java.util.Scanner;

public class PirimidPattren13579 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n;i++) {
			
			//space condition < n-i-1>
			for(int s=0;s<n-i-1;s++) {
				System.out.print("   ");
			}
			// for column 13479 pattern is i*2+1
			for(int j=0; j<i*2+1;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
