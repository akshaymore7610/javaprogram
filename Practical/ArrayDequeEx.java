/*
 *@Author Akshay More
 */
import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeEx{
	
public static void main (String args[])
{
	Deque<Integer> ak = new ArrayDeque<Integer>();

	  
    ak.add(2);
    ak.add(5);
    System.out.println(ak);
    ak.push(10);
    System.out.println(ak);
    ak.pop();
  
    
	System.out.println(ak);
//	s.peek();
	System.out.println(ak.peek());
	
	System.out.println(ak.isEmpty());

		}

	}