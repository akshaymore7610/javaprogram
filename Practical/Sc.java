/*
 * @ Author Akshay More
 */
package SwitchX;
import java.util.Scanner;
public class Sc {

	public static void main(String[] args){

		Scanner abc = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the patterrn");

		int rows = abc.nextInt();
		System.out.print("** Printing the pattern **");

		for(int i=1; i<=rows; i++) {
			for(int j=i; j>=1;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=5; i>=0;i--) {
			for(int j=0; j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
			}

	}

}
