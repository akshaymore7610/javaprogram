/*
 *@Author Akshay More
 */
package weekeight;

Scanner sc = new Scanner(System.in);
		System.out.println("Enter one sentence: ");
		
		 int count = 0;  
		 String str = sc.nextLine();
		 
	        for (int i = 0; i < str.length(); i++) 
	        {   
	            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||
	            str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') 
	            {  
	                count++;  
	            }  
	        }  
	        System.out.println("Total number of punctuation characters exists in string: " + count);