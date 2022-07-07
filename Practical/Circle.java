/*
 *@ Author Akshay More
 */
package weekfour;

class Circle{
	 float radius ;
	 
	Circle()
	{
		radius = 1.5f ;
	}
	void show()
	{
		System.out.println("Radius of the circle:" + radius);
	}
	
	}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Circle r = new Circle ( );
   r.show();
	}
}
