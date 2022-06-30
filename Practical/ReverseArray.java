/*
 * @ Author Akshay More
 */
package SwitchX;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		System.out.println("Array in Order:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("Array in Reverse Order:");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
