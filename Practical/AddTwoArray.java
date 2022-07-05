/*
 *@ Author Akshay More
 */
package SwitchX;

public class AddTwoArray {

	public static void main(String[] args) {
		
		//declaration and instantiation  
				int a[]= {1,2,3,4,5};
				int b[]= {9,8,7,6,5};
				int c[]= new int[a.length];
				System.out.print("Addition of Two Array(a+b): ");
				//Entering in For loop
				for(int i=0; i<a.length; i++) {
					c[i]=a[i]+b[i];
					System.out.print(c[i]+"  ");
				}

	}

}
