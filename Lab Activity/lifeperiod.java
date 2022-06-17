public class lifeperiod {

	public static void main(String[] args) {

		
		int age =55;
		if (age>1 && age<11)
		{
			System.out.println("childhood");
		}
		else if (age>10 && age<=16) {
			System.out.println("childhood");
		}
		
		else if (age>16 && age<=19) {
			System.out.println("adolescence");
		}
		else if (age>19 && age<=24) {
			System.out.println("teenager");
		}
		else if (age>24 && age<=35) {
			System.out.println("young adult");
		}
		else if (age>35 && age<=45) {
			System.out.println("middle age");
		}
		else if (age>45 && age<=60) {
			System.out.println("late adult");
		}
		else {
			System.out.println("senior citizen");
		}
			

	}

}
