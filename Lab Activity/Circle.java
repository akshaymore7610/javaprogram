                class Circle {
	float radius;
	float pi;
	Circle(){
		radius=1.5f;
	}
	Circle(float radius){
		this.radius=radius;
	}
	Circle(float radius,float pi) {
		this.pi=pi;
		this.radius=radius;
	}
	public void calculateCircleArea(float radius,float pi) {
		float calculateCircleArea=pi*radius*radius;
		System.out.println(calculateCircleArea);
	}
	public void calculateCircumference(float radius,float pi) {
		float calculateCircumference=2*pi*radius;
		System.out.println(calculateCircumference);
		
	}

}
public class Shape{
	public static void main(String []args) {
		Circle c=new Circle();
		c.calculateCircleArea(1.5f,3.5f);
		c.calculateCircumference(1.5f,3.5f);
		
		
	}
}
