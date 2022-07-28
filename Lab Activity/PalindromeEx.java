/*
 * @Author Akshay More
 */
package weekeight;
public class PalindromeEx {
	
		public static void main(String args[]) {
			StringBuffer sb= new StringBuffer("i am a good boy");
			String c=sb.toString();
			
			sb.reverse();
			
			if(c.contentEquals(sb)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindron");
			}
			
		}
		}
