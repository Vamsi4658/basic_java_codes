package If_Else_Statement;

import java.util.Scanner;

public class GivenNumPositiveOrNegitive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		if (n1<0) {
			System.out.println("this is negtive");
		} else {
			System.out.println("this is positive");
		}
	}
}
