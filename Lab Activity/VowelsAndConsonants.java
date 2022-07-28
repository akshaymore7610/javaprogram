*
 * @ Author Akshay More
 */
package weekeight;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		
		 //Counter variable to store the count of vowels and consonant    
        int vowels = 0, conso = 0;    
               Scanner sc = new Scanner(System.in);
                System.out.println("Enter Sentence to Count Vowels And Consonants");
        String str = sc.nextLine();       
        str = str.toLowerCase();   
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                   
                vowels++;    
            }      
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {         
                conso++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowels);    
        System.out.println("Number of consonants: " + conso);    

	}

}
