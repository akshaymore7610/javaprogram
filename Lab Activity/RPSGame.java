package weeksix;
/*
 * @Author Akshay More
 */
import java.util.Random;
import java.util.Scanner;
public class RPSGame {

		public static void main(String[] args) {
			System.out.println("Welcome to Rock:Paper:Scissor Game");
			System.out.println("enter 1 : ROCK \t2:PAPER\t 3:SCISSOR");
			Scanner sc=new Scanner(System.in);
			Random rd=new Random();
			int n=1;
			int count=0;
			int t = 0;
			while(n<=3){
			System.out.println("Your turn enter number");
			int user_input=sc.nextInt();
			switch(user_input){
				case 1:
				{ System.out.println("You select Rock");
				}break;
				
				case 2:{System.out.println("You select Paper");
				}break;
				case 3:
				{
					System.out.println("You select Scissor");
				}break;
			}
			System.out.println("Computer's turn ");
			int comp_input=rd.nextInt(3)+1;
			switch(comp_input){
				case 1:
				{ System.out.println("Computer select Rock");
				}break;
				
				case 2: {
					System.out.println("Computer select Paper");
				}break;
				case 3:{
					 System.out.println("Computer select Scissor");
				}break;
			}
			if(user_input==comp_input){
				System.out.println("Draw match");
			}
			else if((user_input==1&& comp_input==3)||(user_input==2 && comp_input==1)||(user_input==3 && comp_input==2))
			{
				System.out.println("Congratulations! You win the match");
			count++;
	}
	else {
			System.out.println("Computer Won the round");
			t++;
			}		
			
		n++;	
		
		}	
			System.out.println("Final Score your's "+count+ "computer's Score "+t);	
			
			}
		
	}