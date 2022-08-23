/*
 *@ Author Akshay More
/*
package com.song;
import java.util.ArrayList;
public class ArrayListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("hitesh");
		list.add("chinmay");
		list.add("bhushan");
		list.add("kalpesh");
		list.add("sandesh");
		list.add("harshal");
		list.add("sahil");
//		System.out.println(list);
		System.out.println(list.get(0));
		list.set(6,"sushant");
	
		System.out.println(list);
		System.out.println(list.contains("rohit"));
		
		ArrayList<String> list1 =new ArrayList<String>();
		list1.add("hitesh");
		list1.add("chinmay");
		list1.add("kajal");
		list1.add("bhushan");
		list1.add("harshala");
		list1.add("namarata");
		list1.add("rutuja");
		list1.add("kalpesh");
		list.retainAll(list1);
		System.out.println(list);
	}

}