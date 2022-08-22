/*
 *@ Author Akshay More
 */
package akshaymore;
import java.util.*;
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer> comp = new ArrayList<Integer>();
  
   comp.add(2);
   comp.add(3);
   comp.add(4);
   
  ArrayList<Integer> comp2 = new ArrayList<Integer>();
  comp2.add(1);
  comp2.add(2);
  comp2.add(3);
  comp2.add(4);
  comp2.add(5);
  
  for(int a:comp)
  {
     for (int b:comp2)
     {
    	 if(a<b)
    	 {
    		 System.out.println("Element a is less than element b");
    		 System.out.println(a);
    	 }
     }
	}

	}
}
