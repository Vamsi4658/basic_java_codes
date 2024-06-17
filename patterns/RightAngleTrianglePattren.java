package patterns;

import java.util.Scanner;

public class RightAngleTrianglePattren {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size =sc.nextInt();
		
		
		//rows
		for(int i=0;i<size;i++) {
			
			//column
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
