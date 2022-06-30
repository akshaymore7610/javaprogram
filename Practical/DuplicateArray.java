/*
 * @ Author Akshay More
 */
package SwitchX;

public class DuplicateArray {

	public static void main(String[] args) {

		int arr1[] = new int[]{10,20,30,40,50,60};
		int arr2[] = new int [arr1.length];

		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1 [i];
		}
		System.out.println("Original Array:"
				+ "");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ "  ");
		}
		System.out.println();
		System.out.println("Duplicate: ");
		for(int i=0; i<arr2.length; i++) {			
			System.out.print(arr2[i]+ "  ");

		}
	}

}
