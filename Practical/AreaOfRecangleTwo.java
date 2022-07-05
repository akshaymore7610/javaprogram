/*
 *@ Author Akshay More
 */
package weekfour;

class Area{
	
	int length;
	int breadth;
	int arearecangle;
	
	public void calculateArea() {
		
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
		System.out.println("Area of Rectangle: " + length*breadth);
	}

}
public class Rectangle {

	public static void main(String[] args) {
		
		Area rectangle = new Area();
		
		rectangle.length = 5;
		rectangle.breadth = 10;
		
		rectangle.calculateArea();
		
	}

}