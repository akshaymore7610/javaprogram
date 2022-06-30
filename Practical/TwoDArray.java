/*
 * @ Author Akshay More
 */

package SwitchX;

public class TwoDArray {

	public static void main(String[] args) {
		//Declaring variable
		int rows, cols;
		rows = 2;
		cols = 3;
		//declaration and instantiation  
		int arr[] []= new int [2] [3];
		arr[0][0] = 5;   //initialization  
		arr[0][1] = 15;
		arr[0][2] = 25;
		arr[1][0] = 35;
		arr[1][1] = 45;
		arr[1][2] = 55;

		for(int i=0; i<rows; i++ ) {
			for(int j=0; j<3; j++) {
				System.out.println(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
