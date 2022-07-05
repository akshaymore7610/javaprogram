/*
 *@ Author Akshay More
 */
class Nastedswitch{

public static void main(String[] args){

char branch= 'e';
int year = 3;

switch(year)
{
case 1:
System.out.println("english,maths,science");
break;
case 2:
       switch(branch){
       case 'c':
       System.out.println("c++");
       break;
       case 'e':
       System.out.println("digital electronics");
       break;
       case 'm':
       System.out.println("mechanics");
       break;
       }
case 3:
       switch(branch){
       case 'c':
       System.out.println("java");
       break;
       case 'e':
       System.out.println("electronics device");
       break;
       case 'm':
       System.out.println("fundamentle of engineering");
       break;
       }
}
}
}
