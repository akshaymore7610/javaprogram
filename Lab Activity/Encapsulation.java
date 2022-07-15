/*
 * @Author Akshay1 More
 */

package weekfive;

import java.util.Scanner;

class Students {
	private String name;
	private int id  ;
	private String gender ;
	private int standard;
	 
	public void setname(String name)
	{
		this.name = name;
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public void setgender(String gender)
	{
		this.gender = gender;
	}
	public void setstandard(int standard)
	{
		this.standard = standard;
	}
	
	
	public String getname()
	{
		return  name;
	}
	public int getid()
	{
		return  id;
	}
	public String getgender()
	{
		return  gender;
	}
	public int getstandard()
	{
		return  standard;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner n = new Scanner(System.in);
		Students obj = new Students();
		
		System.out.println("Enter the user name");
		obj.setname(n.next());
		
		System.out.println("Enter the user id");
		obj.setid(n.nextInt());
		
		System.out.println("Enter the user gender");
		obj.setgender(n.next());
		
		System.out.println("Enter the user standard");
		obj.setstandard(n.nextInt());
		
		
	}
}