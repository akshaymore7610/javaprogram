package Akshay;

import java.util.Scanner;

public class LabEx {

		
	  public static void main(String[] args){
		  
	  System.out.println("Enter number");
	  @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	  int i=sc.nextInt();
	 
	  if(i%3==0 && i%5==0)
	  {
	   System.out.println("Good Morning");
	  }
	  else if(i%3==0)
	  {
	   System.out.println("Good");
	  }
	  else if(i%5==0)
	  {
		   System.out.println("Morning");
	  }
	  else
	  {
	   System.out.println(i);
	  }
	}
  }