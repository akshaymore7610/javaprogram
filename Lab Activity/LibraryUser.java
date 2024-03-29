/*
 *@ Author Akshay More
 */
interface LibraryU{
	public void registeraccount();
	public void requestbook();
}
	class Kidsuser implements LibraryU{
		int age;
		String booktype;
		public void registeraccount(int age) {
			if(age<12) {
				System.out.println("You have successfully registered under a Kids Account");
			}
			else {
				System.out.println("Sorry, Age must be less than 12 to register as a kid");
			}
		}
		public void requestbook(String booktype) {
			if(booktype ==("kids")) {
				System.out.println("Book Issued successfully, please return the book within 10 days");
			}
			else {
				System.out.println("Oops, you are alowed to take only kids books");
			}
		}
	}
	class AdultUser implements LibraryU{
		int age;
		String booktype;
		public void registeraccount(int age) {
			if(age>12) {
				System.out.println("You have successfully registered under an Adult Account");
			}
			else {
				System.out.println("Sorry, Age must be greater than 12 to register as an adult");
			}
		}
		public void requestbook(String booktype) {
			if(booktype==("fiction")) {
				System.out.println("Book Issued successfully, please return the book within 7 days");
			}
			else {
				System.out.println("Oops, you are allowed to take only adult Fiction books");
			}
		}
		
	}
	


public class LibraryUser {
	public static void main(String[] args) {
		Kidsuser k=new Kidsuser();
		k.registeraccount(10);
		k.registeraccount(18);
		
		k.requestbook("kids");
		k.requestbook("fiction");
		System.out.println();
//	<---------------Adult section---------->	
		AdultUser a=new AdultUser();
		a.registeraccount(5);
		a.registeraccount(23);
		
		a.requestbook("kids");
		a.requestbook("fiction");
		
		
	}

}
