/*
 *@Author Akshay More
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class MyNest {

public static void main(String []args) {
   
	Deque<Integer> s = new ArrayDeque<Integer>();
    s.push(19);
    s.push(20);
    s.push(40);  
    System.out.println(s);
    System.out.println(s.peek());
	while(!s.isEmpty()) {
		System.out.println( s.pop()+" ");
	}
	System.out.println(s.peek());
	
	
}

}