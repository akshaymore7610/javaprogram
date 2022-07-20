package CoreJava;
/*
 * @Author Akshay More
 */
import java.util.Scanner;
public class FindArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the particular element you want to search:");
		int row=sc.nextInt();
		int arr[]=new int [3];
		arr[0]=22;
		arr[1]=33;
		arr[2]=3;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==row) {
				System.out.println(arr[i]+" element is present in array");
				break;
				
			}
		}
		
		System.out.println("This element is not present in array");

	}

}