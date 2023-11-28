package pack5;
import java.util.Scanner;
public class Gradecal {
	Scanner sc=new Scanner(System.in);
	   String meth(){
	    
	    System.out.println("enter the number of subjects");
	   int no_of_Subjects=sc.nextInt();
	    System.out.println("enter the Student marks of " +no_of_Subjects+ " subjects");
	    int marks[]=new int[no_of_Subjects];
	    int sum_of_totalmarks=0;
	    for(int i=0;i<marks.length;i++){
	        
	       marks[i]=sc.nextInt();
	       
	       sum_of_totalmarks+=marks[i];
	    }
	    System.out.println("The total marks obtained are:"+sum_of_totalmarks);
	    
	    int avg_percentage=(sum_of_totalmarks/no_of_Subjects);
	    System.out.println("The average percentage marks obtained are:"+avg_percentage+"%");
	    
	    if(avg_percentage>=95)
	      return "A+";
	    else if(avg_percentage>=80 && avg_percentage<95)
	    return "A";
	    else if(avg_percentage>=70 && avg_percentage<80)
	    return "B+";
	    else if(avg_percentage>=65 && avg_percentage<70)
	    return "B";
	    else if(avg_percentage>=60 && avg_percentage<65)
	    return "C";
	    else
	      return "F";
	    }
	     public static void main(String[] args){
	      String Grade=new Gradecal().meth();
	      System.out.println("Grade:"+Grade);
	}
	    
	}


