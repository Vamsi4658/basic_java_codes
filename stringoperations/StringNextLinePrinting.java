package stringoperations;

import java.util.Scanner;

public class StringNextLinePrinting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
//		this will move the controller move to next line of we didn't mention this "sc.nextLine()"
//		controller will consider enter as nextLine  
		sc.nextLine();
		String str = sc.nextLine(); // this nextLine() method will print enter sentence which we was given included with spaces
		String str1 = sc.next(); // this next() method will print only word 
		
		System.out.print(n+"\n"+str+"\n"+str1);
	}
}
/* output will be
 * 
 * 10
 * this is a string
 * hello
 * 
 * */
 