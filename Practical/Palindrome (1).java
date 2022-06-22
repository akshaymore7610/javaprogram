class Palindrome{

public static void main(String [] args){

int i=121;
int rev =0;
while(i!=0)
{
     int t = i%10;
     rev = 10*rev + t;
     i = i/10;
}
if(rev == 121)
System.out.println(121+ "is palindrome Number");
else
System.out.println(121 + "is not a palindrome Number");

}
}
