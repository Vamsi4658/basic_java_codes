package patterns;

import java.util.Scanner;

public class PlusSymbollPattren {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			for (int j=0;j<n;j++) {
				if(i==2 || j==2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
