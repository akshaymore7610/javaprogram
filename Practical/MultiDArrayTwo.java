/*
 * @ Author Akshay More
 */
import java.util.Scanner;

 class MultiDArrayTwo {
	
	public static void main(String args[]) {
		 int rows,cols;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("How many rows");
		 rows = sc.nextInt();
		 System.out.println("How many coloums");
		 cols = sc.nextInt();
		 int arr[] [] = new int [rows] [cols];
		
		 for (int i =0;i<rows;i++) {
		       for(int j =0; j<cols;j++)
		            {
                                             System.out.print("Enter the value for the array");
		             arr[i][j] = sc.nextInt();
			}
		             System.out.println();
			}

		}
	}