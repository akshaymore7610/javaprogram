/*
 * @ Author Akshay More
 */
package SwitchX;
import java.util.Scanner;
public class ScannerTwoDArray {

	public static void main(String[] args) {

		int rows, cols;
		Scanner ab = new Scanner(System.in);


		System.out.println("How many rows");
		rows = ab.nextInt();

		System.out.println("How many coloums");
		cols = ab.nextInt();
		int arr[][]= new int[rows][cols];

		//Taking user input for the array
		for(int i=0; i<rows; i++) 
		{
			for(int j=0; j<cols; j++) 
			{
				System.out.println("Enter the values for the array");
				arr[i][j]= ab.nextInt();
			}
			System.out.println();
		}
		//Printing the matrix
		for(int i=0; i<rows; i++) 
		{
			for(int j=0; j<cols; j++) 
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		ab.close();
	}
}
