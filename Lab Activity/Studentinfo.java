package Java;
/*Author 
 * Sufiya Shahin
 */
import java.util.Scanner;

	class studentdata{
		Scanner sc=new Scanner(System.in);
		//defining private instant variables
		private int id;
		private String name,gender;
		private String Standard;
		//setting id,name,gender and standard
		public void setid(){ 
			System.out.println("enter id:");
			id=sc.nextInt();
		}
		public void setname()	{
			System.out.println("enter name:");
			name=sc.next();
			
		}
		public void setgender() {
			System.out.println("enter gender:");
			gender=sc.next();
		}
		public void setstandard() {
			System.out.println("enter standard:");
			Standard=sc.next();
			
		}
		//Returning id,name and method
		public int getid() {
			return id;
		}
		public String getname() {
			return name;
		}
		public String getgender() {
			return gender;
		}
		public String getstandard() {
			return Standard;
			
		}
	}	
	public class StudentInformation {
	public static void main(String[] args) {
		//creating object of student class
				studentdata ak = new studentdata();
				//method calling
				ak.setid();
				ak.setname();
				ak.setgender();
				ak.setstandard();
				
				//printing the values 
				System.out.println("Student id is      :"+ak.getid());
				System.out.println("Student name is    :"+ak.getname());
				System.out.println("Student gender is  :"+ak.getgender());	
				System.out.println("Student standard is:"+ak.getstandard());

	}

}