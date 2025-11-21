package userinput;

import java.util.Scanner;

public class studentmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj1=new Scanner(System.in);
		
			System.out.println("please enter the marks for English subject :\n");
	
		int english=obj1.nextInt();
			System.out.println("please enter the marks for Telugu subject:\n");
		
		int telugu=obj1.nextInt();
			System.out.println("please enter the marks for HIndi subject:\n");
		
		int hindi=obj1.nextInt();
			System.out.println("please enter the marks for Maths subject:\n");
		
		int maths=obj1.nextInt();
			System.out.println("please enter the marks for Science subject:\n");
		
		int science=obj1.nextInt();
			System.out.println("please enter the marks for Social subject:%n");
		
		int social=obj1.nextInt();
		
		int tmarks=(english+telugu+hindi+maths+science+social)/6;
	
	if(tmarks>=35 && tmarks<60)
		{
			System.out.println("You had ubtaind 3rd grade as your total % of marks are:  "+ tmarks);
		}
	else if(tmarks>=60 && tmarks<75)
		{
			System.out.println("You had ubtaind 2rd grade as your total % of marks are:  "+ tmarks);
		}
	else if(tmarks>=75 && tmarks<100)
	{
		System.out.println("You had ubtaind 1rd grade as your total % 0f marks are:  "+ tmarks);
	}
	
	else
	{
		System.out.println("please enter valid marks");
	}
	obj1.close();
	}
	

	
	}


