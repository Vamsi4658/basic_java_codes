package patterns;

import java.util.Scanner;

public class InvertedRightAngleTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("right Angle ");
		
		//rows
		for (int i=0; i<size;i++) {
			//column condition for j is n-i
			for(int j=1;j<=size-i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
