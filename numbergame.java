package pack5;
import java.util.Scanner;
public class numbergame 
	{
	    Scanner sc=new Scanner(System.in);
	void guessing_generated_num()
	{
	     int generated_num=1+(int)(100*Math.random());
	     int no_of_attempts=10;
	     System.out.println("number game is started proceed now!!");
	     System.out.println("Guess the number between 1 to 100!!!");
	    for(int i=0;i<=no_of_attempts;i++)
	    {
	       int guess_num=sc.nextInt();
	         if(i>=7)
	         {
	            System.out.println("you are left with "+(no_of_attempts-i)+ "chances only");
	         }
	        if(guess_num<generated_num)
	        {
	            System.out.println("number guessed is lower than generated number.");
	            System.out.println("enter BIG NUMBER");
	        }
	        else if(guess_num>generated_num)
	        {
	            System.out.println("number guessed is higher than generated number.");
	            System.out.println("enter SMALL NUMBER ");
	           
	        }
	        else if(guess_num==generated_num)
	        {
	            System.out.println("Congrats!!!guessed number is correct!");
	            System.out.println("the number is: "+generated_num);
	             if(i<7)
	                {
	                    System.out.println("You have done a GREAT JOB with "+i+" attempts ");
	                    System.out.println("won the gift ");
	                }
	             else
	                {
	                    System.out.println("lost the gift as you took more attempts");
	                }
	             
	         break;
	        }
	        else if(i==no_of_attempts)
	        {
	           System.out.println("Sorryy.you have lost :( the generated number is: "+generated_num);
	            break;
	        }
	    }
	}
	public static void main(String []args)
	{
	 Scanner sc1=new Scanner(System.in);
	 numbergame obj=new numbergame();
	  obj.guessing_generated_num();
	 for(int i=0;i<=3;i++)
	 {
	    System.out.println("If you would love to play again....Press 1..If not press 0");
	    int chance=sc1.nextInt();
	    if(chance==1)
	    {
	        System.out.println("another chance is here!!");
	        obj.guessing_generated_num();
	    }
	    else
	    {
	    System.out.println("thankyou for your valuable time");
	    break;
	    }
	 }
	}
	}


