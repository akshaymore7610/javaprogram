/*
 * @Author Akshay More
 */
package weeksix;
interface ServlatAPI {
	void m1();

	void m2();

	void m3();

	default void m4() {
		System.out.println("default method");
	}

}

abstract class Tomcat implements ServlatAPI {
	public void m1() {
		System.out.println("m1");
	}

	public void m2() {
		System.out.println("m2");
	}

	public void m3() {
		System.out.println("m3");
	}

}

class SUBTomcat extends Tomcat {
	public void m3() {
		System.out.println("m3");
	}
}

public class Interface {

	public static void main(String[] args) {
		SUBTomcat st = new SUBTomcat();
		st.m3();
		st.m1();
		st.m2();
		st.m4();
	}

}