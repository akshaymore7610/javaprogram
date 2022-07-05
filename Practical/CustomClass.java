/*
 *@ Author Akshay More
 */
package weekfour;


class Employee{
	
	int id;
	String name;
	String post;
	int salary;
	
	public void getDetails() {
		
		System.out.println("ID: " + id);
		System.out.println("The name is " + name);	
		System.out.println("Post: " + post);
		System.out.println("Salary: " + salary);
	}
}

public class MethodClass {

	public static void main(String[] args) {
		
		// Classname Objectname = new Classname ();
		
		System.out.println("Employee Information");
		System.out.println();
		
		Employee Mahesh = new Employee();
		Employee Hitesh = new Employee();
		Employee Akshay = new Employee();

		Mahesh.id = 34567;
		Mahesh.name = "Mahesh Rathod.";
		Mahesh.post = "Web Developer";
		Mahesh.salary = 300000;

		Hitesh.id = 23456;
		Hitesh.name = "Hitesh Patil.";
		Hitesh.post = "System Engineer";
		Hitesh.salary = 20000;		

		Akshay.id = 12345;
		Akshay.name = "Akshay More.";
		Akshay.post = "Product Manager";
		Akshay.salary = 10000;
				
	
		
		Mahesh.getDetails();
		System.out.println();
		Hitesh.getDetails();
		System.out.println();
		Akshay.getDetails();
		
	}

}

